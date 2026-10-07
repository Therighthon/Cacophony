package com.therighthon.cacophony.client;

import net.minecraft.util.Mth;

public class Noise1D
{
    private final long seed;
    private final double maxAmplitude;
    private final int cycleLength;

    public Noise1D(long seed, double maxAmplitude, int cycleLength)
    {
        this.seed = seed;
        this.maxAmplitude = maxAmplitude;
        this.cycleLength = cycleLength;
    }

    // Scale volume of wind sounds over time to make it sound gusty instead of droning
    // Supports multiple octaves, first octave is squared
    public double windGustNoise(long t, int octaves)
    {
        int length = cycleLength;
        double volume = 0;
        double scale = 1.0;

        for (int oct = octaves; oct >= 1; oct--)
        {
            // Divide by cycle length to modulate the frequency of the noise function, cycle length = distance between random nodes
            final long t0 = (t / length);
            final long t1 = t0 + 1;

            // Get random value between -1, 1
            double n0 = hashLongToDouble(t0 + seed);
            double n1 = hashLongToDouble(t1 + seed);


            // For the first octave only, square values so that averages are lower
            // Also moves to range 0 to 1
            if (oct == octaves)
            {
                n0 *= n0;
                n1 *= n1;
            }

            volume += scale * Mth.map(t, t0 * length, t1 * length, n0, n1);

            length /= 2;
            scale /= 2.0;
        }

        // Sample from point in cycle, range is approximately 0-1, but can overflow in either direction due to multiple octaves
        return volume;
    }

    // Function n(t)
    // Very simple, single octave noise function
    // Generate random values at points over a certain frequency
    // Connect with a line, this doesn't even need to be a polynomial
    public double noise(long t)
    {
        // Divide by cycle length to modulate the frequency of the noise function, cycle length = distance between random nodes
        final long t0 = (t / cycleLength);
        final long t1 = t0 + 1;

        // Get random value between -1, 1
        double n0 = hashLongToDouble(t0 + seed);
        double n1 = hashLongToDouble(t1 + seed);

        // Then scale based on this sound's weight
        return (maxAmplitude * Mth.map(t, t0 * cycleLength, t1 * cycleLength, n0, n1));
    }

    public int discreteNoise(long t)
    {
        return (int) noise(t);
    }

    // Takes a long, and shuffles it into a double in range 1, -1
    public static double hashLongToDouble(long in)
    {
        long x = mix64(in);
        return (x >>> 11) * 0x1.0p-53;
    }

    public static long mix64(long x)
    {
        x ^= x >>> 33;
        x *= 0xff51afd7ed558ccdL;
        x ^= x >>> 33;
        x *= 0xc4ceb9fe1a85ec53L;
        x ^= x >>> 33;
        return x;
    }
}

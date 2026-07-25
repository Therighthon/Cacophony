package com.therighthon.cacophony.common;

import net.minecraft.util.Mth;

public class Noise1D
{
    private final long seed, maxAmplitude, cycleLength;

    public Noise1D(long seed, int maxAmplitude, int cycleLength)
    {
        this.seed = seed;
        this.maxAmplitude = maxAmplitude;
        this.cycleLength = cycleLength;
    }

    // Function n(t)
    // Very simple, single octave noise function
    // Generate random values at points over a certain frequency
    // Connect with a line, this doesn't even need to be a polynomial
    public int noise(long t)
    {
        // Divide by cycle length to modulate the frequency of the noise function, cycle length = distance between random nodes
        final long t0 = (t / cycleLength);
        final long t1 = t0 + 1;

        // Get random value between -1, 1
        final double n0 = hashLongToDouble(t0 + seed);
        final double n1 = hashLongToDouble(t1 + seed);


        // Then scale based on this sound's weight
        return (int) (maxAmplitude * Mth.map(t, t0 * cycleLength, t1 * cycleLength, n0, n1));
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

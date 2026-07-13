package com.therighthon.cacophony.common;

import net.dries007.tfc.util.climate.KoppenClimateClassification;

public enum KoppenClasses
{
    AF(KoppenClimateClassification.AF, 21, 40, 150, 500, -0.5f, 0.5f),
    AM(KoppenClimateClassification.AM, 21, 40, 350, 500, 0.7f, 1), // Not an exact match of TFC classification
    AW(KoppenClimateClassification.AW, 21, 40, 150, 500, 0.5f, 1),
    AS(KoppenClimateClassification.AS, 21, 40, 150, 500, -1, -0.5f),
    BWH(KoppenClimateClassification.BWH, 18, 40, 0, 75, -1, 1),
    BWK(KoppenClimateClassification.BWK, -12, 18, 0, 75, -1, 1),
    BSH(KoppenClimateClassification.BSH, 18, 40, 75, 150, -1, 1),
    BSK(KoppenClimateClassification.BSK, -12, 18, 75, 150, -1, 1),
    CSA(KoppenClimateClassification.CSA, 17, 21, 150, 500, -1, -0.5f),
    CSB(KoppenClimateClassification.CSB, 12, 17, 150, 500, -1, -0.5f),
    CSC(KoppenClimateClassification.CSC, 8, 12, 150, 500, -1, -0.5f),
    CWA(KoppenClimateClassification.CWA, 17, 21, 150, 500, 0.5f, 1),
    CWB(KoppenClimateClassification.CWB, 12, 17, 150, 500, 0.5f, 1),
    CWC(KoppenClimateClassification.CWC, 8, 12, 150, 500, 0.5f, 1),
    CFA(KoppenClimateClassification.CFA, 17, 21, 150, 500, -0.5f, 0.5f),
    CFB(KoppenClimateClassification.CFB, 12, 17, 150, 500, -0.5f, 0.5f),
    CFC(KoppenClimateClassification.CFC, 8, 12, 150, 500, -0.5f, 0.5f),
    DSA(KoppenClimateClassification.DSA, 3, 8, 150, 500, -1, -0.5f),
    DSB(KoppenClimateClassification.DSB, -2, 3, 150, 500, -1, -0.5f),
    DSC(KoppenClimateClassification.DSC, -8, -2, 150, 500, -1, -0.5f),
    DSD(KoppenClimateClassification.DSD, -12, -8, 150, 500, -1, -0.5f),
    DWA(KoppenClimateClassification.DWA, 3, 8, 150, 500, 0.5f, 1),
    DWB(KoppenClimateClassification.DWB, -2, 3, 150, 500, 0.5f, 1),
    DWC(KoppenClimateClassification.DWC, -12, -8, 150, 500, 0.5f, 1),
    DWD(KoppenClimateClassification.DWD, -12, -8, 150, 500, 0.5f, 1),
    DFA(KoppenClimateClassification.DFA, 3, 8, 150, 500, -0.5f, 0.5f),
    DFB(KoppenClimateClassification.DFB, -2, 3, 150, 500, -0.5f, 0.5f),
    DFC(KoppenClimateClassification.DFC, -12, -8, 150, 500, -0.5f, 0.5f),
    DFD(KoppenClimateClassification.DFD, -12, -8, 150, 500, -0.5f, 0.5f),
    ET(KoppenClimateClassification.ET, -17, -12, 0, 500, -1, 1), // Not an exact match of TFC classification
    EF(KoppenClimateClassification.EF, -30, -17, 0, 500, -1, 1); // Not an exact match of TFC classification

    private final KoppenClimateClassification classification;
    private final float minTemp, maxTemp, minRain, maxRain, minRainVar, maxRainVar;

    KoppenClasses(KoppenClimateClassification classification, float minTemp, float maxTemp, float minRain, float maxRain, float minRainVar, float maxRainVar)
    {
        this.classification = classification;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.minRain = minRain;
        this.maxRain = maxRain;
        this.minRainVar = minRainVar;
        this.maxRainVar = maxRainVar;
    }

    public KoppenClimateClassification getClassification()
    {
        return classification;
    }

    public float getMaxRainVar()
    {
        return maxRainVar;
    }

    public float getMinRainVar()
    {
        return minRainVar;
    }

    public float getMaxRain()
    {
        return maxRain;
    }

    public float getMinRain()
    {
        return minRain;
    }

    public float getMaxTemp()
    {
        return maxTemp;
    }

    public float getMinTemp()
    {
        return minTemp;
    }
}

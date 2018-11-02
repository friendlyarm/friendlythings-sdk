package com.friendlyarm.FriendlyThings;

public class BoardType {
    /* getBoardType return value: */
    public static final int S3C6410_COMMON = 6410;
    public static final int S5PV210_COMMON = 210;
    public static final int S5P4412_COMMON = 4412;

    //s5p4418
    public static final int S5P4418_BASE = 4418;
    public static final int NanoPi2 = S5P4418_BASE+0;
    public static final int NanoPC_T2 = S5P4418_BASE+1;
    public static final int NanoPi_S2 = S5P4418_BASE+2;
    public static final int Smart4418 = S5P4418_BASE+3;
    public static final int NanoPi2_Fire = S5P4418_BASE+4;
    public static final int NanoPi_M2 = S5P4418_BASE+5;
    public static final int NanoPi_M2A = S5P4418_BASE+7;
    public static final int Smart4418SDK = S5P4418_BASE+0x103;
    public static final int S5P4418_MAX = Smart4418SDK;

    //s5p6818
    public static final int S5P6818_BASE = 6818;
    public static final int NanoPC_T3 = S5P6818_BASE+1;
    public static final int NanoPi_M3B = S5P6818_BASE+2;
    public static final int Smart6818 = S5P6818_BASE+3;
    public static final int NanoPC_T3T = S5P6818_BASE+4;
    public static final int NanoPi_Fire3 = S5P6818_BASE+5;
    public static final int NanoPi_M3 = S5P6818_BASE+7;
    public static final int S5P6818_MAX = NanoPi_M3;

    //s3c2451
    public static final int S3C2451_BASE = 2451;
    public static final int S3C2451_COMMON = S3C2451_BASE+0;

    //allwinner
    public static final int ALLWINNER_BASE = 7000;
    public static final int NanoPi_M1 = ALLWINNER_BASE+1;
    public static final int NanoPi_NEO = ALLWINNER_BASE+2;
    public static final int NanoPi_NEO_Air = ALLWINNER_BASE+3;
    public static final int NanoPi_M1_Plus = ALLWINNER_BASE+4;
    public static final int NanoPi_A64 = ALLWINNER_BASE+5;
    public static final int NanoPi_NEO2 = ALLWINNER_BASE+6;
    public static final int NanoPi_M1_Plus2 = ALLWINNER_BASE+7;
    public static final int NanoPi_NEO_Plus2 = ALLWINNER_BASE+8;
    public static final int NanoPi_NEO_Core = ALLWINNER_BASE+9;
    public static final int NanoPi_Duo = ALLWINNER_BASE+10;
    public static final int NanoPi_NEO_Core2 = ALLWINNER_BASE+11;
    public static final int NanoPi_K1 = ALLWINNER_BASE+12;
    public static final int NanoPi_K1_Plus = ALLWINNER_BASE+13;
    public static final int NanoPi_Hero = ALLWINNER_BASE+14;
    public static final int NanoPi_Duo2 = ALLWINNER_BASE+15;
    public static final int ALLWINNER_MAX = NanoPi_Duo2;

    //amlogic
    public static final int AMLOGIC_BASE = (8000);
    public static final int NanoPi_K2 = AMLOGIC_BASE+1;

    //rk3399
    public static final int RK3399_BASE = (9000);
    public static final int NanoPC_T4 = RK3399_BASE+1;
    public static final int NanoPi_M4 = RK3399_BASE+2;
    public static final int NanoPi_NEO4 = RK3399_BASE+3;
    public static final int RK3399_MAX = NanoPi_NEO4;
}
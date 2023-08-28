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
    public static final int Smart4418SDK = S5P4418_BASE+8;
    public static final int SOM_4418 = S5P4418_BASE+9;
    public static final int S5P4418_MAX = SOM_4418;

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
    public static final int NanoPi_R1 = ALLWINNER_BASE+16;
    public static final int NanoPi_C3 = ALLWINNER_BASE+17;
    public static final int NanoPi_NEO2_Black = ALLWINNER_BASE+18;
    public static final int NanoPi_NEO_S = ALLWINNER_BASE+19;
    public static final int ZeroPi = ALLWINNER_BASE+20;
    public static final int NanoPi_R1S_H3 = ALLWINNER_BASE+21;
    public static final int NanoPi_R1S_H5 = ALLWINNER_BASE+22;
    public static final int ALLWINNER_MAX = NanoPi_R1S_H5;

    //amlogic
    public static final int AMLOGIC_BASE = 8000;
    public static final int NanoPi_K2 = AMLOGIC_BASE+1;

    //rk3399
    public static final int RK3399_BASE = 9000;
    public static final int NanoPC_T4 = RK3399_BASE+1;
    public static final int NanoPi_M4 = RK3399_BASE+2;
    public static final int NanoPi_NEO4 = RK3399_BASE+3;
    public static final int SOM_RK3399 = RK3399_BASE+4;
    public static final int NanoPi_M4v2 = RK3399_BASE+5;
    public static final int NanoPi_M4B = RK3399_BASE+6;
    public static final int SOM_RK3399v2 = RK3399_BASE+7;
    public static final int NanoPi_NEO4v2 = RK3399_BASE+8;
    public static final int NanoPi_R4S = RK3399_BASE+9;
    public static final int NanoPC_T4B = RK3399_BASE+10;
    public static final int NanoPi_R4S_Plus = RK3399_BASE+11;
    public static final int NanoPi_R4SE = RK3399_BASE+12;
    public static final int RK3399_MAX = NanoPi_R4SE;

    //rk3328
    public static final int RK3328_BASE = 9500;
    public static final int NanoPi_R2S = RK3328_BASE+1;
    public static final int NanoPi_NEO3_Black = RK3328_BASE+2;
    public static final int NanoPi_NEO3_S = RK3328_BASE+3;
    public static final int NanoPi_NEO3 = RK3328_BASE+4;
    public static final int NanoPi_R2Pro = RK3328_BASE+5;
    public static final int NanoPi_R2C = RK3328_BASE+6;
    public static final int NanoPi_R2C_Plus = RK3328_BASE+7;
    public static final int NanoPi_R2S_Plus = RK3328_BASE+8;
    public static final int Core3328 = RK3328_BASE+9;
    public static final int RK3328_MAX = Core3328;

    //rk3568
    public static final int RK3568_BASE = 9600;
    public static final int NanoPi_R5S = RK3568_BASE+1;
    public static final int NanoPi_R5C = RK3568_BASE+2;
    public static final int NanoPi_R5S_LTS = RK3568_BASE+3;
    public static final int RK3568_MAX = NanoPi_R5S_LTS;

    //rk3588
    public static final int RK3588_BASE = 9700;
    public static final int NanoPi_R6S = RK3588_BASE+1;
    public static final int NanoPC_T6 = RK3588_BASE+2;
    public static final int NanoPi_R6C = RK3588_BASE+3;
    public static final int RK3588_MAX = NanoPi_R6C;
}
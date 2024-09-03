package com.work.libtest;

public class CalibrationHelper {
    //code for types of calibration
    final static int accelerationCalibration = 0;
    final static int magnetometerCalibration = 1;

    //data for probe 8034
//    static double[] acc_A = {0.011937163773, 0.012893257924, -0.003116180897};
//    static double[][] acc_B = {{1.013031588232, -0.000458104561, -0.017655963792},
//                        {-0.000221817802, 0.985095126590, -0.014332862531},
//                        {0.002202949423, 0.000121806810, 1.014644287382}};
//    static double[] acc_C = {-0.003631197768, -0.000071014301, -0.001783092792};
//
//    static double[] mag_A = {5.138598318156, 3.830340637517, 0.419114553441};
//    static double[][] mag_B = {{1.031963616381, 0.007417369502, -0.010468026784},
//                        {-0.007523345738, 1.023504192373, 0.001960296904},
//                        {-0.020739056408, 0.001083074780, 1.068824759828}};
//    static double[] mag_C = {0.000000348296 ,0.000000367740, 0.000000178983};
//
//    static double[] temp_param = {32.0000000000, 0.9500000000};
    /**
     * Store known calibration data to make everything a bit quicker
     */
//    private static volatile byte[] cal_data_8034 = {1, 0, 8, 1, 105, 4, -81, 2, 111, 89, 20, 16, 1, 91, 1, 16, 4, -81, 2, 111, 89, 32, -100, -84, 1, 63, -16, 53, 96, -100, 84, 90, -27, -65, 62, 5, -72, 27, 29, 27, -124, -65, -110, 20, 103, -84, 67, -29, 26, -65, 45, 18, -8, 105, -10, -69, 114, 63, -17, -123, -26, 55, 4, -27, -38, -65, -115, 90, -116, 62, -95, 103, 109, 63, 98, 11, -21, 119, 49, -19, -20, 63, 31, -18, 81, 16, -65, 81, -86, 63, -16, 59, -5, -91, -10, 23, -61, 2, 63, -120, 114, -125, 0, 24, 122, 62, 0, 0, 0, 0, 0, 0, 0, 0, 63, -118, 103, -57, -56, -9, -85, -61, 0, 0, 0, 0, 0, 0, 0, 0, -65, 105, -121, 26, -31, 74, -1, -12, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 0, 59, 93, -12, -67, 70, 61, -65, 109, -65, 44, 117, 26, 26, 123, -65, 18, -99, -80, 100, -102, 26, -8, -65, 93, 54, -43, 78, -103, -61, 89, 48, -100, -84, 1, 63, -16, -126, -20, 71, -16, 68, 6, 63, 126, 97, -84, -10, -17, 98, -69, -65, -123, 112, 66, -59, -117, 40, -46, -65, 126, -48, -52, -66, 110, 24, -11, 63, -16, 96, 69, -18, -104, -8, 36, 63, 96, 15, 10, 98, -2, -98, -54, -65, -107, 60, -98, -124, 20, -96, 98, 63, 81, -66, -66, -80, -77, 111, -22, 63, -15, 25, -25, -3, -55, -44, -84, 2, 64, 20, -115, -20, -73, -81, 12, -40, 0, 0, 0, 0, 0, 0, 0, 0, 64, 14, -92, -119, -95, -43, 100, 96, 0, 0, 0, 0, 0, 0, 0, 0, 63, -38, -46, -59, -39, 19, -67, 84, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 0, 59, 93, -12, -67, 70, 61, 62, -105, 95, -84, 112, 51, -106, -59, 62, -104, -83, -71, -79, 77, 57, 1, 62, -120, 5, -45, 11, 86, 103, -5, 64, 18, 1, 2, 64, 64, 0, 0, 0, 0, 0, 0, 63, -18, 102, 102, 102, 102, 102, 98, 0, 2, -58, -12, 0, 0, 0};
    private static volatile byte[] cal_data_8034 = {1,0,8,1,105,4,-81,2,111,89,20,16,1,91,1,16,4,-81,2,111,89,32,-100,-84,1,63,-16,53,96,-100,84,90,-27,-65,62,5,-72,27,29,27,-124,-65,-110,20,103,-84,67,-29,26,-65,45,18,-8,105,-10,-69,114,63,-17,-123,-26,55,4,-27,-38,-65,-115,90,-116,62,-95,103,109,63,98,11,-21,119,49,-19,-20,63,31,-18,81,16,-65,81,-86,63,-16,59,-5,-91,-10,23,-61,2,63,-120,114,-125,0,24,122,62,0,0,0,0,0,0,0,0,63,-118,103,-57,-56,-9,-85,-61,0,0,0,0,0,0,0,0,-65,105,-121,26,-31,74,-1,-12,0,0,0,0,0,0,0,0,1,64,0,59,93,-12,-67,70,61,-65,109,-65,44,117,26,26,123,-65,18,-99,-80,100,-102,26,-8,-65,93,54,-43,78,-103,-61,89,48,-100,-84,1,63,-16,-126,-20,71,-16,68,6,63,126,97,-84,-10,-17,98,-69,-65,-123,112,66,-59,-117,40,-46,-65,126,-48,-52,-66,110,24,-11,63,-16,96,69,-18,-104,-8,36,63,96,15,10,98,-2,-98,-54,-65,-107,60,-98,-124,20,-96,98,63,81,-66,-66,-80,-77,111,-22,63,-15,25,-25,-3,-55,-44,-84,2,64,20,-115,-20,-73,-81,12,-40,0,0,0,0,0,0,0,0,64,14,-92,-119,-95,-43,100,96,0,0,0,0,0,0,0,0,63,-38,-46,-59,-39,19,-67,84,0,0,0,0,0,0,0,0,1,64,0,59,93,-12,-67,70,61,62,-105,95,-84,112,51,-106,-59,62,-104,-83,-71,-79,77,57,1,62,-120,5,-45,11,86,103,-5,64,18,1,2,64,64,0,0,0,0,0,0,63,-18,102,102,102,102,102,98,0,2,-58,-12,0,0,0,0,0,0,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
//    private static volatile byte[] cal_data_8034 = {01, 00, 8, 01, 69, 04, , 02, 6F, 59, 14, 10, 01, 5B, 01, 10, 04, AF, 02, 6F, 59, 20, 9C, AC, 01, 3F, F0, 35, 60, 9C, 54, 5A, E5, BF, 3E, 05, B8, 1B, 1D, 1B, 84, BF, 92, 14, 67, AC, 43, E3, 1A, BF, 2D, 12, F8, 69, F6, BB, 72, 3F, EF, 85, E6, 37, 04, E5, DA, BF, 8D, 5A, 8C, 3E, A1, 67, 6D, 3F, 62, 0B, EB, 77, 31, ED, EC, 3F, 1F, EE, 51, 10, BF, 51, AA, 3F, F0, 3B, FB, A5, F6, 17, C3, 02, 3F, 88, 72, 83, 00, 18, 7A, 3E, 00, 00, 00, 00, 00, 00, 00, 00, 3F, 8A, 67, C7, C8, F7, AB, C3, 00, 00, 00, 00, 00, 00, 00, 00, BF, 69, 87, 1A, E1, 4A, FF, F4, 00, 00, 00, 00, 00, 00, 00, 00, 01, 40, 00, 3B, 5D, F4, BD, 46, 3D, BF, 6D, BF, 2C, 75, 1A, 1A, 7B, BF, 12, 9D, B0, 64, 9A, 1A, F8, BF, 5D, 36, D5, 4E, 99, C3, 59, 30, 9C, AC, 01, 3F, F0, 82, EC, 47, F0, 44, 06, 3F, 7E, 61, AC, F6, EF, 62, BB, BF, 85, 70, 42, C5, 8B, 28, D2, BF, 7E, D0, CC, BE, 6E, 18, F5, 3F, F0, 60, 45, EE, 98, F8, 24, 3F, 60, 0F, 0A, 62, FE, 9E, CA, BF, 95, 3C, 9E, 84, 14, A0, 62, 3F, 51, BE, BE, B0, B3, 6F, EA, 3F, F1, 19, E7, FD, C9, D4, AC, 02, 40, 14, 8D, EC, B7, AF, 0C, D8, 00, 00, 00, 00, 00, 00, 00, 00, 40, 0E, A4, 89, A1, D5, 64, 60, 00, 00, 00, 00, 00, 00, 00, 00, 3F, DA, D2, C5, D9, 13, BD, 54, 00, 00, 00, 00, 00, 00, 00, 00, 01, 40, 00, 3B, 5D, F4, BD, 46, 3D, 3E, 97, 5F, AC, 70, 33, 96, C5, 3E, 98, AD, B9, B1, 4D, 39, 01, 3E, 88, 05, D3, 0B, 56, 67, FB, 40, 12, 01, 02, 40, 40, 00, 00, 00, 00, 00, 00, 3F, EE, 66, 66, 66, 66, 66, 62, 00, 02, C6, F4, 00, 00, 00, 00, 00, 00, 00};
    private static volatile double[] known_cal = {8034};

    public static byte[] get8034() {
        return cal_data_8034;
    }

    public static double[] getKnownCal() {
        return known_cal;
    }


    static byte[] binCalData; // = {1, 0, 8, 1, 105, 4, -81, 2, 111, 89, 20, 16, 1, 91, 1, 16, 4, -81, 2, 111, 89, 32, -100, -84, 1, 63, -16, 53, 96, -100, 84, 90, -27, -65, 62, 5, -72, 27, 29, 27, -124, -65, -110, 20, 103, -84, 67, -29, 26, -65, 45, 18, -8, 105, -10, -69, 114, 63, -17, -123, -26, 55, 4, -27, -38, -65, -115, 90, -116, 62, -95, 103, 109, 63, 98, 11, -21, 119, 49, -19, -20, 63, 31, -18, 81, 16, -65, 81, -86, 63, -16, 59, -5, -91, -10, 23, -61, 2, 63, -120, 114, -125, 0, 24, 122, 62, 0, 0, 0, 0, 0, 0, 0, 0, 63, -118, 103, -57, -56, -9, -85, -61, 0, 0, 0, 0, 0, 0, 0, 0, -65, 105, -121, 26, -31, 74, -1, -12, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 0, 59, 93, -12, -67, 70, 61, -65, 109, -65, 44, 117, 26, 26, 123, -65, 18, -99, -80, 100, -102, 26, -8, -65, 93, 54, -43, 78, -103, -61, 89, 48, -100, -84, 1, 63, -16, -126, -20, 71, -16, 68, 6, 63, 126, 97, -84, -10, -17, 98, -69, -65, -123, 112, 66, -59, -117, 40, -46, -65, 126, -48, -52, -66, 110, 24, -11, 63, -16, 96, 69, -18, -104, -8, 36, 63, 96, 15, 10, 98, -2, -98, -54, -65, -107, 60, -98, -124, 20, -96, 98, 63, 81, -66, -66, -80, -77, 111, -22, 63, -15, 25, -25, -3, -55, -44, -84, 2, 64, 20, -115, -20, -73, -81, 12, -40, 0, 0, 0, 0, 0, 0, 0, 0, 64, 14, -92, -119, -95, -43, 100, 96, 0, 0, 0, 0, 0, 0, 0, 0, 63, -38, -46, -59, -39, 19, -67, 84, 0, 0, 0, 0, 0, 0, 0, 0, 1, 64, 0, 59, 93, -12, -67, 70, 61, 62, -105, 95, -84, 112, 51, -106, -59, 62, -104, -83, -71, -79, 77, 57, 1, 62, -120, 5, -45, 11, 86, 103, -5, 64, 18, 1, 2, 64, 64, 0, 0, 0, 0, 0, 0, 63, -18, 102, 102, 102, 102, 102, 98, 0, 2, -58, -12, 0, 0, 0};

    static byte[] pass_binCalData = {};

    static double[] acc_A = {0, 0, 0};
    static double[][] acc_B = {{0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};
    static double[] acc_C = {0, 0, 0};

    static double[] mag_A = {0, 0, 0};
    static double[][] mag_B = {{0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}};
    static double[] mag_C = {0 ,0, 0};

    static double[] temp_param = {0, 0};

    public static double[] CalibrationHelp(int calibrationType, double ux, double uy, double uz) {
        double[] returnValue = {0, 0, 0};
        switch (calibrationType) {
            case accelerationCalibration:
                returnValue[0] = acc_A[0] + (acc_B[0][0] * ux) + (acc_B[0][1] * uy) + (acc_B[0][2] * uz) + (acc_C[0] * ux * ux * ux); //dont really get why there are uy and uz in this but?
                returnValue[1] = acc_A[1] + (acc_B[1][0] * ux) + (acc_B[1][1] * uy) + (acc_B[1][2] * uz) + (acc_C[1] * uy * uy * uy);
                returnValue[2] = acc_A[2] + (acc_B[2][0] * ux) + (acc_B[2][1] * uy) + (acc_B[2][2] * uz) + (acc_C[2] * uz * uz * uz);
                break;
            case magnetometerCalibration:
                returnValue[0] = mag_A[0] + (mag_B[0][0] * ux) + (mag_B[0][1] * uy) + (mag_B[0][2] * uz) + (mag_C[0] * ux * ux * ux); //dont really get why there are uy and uz in this but?
                returnValue[1] = mag_A[1] + (mag_B[1][0] * ux) + (mag_B[1][1] * uy) + (mag_B[1][2] * uz) + (mag_C[1] * uy * uy * uy);
                returnValue[2] = mag_A[2] + (mag_B[2][0] * ux) + (mag_B[2][1] * uy) + (mag_B[2][2] * uz) + (mag_C[2] * uz * uz * uz);
                break;
        }
        return returnValue;
    }
}

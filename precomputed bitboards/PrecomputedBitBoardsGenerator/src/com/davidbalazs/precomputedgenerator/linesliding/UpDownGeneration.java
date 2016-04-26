package com.davidbalazs.precomputedgenerator.linesliding;

/**
 * Created by David on 3/2/2016.
 */

public class UpDownGeneration {
    private static final long FILE_A = 0x0101010101010101L;
    private static final long FILE_B = 0x0202020202020202L;
    private static final long FILE_H = 0x8080808080808080L;
    private static final long FILE_G = 0x4040404040404040L;
    private static final long RANK_8 = 0xff00000000000000L;
    private static final long RANK_1 = 0x00000000000000ffL;
    private static final long RANK_4 = 0x00000000ff000000L;
    private static final long RANK_5 = 0x000000ff00000000L;

    public static void main(String[] args) {
//        for (int i = 0; i < 8; i++) {
//            System.out.println(0 + "L,");
//        }

        for (int i = 0; i < 64; i++) {
            long finalBitboard = 0;
            long currentPosition = 1L << i;
            long oneMove = currentPosition >>> 7;
            if ((currentPosition & FILE_H) == 0 && (currentPosition & RANK_1) == 0) {
                while ((oneMove & FILE_H) == 0 && (oneMove & RANK_1) == 0 && oneMove != 0) {
                    finalBitboard = finalBitboard | oneMove;
                    oneMove = oneMove >>> 7;
                }

                finalBitboard = finalBitboard | oneMove;
            }
            System.out.println(finalBitboard + "L,");
        }
    }
}


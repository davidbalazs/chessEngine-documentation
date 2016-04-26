package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
//        File file = new File("kingPrecomputedBitboards.txt");
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            String[] bitboardStringVector = new String[8];
//            for (int i = 0; i < 60; i++) {
//                for (int j = 0; j < 8; j++) {
//                    line = br.readLine();
//                    bitboardStringVector[j] = line;
//                    if (line.length() != 8) {
//                        System.err.println("Somewhere in bitboard " + i + " there is a line with more than 8 numbers: line no " + j);
//                    }
//                }
//
//                //convert the bitboard
//                String bitboardString = "";
//                for (int j = 7; j >= 0; j--) {
//                    bitboardString += bitboardStringVector[j];
//                }
//                System.out.println(Long.parseLong(new StringBuilder(bitboardString).reverse().toString(), 2)+"L,");
//
//                line = br.readLine();
//                if (line != null && line.contains("0")) {
//                    System.err.println("Somewhere near bitboard " + i + " is not blank line between bitboards.");
//                }
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
       // System.out.println(Long.toBinaryString(0xffffffffffffffL));
        long x=-4593460513685372928L;
        System.out.println(x+"L,");
        System.out.println(Long.toBinaryString(x));
    }
}

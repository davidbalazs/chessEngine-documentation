package com.davidbalazs.precomputedgenerator.linesliding.model;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2/25/2016.
 */
public class LineBitboards {

    public List<Long> initBitboards() {
        List<Long> bitboards = new ArrayList<>();

        //init for left
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000000000", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000000001", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000000011", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000000111", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000001111", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000011111", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000111111", 2));
        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000001111111", 2));


        //init for right
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011111110", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011111100", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011111000", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011110000", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011100000", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000011000000", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000010000000", 2));
//        bitboards.add(Long.parseLong("0000000000000000000000000000000000000000000000000000000000000000", 2));

        return bitboards;
    }

    public List<Long> shift(int i, List<Long> bitboards) {
        List<Long> newBits = new ArrayList<>();
        for (Long bitboard : bitboards) {
            newBits.add(bitboard << i);
        }
        return newBits;
    }

    public void display(List<Long> bitboards) {
        for (Long bitboard : bitboards) {
            System.out.println(bitboard + "L,");
        }
    }
}

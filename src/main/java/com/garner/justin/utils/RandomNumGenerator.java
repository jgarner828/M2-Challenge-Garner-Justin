package com.garner.justin.utils;

import java.util.Random;

public class RandomNumGenerator {

    public static int generateRandom(int limit) {
        Random random = new Random();
        return random.nextInt(limit) +1;
    }

}

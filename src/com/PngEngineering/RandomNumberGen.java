package com.PngEngineering;

import java.util.Random;

public class RandomNumberGen {

    public static int getRandomNumber() {
        return new Random().nextInt();
    }

    public int getRandomNumber(int limit) {
        return new Random().nextInt(limit);
    }

}

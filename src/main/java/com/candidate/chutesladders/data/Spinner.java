package com.candidate.chutesladders.data;

public class Spinner {

    public static int spin(){
        int number = (int)Math.floor(Math.random() * 6) + 1;
        return number;
    }
}

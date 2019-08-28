package com.candidate.chutesladders.data.collections;

import com.candidate.chutesladders.data.Chute;

import java.util.HashMap;
import java.util.Map;

public class ChuteCollection implements IEntityCollection<Chute> {
    private static Map<Integer, Chute> chutes = new HashMap<>();

    public void add(Chute c){
        chutes.put(c.getStart(), c);
    }

    public static Map<Integer, Chute> getChutes() {
        return chutes;
    }

    public static void setChutes(Map<Integer, Chute> chutes) {
        ChuteCollection.chutes = chutes;
    }
}

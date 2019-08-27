package com.candidate.chutesladders.data.collections;

import com.candidate.chutesladders.data.Chute;

import java.util.HashMap;
import java.util.Map;

public class ChuteCollection implements IEntityCollection<Chute> {
    public static Map<Integer, Chute> chutes = new HashMap<>();

    public void add(Chute c){
        chutes.put(c.start, c);
    }
}

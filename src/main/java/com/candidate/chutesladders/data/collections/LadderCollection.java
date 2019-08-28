package com.candidate.chutesladders.data.collections;

import com.candidate.chutesladders.data.Ladder;

import java.util.HashMap;
import java.util.Map;

public class LadderCollection implements IEntityCollection<Ladder> {
    public static Map<Integer, Ladder> ladders = new HashMap<>();

    public void add(Ladder l){
        ladders.put(l.getStart(), l);
    }
}

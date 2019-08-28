package com.candidate.chutesladders.data.collections;

import com.candidate.chutesladders.data.Pawn;

import java.util.ArrayList;
import java.util.List;

public class PawnCollection implements IEntityCollection<Pawn>{
    private static List<Pawn> pawns = new ArrayList<>();

    @Override
    public void add(Pawn pawn) {

    }

    public static List<Pawn> getPawns() {
        return pawns;
    }

    public static void setPawns(List<Pawn> pawns) {
        PawnCollection.pawns = pawns;
    }
}

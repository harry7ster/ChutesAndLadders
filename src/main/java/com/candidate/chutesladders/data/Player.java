package com.candidate.chutesladders.data;

import com.candidate.chutesladders.actions.Actions;
import com.candidate.chutesladders.actions.EntityAction;
import com.candidate.chutesladders.data.collections.PawnCollection;
import com.candidate.chutesladders.data.presentor.Move;
import com.candidate.chutesladders.util.GameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Pawn userPawn;
    private int currentPos = 0;
    private static final Logger logger = LoggerFactory.getLogger(Player.class);

    public Player(String name, Pawn pawn){
        this.name = name;
        this.userPawn = pawn;
        PawnCollection.getPawns().add(pawn);
    }

    public boolean move(){
        int number = Spinner.spin();
        //System.out.println("Spin number :" + number);

        int nextNum = currentPos + number;

        if(nextNum > 100) {
            System.out.println("No move made, since the user cannot go beyond 100!!");
            return false;
        }

        List<EntityAction> effectiveActions = new ArrayList<>();

        int finalPos = Actions.executeActions(effectiveActions, nextNum);

        Move.setValues(this, effectiveActions, finalPos);
        setCurrentPos(finalPos);
        System.out.println(Move.describe());

        return GameUtils.isWinner(this);
    }

    public int getCurrentPos() {
        return currentPos;
    }

    public void setCurrentPos(int currentPos) {
        this.currentPos = currentPos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pawn getUserPawn() {
        return userPawn;
    }

    public void setUserPawn(Pawn userPawn) {
        this.userPawn = userPawn;
    }

}

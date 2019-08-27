package com.candidate.chutesladders.data.presentor;

import com.candidate.chutesladders.actions.EntityAction;
import com.candidate.chutesladders.data.Player;

import java.util.List;

public class Move{
    public static Player player;
    public static List<EntityAction> actionsExecuted;
    public static int previousPos;
    public static int finalPos;
    private static volatile int count=0;

    public static void setValues(Player player1, List<EntityAction> actionsExecuted1, int finalPos1){
        player = player1;
        actionsExecuted = actionsExecuted1;
        finalPos = finalPos1;
        previousPos = player1.getCurrentPos();
        ++count;
    }

    public static String describe(){
        StringBuilder str = new StringBuilder();
        str.append(count+ ": ");
        str.append(player.getName() + " ").append(previousPos).append("--> ").append(finalPos);

        for(EntityAction actionExecuted: actionsExecuted){
            str.append(" --").append(actionExecuted.actionName + "--> " + actionExecuted.finalPos);
        }

        return str.toString();
    }
}

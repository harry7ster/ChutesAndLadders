package com.candidate.chutesladders.actions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Actions {
    private static List<EntityAction> actions = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(Actions.class);

    public static int executeActions(List<EntityAction> effectiveActions, int currentPos){

        int finalPOs = -1;

        while(finalPOs != currentPos){
            if(finalPOs!=-1)
                currentPos = finalPOs;

            finalPOs = execute(currentPos, effectiveActions);
        }

        return finalPOs;
    }

    public static void addToContext(EntityAction action){
        actions.add(action);
    }

    private static int execute(int currentPos, List<EntityAction> effectiveActions){
        int finalPos = 0;
        for(EntityAction action: actions){
            finalPos = action.move(currentPos);

            if(finalPos!= currentPos) {
                currentPos = finalPos;
                action.finalPos = finalPos;
                effectiveActions.add(action);
            }
        }
        return finalPos;
    }
}

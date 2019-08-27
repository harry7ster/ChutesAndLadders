package com.candidate.chutesladders.actions;

/***
 *
 */
public abstract class EntityAction {
    public String actionName;
    public int finalPos;

    EntityAction(String actionName){
        this.actionName = actionName;
        this.finalPos = finalPos;
    }

    abstract int move(int currentPosition);
}

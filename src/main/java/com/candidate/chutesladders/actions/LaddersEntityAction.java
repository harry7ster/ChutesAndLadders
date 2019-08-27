package com.candidate.chutesladders.actions;

import com.candidate.chutesladders.data.Ladder;
import com.candidate.chutesladders.data.collections.LadderCollection;

public class LaddersEntityAction extends EntityAction {
    public LaddersEntityAction(String actionName) {
        super(actionName);
    }

    @Override
    public int move(int currentPosition) {
        Ladder ladder = LadderCollection.ladders.get(currentPosition);
        return ladder==null?currentPosition:ladder.end;
    }

}

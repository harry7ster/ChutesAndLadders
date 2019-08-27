package com.candidate.chutesladders.actions;

import com.candidate.chutesladders.data.Chute;
import com.candidate.chutesladders.data.collections.ChuteCollection;

public class ChuteEntityAction extends EntityAction {

    public ChuteEntityAction(String actionName) {
        super(actionName);
    }

    @Override
    public int move(int currentPosition) {
        Chute chute = ChuteCollection.chutes.get(currentPosition);

        return chute==null?currentPosition:chute.end;
    }
}

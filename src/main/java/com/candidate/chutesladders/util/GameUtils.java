package com.candidate.chutesladders.util;

import com.candidate.chutesladders.data.Player;
import com.candidate.chutesladders.data.collections.PLayerCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameUtils {
    private static int WINNER_NUM = 100;
    private static final Logger logger = LoggerFactory.getLogger(GameUtils.class);

    public static boolean isWinner(Player player){
        if(player.getCurrentPos() == WINNER_NUM){
            System.out.println("The winner is " + player.getName());
            return true;
        }

        return false;
    }
}

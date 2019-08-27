package com.candidate.chutesladders.data.collections;

import com.candidate.chutesladders.actions.Actions;
import com.candidate.chutesladders.data.Player;
import com.candidate.chutesladders.data.Spinner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class PLayerCollection {
    private static List<Player> players = new ArrayList<>();
    private static final Logger logger = LoggerFactory.getLogger(PLayerCollection.class);

    public static boolean addPlayer(Player p){
       if(players.size() == 4) {
           System.out.println("Number of players cannot exceed 4");
           return false;
       }

       players.add(p);
       return true;
    }

    public static void updatethePlayerSeqWithWhoStarts() {
        boolean isMaxShared = true;
        int maxGetterUserIndex=-1;

        System.out.println("--Lets see who gets the max number--");
        while(isMaxShared) {
            int max = 0;
            maxGetterUserIndex = -1;
            for (int index = 0; index < players.size(); index++) {
                int num = Spinner.spin();
                System.out.println(players.get(index).getName() +" got number : " + num);
                if (num > max) {
                    maxGetterUserIndex = index;
                    max = num;
                    isMaxShared = false;
                } else if (num == max) {
                    isMaxShared = true;
                }
            }

            System.out.println("--round over--");
        }

        //move the player with max number to the front. The reason is that we need to iterate this list to play the game, and the first user will be with max number
        Player max = players.get(maxGetterUserIndex);

        System.out.println(max.getName() + " won, lets start with him");

        players.remove(maxGetterUserIndex);
        players.add(0, max);

    }

    public static List<Player> getPlayers() {
        return players;
    }
}

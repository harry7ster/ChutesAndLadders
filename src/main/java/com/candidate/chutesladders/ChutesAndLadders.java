package com.candidate.chutesladders;

import com.candidate.chutesladders.actions.Actions;
import com.candidate.chutesladders.actions.ChuteEntityAction;
import com.candidate.chutesladders.actions.LaddersEntityAction;
import com.candidate.chutesladders.data.*;
import com.candidate.chutesladders.data.collections.ChuteCollection;
import com.candidate.chutesladders.data.collections.LadderCollection;
import com.candidate.chutesladders.data.collections.PLayerCollection;

public class ChutesAndLadders {

    public static void main(String[] args){
        populateData();
        setActions();
        startGame();
    }

    private static void startGame(){
        PLayerCollection.updatethePlayerSeqWithWhoStarts();
        playGame();
    }

    private static void playGame() {
        boolean userWon = false;
        while(true) {
           // try {
                for (Player player : PLayerCollection.getPlayers()) {
                    userWon = player.move();
                    if(userWon)
                        break;
                    //Thread.sleep(2000);
                }
           /* } catch (Exception e) {

            }*/

            if(userWon)
                break;
        }
    }


    private static void setActions(){
        Actions.addToContext(new LaddersEntityAction("LADDER"));
        Actions.addToContext(new ChuteEntityAction("CHUTE"));
    }

    private static void populateData() {
        Ladder l = new Ladder(80, 100);
        LadderCollection.ladders.put(l.getStart(), l);

        Ladder l1= new Ladder(71, 91);
        LadderCollection.ladders.put(l1.getStart(), l1);

        Ladder l2= new Ladder(28, 84);
        LadderCollection.ladders.put(l2.getStart(), l2);

        Ladder l3= new Ladder(21, 42);
        LadderCollection.ladders.put(l3.getStart(), l3);

        Ladder l4= new Ladder(36, 44);
        LadderCollection.ladders.put(l4.getStart(), l4);

        Ladder l5= new Ladder(9, 31);
        LadderCollection.ladders.put(l5.getStart(), l5);

        Ladder l6= new Ladder(4, 14);
        LadderCollection.ladders.put(l6.getStart(), l6);

        Ladder l7= new Ladder(1, 38);
        LadderCollection.ladders.put(l7.getStart(), l7);

        Ladder l8= new Ladder(51, 67);
        LadderCollection.ladders.put(l8.getStart(), l8);

        Chute c = new Chute(98, 78);
        ChuteCollection.getChutes().put(c.getStart(), c);

        Chute c1= new Chute(95, 75);
        ChuteCollection.getChutes().put(c1.getStart(), c1);

        Chute c2= new Chute(93, 73);
        ChuteCollection.getChutes().put(c2.getStart(), c2);

        Chute c3= new Chute(87, 24);
        ChuteCollection.getChutes().put(c3.getStart(), c3);

        Chute c4= new Chute(64, 60);
        ChuteCollection.getChutes().put(c4.getStart(), c4);

        Chute c5= new Chute(62, 19);
        ChuteCollection.getChutes().put(c5.getStart(), c5);

        Chute c6= new Chute(16, 6);
        ChuteCollection.getChutes().put(c6.getStart(), c6);

        Chute c7= new Chute(49, 11);
        ChuteCollection.getChutes().put(c7.getStart(), c7);

        Chute c8= new Chute(56, 53);
        ChuteCollection.getChutes().put(c8.getStart(), c8);

        Chute c9= new Chute(47, 26);
        ChuteCollection.getChutes().put(c9.getStart(), c9);

        Player p = new Player("Aman", new Pawn("1", "red"));
        Player p1 = new Player("Harry", new Pawn("2", "blue"));
        Player p2 = new Player("Mark", new Pawn("3", "green"));

        PLayerCollection.addPlayer(p);
        PLayerCollection.addPlayer(p1);
        PLayerCollection.addPlayer(p2);

    }
}

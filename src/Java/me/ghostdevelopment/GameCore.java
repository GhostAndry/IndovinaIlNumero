package me.ghostdevelopment;

public class GameCore {
    public static void main(String[] args) {
        try {
            Utility.gameMSG();
            me.ghostdevelopment.game.GameLogic.gameMain();
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Internal Exception");
        }
    }
}
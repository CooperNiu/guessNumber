package com.twschool.practice;

public class Game {
    private String[] gameAns;
    public int positionNum = 0;
    public int valueNum = 0;

    public String[] getGameAns() {
        return gameAns;
    }

    public void setGameAns(String[] gameAns) {
        this.gameAns = gameAns;
    }

    public Game(String[] gameAns) {
        setGameAns(gameAns);
    }

    private boolean handleInput(String[] input){
        if (input.length != 4){
            return false;
        }
        return true;
    }

    public String guess(String[] userAns) {
        if (!handleInput(userAns)){
            return "Invalid input, please input again";
        }
        for (int i = 0; i < userAns.length; i++) {
            for (int j = 0; j < gameAns.length; j++) {
                if (userAns[j].equals(gameAns[i])) {
                    if (i == j) {
                        positionNum++;
                    } else {
                        valueNum++;
                    }
                }
            }
        }
        return positionNum + "A" + valueNum + "B";
    }
}

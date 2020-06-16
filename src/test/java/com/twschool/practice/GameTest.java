package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    //    全对
    @Test
    public void should_return_4A0B_when_every_number_is_correct() {
        String[] actualAswer = {"1", "2", "3", "4"};
        String[] inputAnswer = {"1", "2", "3", "4"};
        Game game = new Game(actualAswer);

        String result = game.guess(inputAnswer);

        assertEquals(result, "4A0B");
    }

    //    全错
    @Test
    public void should_return_0A0B_when_every_number_is_wrong() {
        String[] actualAswer = {"1", "2", "3", "4"};
        String[] inputAnswer = {"5", "6", "7", "9"};
        Game game = new Game(actualAswer);

        String result = game.guess(inputAnswer);

        assertEquals(result, "0A0B");
    }

    //    有对与错
    @Test
    public void should_return_0A1B_given_2789() {
        String[] actualAswer = {"1", "2", "3", "4"};
        String[] inputAnswer = {"2", "7", "8", "9"};
        Game game = new Game(actualAswer);

        String result = game.guess(inputAnswer);

        assertEquals(result, "0A1B");
    }


    @Test
    public void should_return_1A0B_given_1789(){
        String[] actualAswer = {"1", "2", "3", "4" };
        String[] inputAnswer = {"1", "7", "8", "9"};
        Game game = new Game(actualAswer);

        String result = game.guess(inputAnswer);

        assertEquals(result, "1A0B");
    }
}

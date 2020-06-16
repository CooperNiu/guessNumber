package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
//    全对
    @Test
    public void should_return_4A0B_when_every_number_is_correct() {
        String[] actualAswer = {"1", "2", "3", "4" };
        String[] inputAnswer = {"1", "2", "3", "4"};
        Game game = new Game(actualAswer);

        String result = game.guess(inputAnswer);

        assertEquals(result, "4A0B");
    }

//    全错
//    有对与错
}

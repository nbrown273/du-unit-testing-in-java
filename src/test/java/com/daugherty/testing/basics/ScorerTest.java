package com.daugherty.testing.basics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ScorerTest {
    @Test
    public void shouldScoreZeroIfAllRollsAreZero() {
        // Arrange
        List<Integer> rolls = new ArrayList<>(20);
        for(int i = 0; i < 20; i++) {
            rolls.add(0);
        }
        // Act
        Integer score = Scorer.score(rolls);
        // Assert
        assertEquals(0, score);
    }

    @Test
    public void shouldScoreTenIfAllFramesScoreOne() {
        // Arrange
        List<Integer> rolls = new ArrayList<>(20);
        for(int i = 0; i < 10; i++) {
            rolls.add(1);
            rolls.add(0);
        }
        // Act
        Integer score = Scorer.score(rolls);
        // Assert
        assertEquals(10, score);
    }

    @Test
    public void shouldScoreThirtyIfAllFramesScoreTwoOnTheFirstRollExceptOneFrameWithASpare() {
        // Arrange
        List<Integer> rolls = new ArrayList<>(20);
        for(int i = 0; i < 10; i++) {
            rolls.add(2);
            rolls.add(0);
        }
        rolls.set(1, 8);
        // Act
        Integer score = Scorer.score(rolls);
        // Assert
        assertEquals(30, score);
    }
    @Test
    public void shouldScoreFiftyIfAllFramesScoreTwoOnEachRollExceptOneFrameWithAStrike() {
        // Arrange // 2*20 + 6 + 2 + 2 = 9 * 4 + 10 + 2 + 2
        List<Integer> rolls = new ArrayList<>(20);
        for(int i = 0; i < 19; i++) {
            rolls.add(2);
        }
        rolls.set(2, 10);
        // Act
        Integer score = Scorer.score(rolls);
        // Assert
        assertEquals(50, score);
    }
}

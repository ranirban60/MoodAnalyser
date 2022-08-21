package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyze_ForSadMood(){ //TC 1.1 "I am in Sad Mood"
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");//MoodAnalyser Object
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood, "SAD");
    }
    @Test
    public void testMoodAnalyze_ForHappyMood() { //TC 1.2 "I am in Happy Mood"
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in happy mood");//MoodAnalyser Object
        String mood = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood, "HAPPY");
    }
}
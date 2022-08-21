package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalyze_ForSadMood(){ //TC 1.1 "I am in Sad Mood"
        MoodAnalyser moodAnalyser = new MoodAnalyser();//MoodAnalyser Object
        String mood = moodAnalyser.analyseMood("I am in Sad Mood.");
        Assertions.assertEquals(mood, "SAD");
    }
    @Test
    public void testMoodAnalyze_ForHappyMood() { //TC 1.2 "I am in Happy Mood"
        MoodAnalyser moodAnalyzer = new MoodAnalyser();//MoodAnalyser Object
        String mood = moodAnalyzer.analyseMood("I am in Any Mood.");
        Assertions.assertEquals(mood, "HAPPY");
    }
}
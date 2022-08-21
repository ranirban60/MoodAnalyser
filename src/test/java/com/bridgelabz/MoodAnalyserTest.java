package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyze_ForSadMood(){ //TC 1.1 "I am in Sad Mood"
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");//MoodAnalyser Object
        String mood1 = moodAnalyser.analyseMood();
        Assertions.assertEquals(mood1, "SAD");
    }
    @Test
    public void testMoodAnalyze_ForHappyMood() { //TC 1.2 "I am in Happy Mood"
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in happy mood");//MoodAnalyser Object
        String mood2 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood2, "HAPPY");
    }
    @Test
    public void testMoodAnalyze_ForInvalidMood() { //TC 2.1 Null Mood should return happy
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);//MoodAnalyser Object
        String mood3 = moodAnalyzer.analyseMood();
        Assertions.assertEquals(mood3, "HAPPY");
    }
}
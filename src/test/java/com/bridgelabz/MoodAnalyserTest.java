package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    //  Analyse mood by passing the message in the constructor
   @Test
    public void testMoodAnalyse_ForSadMood(){ //TC 1.1 "I am in Sad Mood"
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");//MoodAnalyser Object
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("SAD" , mood);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    //Analyse mood by passing the message in the constructor
    @Test
    public void testMoodAnalyse_ForHappyMood() { //TC 1.2 "I am in Happy Mood"
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");//MoodAnalyser Object
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY" , mood);
        }catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
    // Custom Exception if User Provides Invalid Mood
    // Input message: null
    @Test
    public void testMoodAnalyse_ForInvalidMood() { //TC 3.1 Null Mood
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);//MoodAnalyser Object
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
    // Custom Exception if User Provides Invalid Mood
    //Input message: empty
    @Test
    public void testMoodAnalyse_ForEmptyMood() { //TC 3.2 Empty Mood
        MoodAnalyser moodAnalyser = new MoodAnalyser("");//MoodAnalyser Object
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
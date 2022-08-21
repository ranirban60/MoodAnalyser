/*
Mood Analyzer Problem
 */
package com.bridgelabz;

//Create class MoodAnalyzer
public class MoodAnalyser {
    /*
    Call analyseMood function with message as parameter
    and return Happy or Sad mood
     */
    public String analyseMood(String message){
    if(message.contains("Sad"))
        return "SAD";
    else
        return "HAPPY";
  }

}

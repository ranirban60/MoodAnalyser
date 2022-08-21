/*
Mood Analyzer Problem
 */
package com.bridgelabz;

//Create class MoodAnalyzer
public class MoodAnalyser {
  private String message;
/*
Default Constructor
 */
  public MoodAnalyser(){

  }
  /*
  Parameterized constructor with parameter message
   */
  public MoodAnalyser(String message){
      this.message = message;
  }

    public String analyseMood(String message){
    if(message.contains("Sad"))
        return "SAD";
    else
        return "HAPPY";
  }

}

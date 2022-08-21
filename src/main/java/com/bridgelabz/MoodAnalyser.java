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
/*
Here try catch block is used to handle NullPointer Exception
 */
    public String analyseMood(){
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (Exception e){
                return "HAPPY";
        }
  }

}

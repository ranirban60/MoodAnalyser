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
    public String analyseMood() throws MoodAnalyserException{
        try {
            if (message.length()==0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY , "Please enter proper message!");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL , "Please enter proper message!");
        }
  }

}

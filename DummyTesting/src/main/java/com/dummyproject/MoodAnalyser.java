package com.dummyproject;

import com.dummyproject.MoodAnalyserException;
//import org.testng.annotations.Test;

public class MoodAnalyser {
    public MoodAnalyser() {
    }

    private String message;
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String moodAnalyser(String message) throws MoodAnalyserException {
        this.message=message;
        return analyseMood();

    }

    public String analyseMood(String message) {
        if (message .contains("SAD"))
            return "SAD";
        else
                return "Happy";
    }
    public String analyseMood() throws MoodAnalyserException {
        try{
            if(message.length() == 0)
                throw new MoodAnalyserException("please enter valid message");
            if (this.message.contains("SAD"))
                return "SAD";
            else
                return "Happy";
            }
        catch (NullPointerException e) {
            throw new MoodAnalyserException("please enter valid message");
    }
}
}

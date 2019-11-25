package com.moodanalyser;

import com.dummyproject.MoodAnalyser;
import com.dummyproject.MoodAnalyserException;
import com.dummyproject.MoodAnalyserFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest
{
    @Test
    public void givenMoodAnalyserClass_WhenProper_ShouldReturnObject() throws NoSuchMethodException {
        MoodAnalyser moodAnalyser = MoodAnalyserFactory.createMoodAnalyser("I am happy today");
        try{
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",mood);
        }   catch (MoodAnalyserException e){
                e.printStackTrace();
        }

    }
    @Test
    public void givenMesage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("SAD");
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void givenMesage_WhenHappy_ShouldReturnSad() {
        MoodAnalyser AnalysedMood = new MoodAnalyser();
        String mood = AnalysedMood.analyseMood("Happy");
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNull_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            String mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalyserException e) {
            Assert.assertEquals("please enter valid message",e.getMessage());
        }
    }

}

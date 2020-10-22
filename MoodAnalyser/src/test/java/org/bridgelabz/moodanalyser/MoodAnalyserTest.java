package org.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenSadMessage_WhenAnalyse_shouldReturnSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("sad", mood);
	}

//	@Test
//	public void givenAnyMessage_WhenAnalyse_shouldReturnHappyMood() {
//		MoodAnalyser moodAnalyser = new MoodAnalyser();
//		String mood = moodAnalyser.analyseMood("i am in any mood");
//		Assert.assertEquals("happy", mood);
//	}
}

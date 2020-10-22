package org.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Tc1.1
	@Test
	public void givenSadMessage_WhenAnalyse_shouldReturnSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("sad", mood);
	}

	// Tc1.2
	@Test
	public void givenHappyMessage_WhenAnalyse_shouldReturnHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("happy", mood);
	}

	// Tc2.1
	@Test
	public void givenNullMessage_WhenAnalyse_shouldReturnHappyMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("happy", mood);
	}
}

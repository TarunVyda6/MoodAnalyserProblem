package org.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenHappyMessage_WhenAnalyse_shouldReturnSadMood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("i am in sad mood");
		Assert.assertEquals("sad", mood);
	}

}

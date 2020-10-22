package org.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	// Tc1.1
	@Test
	public void givenSadMessage_WhenAnalyse_shouldReturnSadMood() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("sad", mood);
	}

	// Tc1.2
	@Test
	public void givenHappyMessage_WhenAnalyse_shouldReturnHappyMood() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("i am in happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("happy", mood);
	}

	// Tc2.1
	@Test(expected = MoodAnalysisException.class)
	public void givenNullMessage_WhenAnalyse_shouldReturnHappyMood() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("happy", mood);
	}

	// Tc3.1
	@Test()
	public void givenNullMessage_WhenAnalyse_shouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException exception) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.NUll_MESSAGE, exception.exceptionType);
		}
	}

	// Tc3.2
	@Test()
	public void givenEmptyMessage_WhenAnalyse_shouldThrowMoodAnalysisException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException exception) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE, exception.exceptionType);
		}
	}

}

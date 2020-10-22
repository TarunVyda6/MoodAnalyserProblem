package org.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;

	// uc2
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	// TC2.1
	public String analyseMood() {
		try {
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException exception) {
			return "happy";
		}
	}

}

package org.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;

	// Refactoring uc1
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {

		if (message.contains("sad")) {
			return "sad";
		} else {
			return "happy";
		}
	}

}

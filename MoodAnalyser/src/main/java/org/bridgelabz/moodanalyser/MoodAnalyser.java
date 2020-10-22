package org.bridgelabz.moodanalyser;

public class MoodAnalyser {

	private String message;

	// uc3
	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException exception) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NUll_MESSAGE, "enter valid message");
		}
	}

}

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
			if (message.length() == 0) {
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MESSAGE,
						"Empty input. Enter valid message");
			}
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException exception) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NUll_MESSAGE,
					"Null input. Enter valid message");
		}
	}

}

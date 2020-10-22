package org.bridgelabz.moodanalyser;

//uc3
public class MoodAnalysisException extends Exception {

	enum ExceptionType {
		NUll_MESSAGE, EMPTY_MESSAGE;
	}

	ExceptionType exceptionType;

	public MoodAnalysisException(ExceptionType exceptionType, String message) {

		super(message);
		this.exceptionType = exceptionType;
	}

}

package com.example;

public class MoodAnalysisException extends Exception {
    // UC3: different exception types
    private MoodErrorType type;

    public MoodAnalysisException(MoodErrorType type, String message) {
        super(message);
        this.type = type;
    }

    public MoodErrorType getType() {
        return this.type;
    }
}

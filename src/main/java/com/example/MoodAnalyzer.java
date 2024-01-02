package com.example;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        // UC2: handle null message
        if (this.message == null) {
            throw new MoodAnalysisException(MoodErrorType.NULL, "Invalid input: message is null");
        } 
        
        if (this.message.isEmpty()) {
            throw new MoodAnalysisException(MoodErrorType.EMPTY, "Invalid input: message is empty");
        }
        
        if (this.message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}

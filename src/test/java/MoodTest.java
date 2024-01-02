import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.example.MoodAnalysisException;
import com.example.MoodAnalyzer;
import com.example.MoodErrorType;

public class MoodTest {
    // TC 1.1: test for sad mood
    @Test
    public void testSadMood() throws MoodAnalysisException {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in a Sad Mood");
        assertEquals("SAD", analyzer.analyzeMood());
    }

    // TC 1.2: test for happy mood
    @Test
    public void testHappyMood() throws MoodAnalysisException {
        MoodAnalyzer analyzer = new MoodAnalyzer("I am in Any Mood");
        assertEquals("HAPPY", analyzer.analyzeMood());
    }

    // TC 3.1: testing for null mood message
    @Test
    public void testNullMoodMessage() throws MoodAnalysisException {
        MoodAnalyzer analyzer = new MoodAnalyzer(null);
        try {
            analyzer.analyzeMood();
            fail("Expected MoodAnalysisException of NULL type");
        } catch (MoodAnalysisException exception) {
            assertEquals(MoodErrorType.NULL, exception.getType());
        }
    }

    // TC 3.2: testing for empty mood message
    @Test
    public void testEmptyMoodMessage() throws MoodAnalysisException {
        MoodAnalyzer analyzer = new MoodAnalyzer("");
        try {
            analyzer.analyzeMood();
            fail("Expected MoodAnalysisException of EMPTY type");
        } catch (MoodAnalysisException exception) {
            assertEquals(MoodErrorType.EMPTY, exception.getType());
        }
    }
}

package test;

import model.Transcript;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranscriptTest {
    private Transcript testTranscript;

    @BeforeEach
    public void setUp(){
        testTranscript = new Transcript("Dazel", 1005);
    }

    @Test
    public void testTranscript(){
        assertEquals(testTranscript.getStudentName(), "Dazel");
        assertEquals(testTranscript.getStudentID(), 1005);
    }

    @Test
    public void testGetCourseAndGrade(){
        testTranscript.addGrade("Java", 3.5);
        assertEquals(testTranscript.getCourseAndGrade("Java"), "Java, 3.5");
    }

    @Test
    public void testGetStudentName(){
       assertEquals(testTranscript.getStudentName(), "Dazel");
    }

    @Test
    public void testPrintTranscript(){
        testTranscript.addGrade("Java", 3.5);

        assertEquals(testTranscript.getTranscript(),
                "Student Name: Dazel\n" +
                        "Student ID: 1005\n" +
                        "Subjects, GPA:\n" +
                        "Java, 3.5\n" +
                        "GPA, 3.5");
    }

    @Test
    public void getGPA(){
        testTranscript.addGrade("Java", 3.5);
        assertEquals(testTranscript.getGPA(), 3.5, 0.01);
        testTranscript.addGrade("Python", 3.0);
        assertEquals(testTranscript.getGPA(), 3.25, 0.01);
    }


}

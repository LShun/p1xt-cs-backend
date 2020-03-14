package model;

public class Transcript {

    // constructors
    public Transcript(String studentName, int studentID) {}

    // REQUIRES: grade >= 0
    // MODIFIES: this
    // EFFECTS: Add a new grade to this
    public void addGrade(String course, double grade){ }

    // getters
    public String getCourseAndGrade(String course){ return null; }
    public String getStudentName() {return null;}
    public int getStudentID() {return 0;};

    // EFFECTS: Prints out each of the course and grades in a consistent format.
    public void printTranscript(){
        System.out.println(getTranscript());
    }

    // EFFECTS: Gets the transcript in a string form
    public String getTranscript() {
        return "";
    }

    // EFFECTS: Returns the GPA of this
    public double getGPA(){ return 0.0; }
}

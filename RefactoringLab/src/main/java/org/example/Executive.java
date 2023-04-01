package org.example;

public class Executive implements IMastersProgram {
    public String major;
    public Executive(String major) {
        this.major=major;
    }

    @Override
    public boolean isEligible(float cgpa, String major) {
        return (cgpa >= 3.75 || this.major.equals(major));
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return theoryMarks;
    }
}

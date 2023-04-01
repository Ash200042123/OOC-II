package org.example;

public class RegularNonThesis implements IMastersProgram {
    public String major;
    public RegularNonThesis(String major) {
        this.major=major;
    }

    @Override
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major);
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return theoryMarks + thesisMarks;
    }
}

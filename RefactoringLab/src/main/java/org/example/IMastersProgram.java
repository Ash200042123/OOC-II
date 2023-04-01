package org.example;

public interface IMastersProgram {
    boolean isEligible(float cgpa, String major);

    int getMarks(int theoryMarks, int thesisMarks, int projectMarks);
}

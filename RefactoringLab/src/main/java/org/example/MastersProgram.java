package org.example;

public class MastersProgram {
    private IMastersProgram type;

    public MastersProgram(DegreeType type, String major) {
        MastersFactory mf = new MastersFactory();
        this.type = mf.chooseMasterprogram(type,major);
    }

    public boolean isEligible(float cgpa, String major) {
        return type.isEligible(cgpa,major) ;
    }

    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return type.getMarks(theoryMarks, thesisMarks, projectMarks);
    }

}

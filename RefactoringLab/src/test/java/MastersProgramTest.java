import org.example.DegreeType;
import org.example.MastersProgram;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class MastersProgramTest {
        @Test
        public void isEligibleThesis () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
            boolean isEligible = mp.isEligible(2, "swe");
            assertFalse(isEligible);
            isEligible = mp.isEligible(3.9f, "swe");
            assertTrue(isEligible);
        }

        @Test
        public void getMarksThesis () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "swe");
            int marks = mp.getMarks(80, 60, 40);
            assertEquals(100, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularThesis, "cse");
            boolean isEligible = mp.isEligible(3.9f, "swe");
            assertFalse(isEligible);
        }
        @Test
        public void isEligibleThesis2 () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
            boolean isEligible = mp.isEligible(2, "swe");
            assertTrue(isEligible);
            isEligible = mp.isEligible(3.9f, "swe");
            assertTrue(isEligible);
        }

        @Test
        public void getMarksThesis2 () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "swe");
            int marks = mp.getMarks(80, 60, 40);
            assertEquals(140, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor2 () {
            MastersProgram mp = new MastersProgram(DegreeType.RegularNonThesis, "cse");
            boolean isEligible = mp.isEligible(3.9f, "swe");
            assertFalse(isEligible);
        }
        @Test
        public void isEligibleThesis3 () {
            MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
            boolean isEligible = mp.isEligible(2, "swe");
            assertFalse(isEligible);
            isEligible = mp.isEligible(3.9f, "swe");
            assertTrue(isEligible);
        }

        @Test
        public void getMarksThesis3 () {
            MastersProgram mp = new MastersProgram(DegreeType.Executive, "swe");
            int marks = mp.getMarks(80, 60, 40);
            assertEquals(80, marks);
        }

        @Test
        public void isEligibleThesisDifferentMajor3 () {
            MastersProgram mp = new MastersProgram(DegreeType.Executive, "cse");
            boolean isEligible = mp.isEligible(3.9f, "swe");
            assertFalse(isEligible);
        }
    }

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentEnrollmentTest {

    @Test
    public void addStudent() throws Exception {
        Student s1= new Student("200042123", "Ashfaq", program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.7f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);

        List<Student> expected = new ArrayList<>();
        expected.add(s1);
        expected.add(s2);
        expected.add(s3);
        assertEquals(expected,studEnroll.getAll());
    }

    @Test
    public void removeStudent() throws Exception{
        Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.7f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        studEnroll.remove(s2);

        List<Student> expected = new ArrayList<>();
        expected.add(s1);
        expected.add(s2);
        expected.add(s3);
        expected.remove(s2);
        assertEquals(expected,studEnroll.getAll());
    }

    @Test
    public void getAllStudent() throws Exception{
        Student s1 = new Student("200042123", "Ashfaq", program.SWE, 3.2f);
        Student s2 = new Student("200042157", "Shoyeb", program.SWE, 3.7f);
        Student s3 = new Student("200042159", "Shuvro", program.SWE, 3.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        List<Student> dummy = studEnroll.getAll();
//        for (Student i : dummy) {
//            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
//        }

        List<Student> expected = new ArrayList<>();
        expected.add(s1);
        expected.add(s2);
        expected.add(s3);
        assertEquals(expected,dummy);
    }
        @Test
        public void printStudent() throws Exception{
            Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
            Student s2= new Student("200042157","Shoyeb",program.SWE,3.7f);
            Student s3= new Student("200042159","Shuvro",program.SWE,3.9f);
            StudentEnrollment studEnroll = new StudentEnrollment();
            studEnroll.add(s1);
            studEnroll.add(s2);
            studEnroll.add(s3);
            studEnroll.remove(s2);
            studEnroll.print();
        }
    @Test
    public void printSortedStudentByName() throws Exception{
        Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.7f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.9f);
        Student s4= new Student("200042103","Anan",program.SWE,2.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        studEnroll.add(s4);
        //studEnroll.remove(s2);
        //studEnroll.print();

        List<Student> dummy = studEnroll.getAll();
        ResultPublication resultPublication = new ResultPublication();
        resultPublication.publishByName(dummy);
    }

    @Test
    public void printSortedStudentByID() throws Exception{
        Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.7f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.9f);
        Student s4= new Student("200042103","Anan",program.SWE,2.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        studEnroll.add(s4);
        //studEnroll.remove(s2);
        //studEnroll.print();

        List<Student> dummy = studEnroll.getAll();
        ResultPublication resultPublication = new ResultPublication();
        resultPublication.publishByID(dummy);
    }

    @Test
    public void printSortedStudentByCGPA() throws Exception{
        Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.9f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.7f);
        Student s4= new Student("200042103","Anan",program.SWE,2.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        studEnroll.add(s4);
        //studEnroll.remove(s2);
        //studEnroll.print();

        List<Student> dummy = studEnroll.getAll();
        ResultPublication resultPublication = new ResultPublication();
        resultPublication.publishByCGPA(dummy);
    }


    @Test
    public void printSortedStudentByIdCGPA() throws Exception{
        Student s1= new Student("200042123", "Ashfaq",program.SWE,3.2f);
        Student s2= new Student("200042157","Shoyeb",program.SWE,3.9f);
        Student s3= new Student("200042159","Shuvro",program.SWE,3.7f);
        Student s4= new Student("200042103","Anan",program.SWE,2.9f);
        StudentEnrollment studEnroll = new StudentEnrollment();
        studEnroll.add(s1);
        studEnroll.add(s2);
        studEnroll.add(s3);
        studEnroll.add(s4);
        //studEnroll.remove(s2);
        //studEnroll.print();

        List<Student> dummy = studEnroll.getAll();
        ResultPublication resultPublication = new ResultPublication();
        resultPublication.publishByIdCGPA(dummy);
    }

}

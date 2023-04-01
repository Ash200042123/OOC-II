import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ResultPublication {
    public void publishByName(List<Student> dummy) {
        System.out.println("Student Name Sorting:");

        // Using sort() method of Collection class

        Collections.sort(dummy, Student.StuNameComparator);



        for (Student i : dummy) {
            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
        }
    }

    public void publishByID(List<Student> dummy){
        System.out.println("ID Sorting:");

        Collections.sort(dummy, Student.StuRollno);

        // Iterating over list via for each and

        // printing the elements

        for (Student i : dummy) {
            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
        }
    }

    public void publishByCGPA(List<Student> dummy) {
        System.out.println("CGPA Sorting:");

        Collections.sort(dummy, Student.StuCGPA);

        // Iterating over list via for each and

        // printing the elements

        for (Student i : dummy) {
            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
        }
    }

    public void publishByIdCGPA(List<Student> dummy) {
        System.out.println("CGPA and ID Sorting:");

        Collections.sort(dummy, Student.StuCGPA);
        Collections.sort(dummy, Student.StuRollno);

        // Iterating over list via for each and

        // printing the elements

        for (Student i : dummy) {
            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment implements Printer{

    List<Student> studentList;

    public StudentEnrollment(){
        studentList= new ArrayList<>();
    }
    public void add(Student s1) {
        studentList.add(s1);
    }

    public void remove(Student x) {
        for (Student i:studentList) {
            if(x.ID == i.ID){
                studentList.remove(x);
            }
        }
    }

    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void print() {
        for (Student i : studentList) {
            System.out.println(i.ID + " " + i.name + " " + i.Program + " " + i.cgpa);
        }
    }
}

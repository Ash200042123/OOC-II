import java.util.Comparator;

public class Student implements Study,Play,IStudentEnrollment{

    String ID,name;
    float cgpa;
    program Program;

    public Student(String ID, String name,program Program, float cgpa) throws Exception {
        if(ID.length()!=9){
            throw new InvalidStudentIDException("Length of ID should be 9");
        }
        this.ID=ID;
        this.name=name;
        this.Program=Program;
        this.cgpa=cgpa;
    }

    @Override
    public void study(String s){
        System.out.println("I am studying "+ s+" now!");
    }
    @Override
    public void play(String s){
        System.out.println("I am playing "+ s+" now!");
    }


    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        // Comparing attributes of students

        public int compare(Student s1, Student s2) {

            String StudentName1 = s1.getStudentname().toUpperCase();
            String StudentName2 = s2.getStudentname().toUpperCase();

            // Returning in ascending order

            return StudentName1.compareTo(StudentName2);

            // descending order

            // return

            // StudentName2.compareTo(StudentName1);

        }

    };



    public static Comparator<Student> StuRollno = new Comparator<Student>() {

        // Method

        public int compare(Student s1, Student s2) {

            int rollno1 = Integer.parseInt(s1.getRollno());
            int rollno2 = Integer.parseInt(s2.getRollno());

            // For ascending order

            return rollno1 - rollno2;

            // For descending order

            // rollno2-rollno1
        }
    };

    public static Comparator<Student> StuCGPA = new Comparator<Student>() {

        // Method

        public int compare(Student s1, Student s2) {

            Float rollno1 = s1.getCGPA();
            Float rollno2 = s2.getCGPA();

            // For ascending order

            return rollno1.compareTo(rollno2);

            // For descending order

            // rollno2-rollno1
        }
    };


    private float getCGPA() {
        return this.cgpa;
    }

    private String getRollno() {
        return this.ID;
    }

    private String getStudentname() {
        return this.name;
    }
}

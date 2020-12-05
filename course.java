
/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class course
{
    // course has more than one teacher, tutor, students.
    
    private ArrayList <teachingStaff> teachers;
    private ArrayList<Student> students;
    
    //creating course object
     public course(ArrayList<teachingStaff> teachers, ArrayList<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }
    //list of teachers in the course
    public ArrayList<teachingStaff> getTeachers() {
        return teachers;
    }
    // add a teacher to the course
    public void addTeacher(teachingStaff teacher) {
        teachers.add(teacher);
    }
    // return the list of students
    public ArrayList<Student> getStudents() {
        return students;
    }
    // adds a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }
    
}

import java.util.LinkedList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private List<Subject> takenCourses;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        takenCourses= new LinkedList<Subject>();
    }
    public void addCourse(Subject subject){
        if(!takenCourses.contains(subject))
        {
            takenCourses.add(subject);
            new Course().add(this,subject);
        }
        else System.out.println("Student already enrolled ");
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTakenCourses() {
        return takenCourses;
    }


}

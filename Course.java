import java.util.*;

public class Course {
    private List<Student> enrolledStudents;
    private static Map<Subject,List<Student>> coursesMap = new HashMap<Subject, List<Student>>();

    public Course() {
        coursesMap.put(Subject.Math,new ArrayList<>());
        coursesMap.put(Subject.Chemistry,new ArrayList<>());
        coursesMap.put(Subject.English,new ArrayList<>());
        coursesMap.put(Subject.Physics,new ArrayList<>());
    }

    public void add(Student student, Subject subject){
        coursesMap.get(subject).add(student);
        /*if(!coursesMap.get(subject).contains(student)){
            coursesMap.get(subject).add(student);
        }else{
            System.out.println("Student is already enrolled in "+subject.name()+" form Course class");
        }*/
        /*if(coursesMap.containsKey(subject)){
            if(!coursesMap.get(subject).contains(student)){
                coursesMap.get(subject).add(student);
            }else{
                System.out.println(student.getName()+" is already enrolled in "+subject.name());
            }
        }else{

            coursesMap.put(subject,null);

        }*/

        /*if(coursesMap.containsKey(subject)){
            if(coursesMap.get(subject).contains(student)){
                System.out.println(student.getName()+" is already enrolled in "+subject.name()+" course.");
            }else{
                enrolledStudents.add(student);
                coursesMap.put(subject,enrolledStudents);
            }
        }else{
            coursesMap.put(subject,enrolledStudents);
            add(student,subject);

        }
*/
       /* if(!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            for (Subject subject : student.getTakenCourses()) {
                coursesMap.putIfAbsent(subject, enrolledStudents);
            }

        } else{
            for (Subject subject : student.getTakenCourses()) {
                    coursesMap.putIfAbsent(subject, enrolledStudents);
            }
        }*/
    }

    public void printAll(){
        if(!coursesMap.isEmpty()){
        for (Subject sub: coursesMap.keySet()) {
            System.out.println("Course-> "+sub.name());
            for (Map.Entry<Subject, List<Student>> stu: coursesMap.entrySet()) {
                int i=0;
                if(i<coursesMap.entrySet().size()){
                    System.out.println(stu.getValue().get(i).getName());
                    i++;
                }
                else
                    continue;
            }
        }
            //System.out.println("Course-> "+sub.name()+"\nStudents: "+coursesMap.get(sub).toString());
        }else{
            System.out.println("No registered student founded");
        }
        System.out.println("==SSSSSSSSSSSSSS==");

        /*Iterator it = coursesMap.entrySet().iterator();
        while (it.hasNext()){
            coursesMap.Entr
        }*/

    }
    public void removeStudentFromCourse(Student student,Subject subject){
        enrolledStudents.remove(student);
        coursesMap.replace(subject,enrolledStudents);
    }
    public void removeStudentFromAll(Student student){
        enrolledStudents.remove(student);
        coursesMap.values().remove(student);
    }
}

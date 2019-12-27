public class Main {
    public static void main(String[] args) {
        Student ramez = new Student(22,"Ramez");
        Student ahmad = new Student(23,"Ahmad");
        ramez.addCourse(Subject.Math);


        //ramez.addCourse(Subject.Math);
        //new Course().printMath();
         ramez.addCourse(Subject.Physics);
        ramez.addCourse(Subject.Chemistry);
//
       ahmad.addCourse(Subject.Math);
        //new Course().printMath();
        //System.out.println("===========");
        //new Course().printphysics();
       ahmad.addCourse(Subject.English);
        ahmad.addCourse(Subject.Physics);

        //System.out.println("ramez.getTakenCourses() = " + ramez.getTakenCourses());

        new Course().printAll();


    }
}

package de.supernerd;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(564654, "Til Schweiger", "test1");
        Teacher teacher2 = new Teacher(564654, "Til Schweiger", "test2");
        Teacher teacher3 = new Teacher(564654, "Til Schweiger", "test3");

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);

        Student student1 = new Student();
        student1.setId(5656);
        student1.setName("Testname");
        student1.setGrade(4);

        System.out.println(student1);

        Course course1 = new Course();
        course1.setId(654);
        course1.setName("jjdk");
        course1.setStudents(student1);
        course1.setTeacher(teacher1);

        Teacher teacher5 = Teacher.builder().id(556).name("lls").subject("test7").build();
        System.out.println(teacher5);

        Student student6 = Student.builder().id(4479).name("wei").address("dsasdf 5").grade(5).build();

        Course course2 = Course.builder().id(55).name("Senf").teacher(teacher5).students(student6).build();
        System.out.println(course2);

    }
}
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

        Course course = Course.builder().id(55).name("Senf").teacher("test").build();
        System.out.println(course);

    }
}
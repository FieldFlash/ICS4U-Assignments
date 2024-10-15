package main;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Jane Doe");
        System.out.println(person);

        Student student = new Student(12345);
        student.setName("Liam");
        student.setStudentId(342417839);
        System.out.println(student.getName());
        System.out.println(student.toString());
        System.out.println(student.toStringStudent());

    }
}

package Unit3;

interface Person {
    void setPersonalDetails(String name, int age, String address);
    void displayPersonalDetails();
}

interface AcademicDetails {
    void setAcademicDetails(String rollNo, String course, double marks);
    void displayAcademicDetails();
}

class Student implements Person, AcademicDetails {
    private String name;
    private int age;
    private String address;
    private String rollNo;
    private String course;
    private double marks;


    public void setPersonalDetails(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayPersonalDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Implementation of methods from AcademicDetails interface
    public void setAcademicDetails(String rollNo, String course, double marks) {
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    public void displayAcademicDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }

    // Method to display all details
    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        displayPersonalDetails();
        displayAcademicDetails();
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student();

        student.setPersonalDetails("Atharv Nanagare", 21, "Pune, Maharashtra");
        student.setAcademicDetails("CS101", "B.Tech in Computer Science", 87.5);

        student.displayStudentDetails();
    }
}

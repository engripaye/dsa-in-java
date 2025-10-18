package JavaAndDsaFoundation;

// This is a simple example of java class demonstrating OOP Basics, including a class definition, attributes and constructors
// Create a Student class with basic properties like name, age and grade
public class Day2 {

    private String name;
    private int age;
    private double grade;


    // default constructors, initialize object with default values
//    public Day2(){
//        this.name = "Musa";
//        this.age = 3;
//        this.grade = 5.0;
//
//
//        System.out.println("Default constructor called. Student created with default values");
//    }
//
    // parameterized constructor: Allow initializing specific value
    public Day2(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        System.out.println("Parameterized constructors called student. " + name + " created");
    }

    // method to display student, a dimple getter-like method

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("grade: " + grade );
    }

    // Main method for testing classes

    public static void main(String[] args) {

        // creating student using the default constructor

           // Day2 student1 = new Day2();

           // student1.displayDetails();

        System.out.println();

        // creating a student using parameterized constructors

        Day2 student2 = new Day2("Novel", 26, 56.9);

        student2.displayDetails();
    }
}

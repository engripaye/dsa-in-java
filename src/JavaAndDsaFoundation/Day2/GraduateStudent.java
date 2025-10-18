package JavaAndDsaFoundation.Day2;

public class GraduateStudent extends Student{

    // Additional instance variable specific to graduatedStudent

    private String thesisTopic;
    // graduate student's thesis topic


    // default constructor for graduate student
  //  public GraduateStudent() {
    //    super(); // calls the default constructor of the superclass (Student)

      //  System.out.println("Graduate student default constructor called");
   // }

    public GraduateStudent(String name, int age, double grade, String thesisTopic) {
        super(name, age, grade);  // calls the parameterized constructor of a superclass

        this.thesisTopic = thesisTopic;

        System.out.println("GraduateStudent parameterized constructor called for " + name + ".");
    }

    // overridden method to display details, including the new field(Polymorphism in action)

    @Override
    public void displayDetails(){
        super.displayDetails(); // calls the super method to display basic details

        System.out.println("Thesis Topic: " + thesisTopic);
    }

    // new method specific to graduateStudent
    public void defendThesis(){
        System.out.println("Defending thesis on: " + thesisTopic);
    }

    // main method for testing inheritance and polymorphism
    public static void main(String[] args) {

        // creating graduate student using default constructor
       // GraduateStudent graduateStudent = new GraduateStudent();
      //  graduateStudent.displayDetails();

       // System.out.println();


        // creating graduateStudent using parameterized constructor

        GraduateStudent graduateStudent1 = new GraduateStudent("Hannah", 30, 79.9, "Canal Wealth in a Good Society");
        graduateStudent1.displayDetails(); // polymorphism uses graduateStudent's version
        graduateStudent1.defendThesis();

        System.out.println();

        // Polymorphism example: Treating graduate Student as student
        Student polyStudent = new GraduateStudent("Charles", 34, 67.9, "Quantum Engineering");
        polyStudent.displayDetails();

        System.out.println();

        GraduateStudent graduateStudent3 = new GraduateStudent("Ipaye", 27, 89.0, "Solar Panel");
        graduateStudent3.displayDetails();
        graduateStudent3.defendThesis();
    }
}

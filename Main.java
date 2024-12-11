public class Main {

   // This is the "TESTER CLASS" with a main method

   public static void main(String []args) {
      System.out.println("Constructing Student objects...");

      // Call DEFAULT CONSTRUCTOR
      // "Student senior" is the type declaration for a variable
      // "= new Student()" is calling the constructor
      Student kinder = new Student();
      
      // Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Paige", "Nunez", 2026);
      // Does argument order matter??? YES!!!
      //Student senior = new Student(2025, "Zoie", "Vitale");

      // Look at our constructed Student objects
      System.out.println(kinder); // will print the LOCATION of the object...
      // ...unless our class has a toString method defined!

      // Construct two more Student objects & print them out
      

   }
}

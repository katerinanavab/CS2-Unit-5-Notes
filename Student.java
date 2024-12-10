/* Example CLASS that defines an OBJECT
Class names like Student are always capitalized!
Object-Oriented Classes are like BLUEPRINTS
(in another Java class, you create instances from this blueprint)
*/
public class Student {
    // 1. INSTANCE VARIABLES (attributes/data/fields)
    // think of what this object "needs to know"
    // must be PRIVATE ("encapsulation")
    private String fName; // "a Student has a first name"
    private String lName;
    private int gradYear; 
    private String email;

    // 2. CONSTRUCTORS (manuals for setting up an object)

    // DEFAULT constructor (user did not provide data)
    // Job: initialize instance variables to DEFAULT values
    public Student() {
        fName = "First";
        lName = "Last";
        gradYear = 2037; 
        email = fName + "." + lName + gradYear + "@gbwl.org";
    }

    // Constructor with PARAMETERS (user provided key data)
    // Job: initialize instance variables to PROVIDED values
    public Student(String initFName, String initLName, int initGradYear) {
        fName = initFName; 
        lName = initLName;
        gradYear = initGradYear;
        email = fName + "." + lName + gradYear + "@gbwl.org";
    }


    // 3. METHODS (behaviors associated w/the object type)

}
package compgc01;

/**
 * A class represeting an employee
 * that inherits from user.
 */
public class Employee extends User {
    
    public Employee(String firstName, String lastName, String username, String password, String email) {
        super(firstName, lastName, username, password, email);  
    }
    
    /**
     * Returns the user's type as a String.
     * @return Type
     */
    public String getType() {
        return "employee";
    }
}
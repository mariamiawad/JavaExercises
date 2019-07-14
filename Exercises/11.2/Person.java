import java.utl.*;
public  class Person{
    String name; 
    String address;
    String email;
    public Person (String name){
        this.name =  name;

    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
         return "The class is : Person" + " name is " +getName();
    }
}
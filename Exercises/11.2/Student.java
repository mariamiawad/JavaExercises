import java.util.*;
public class Student extends Person{
   final static String  FRESHMAN = "Freshman";
   final static String  SOPHMORE = "Sophomore";
   final static String  JUNIOR = "Junior";
   final static String  SENIOR = "Senior";
   String status;
   public Student(){

   }
   /**
    * @param status the status to set
    */
   public void setStatus(String status) {
       this.status = status;
   }

   /**
    * @return the status
    */
   public String getStatus() {
       return status;
   }
   @Override
    public String toString() {
         return "The class is : Student" + " name is " +super.getName();
    }


}
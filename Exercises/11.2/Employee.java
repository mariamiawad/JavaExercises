import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Employee extends Person{
        protected String office;
        protected double salary;
        protected Date hireDate;
        
        /**
         * @param office the office to set
         */
        public Employee(String name){
                this(name, 0, "none",  new Date() );
        }
        public Employee(String name, double salary, String office, Date hirDate){
                super(name);
                this.salary = salary;
                this.office = office;
                this.hireDate = hireDate;
        }
        public void setOffice(String office) {
                this.office = office;
        }
        /**
         * @return the office
         */
        public String getOffice() {
                return office;
        }
        /**
         * @param salary the salary to set
         */
        public void setSalary(double salary) {
                this.salary = salary;
        }
        /**
         * @return the salary
         */
        public double getSalary() {
                return salary;
        }
        /**
         * @param hireDate the hireDate to set
         */
        public void setHireDate(Date hireDate) {
                this.hireDate = hireDate;
        }
        /**
         * @return the hireDate
         */
        public Date getHireDate() {
                return hireDate;
        }
        @Override
        public String toString() {
                return "The class is : Employee" + " name is " +super.getName();
        }
}
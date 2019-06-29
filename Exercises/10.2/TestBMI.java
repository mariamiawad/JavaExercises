import java.util.*;

public class TestBMI {

    public static void main(String[] args) {

        BMI bmi = new BMI("Luiz", 22, 175, 5, 7);
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n", bmi.getName(), bmi.getAge(),
        bmi.getWeight(), bmi.getFeet(), bmi.getInches());
    }

}
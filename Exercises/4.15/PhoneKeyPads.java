import java.util.*;

public class PhoneKeyPads {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a letter");
                String letter = input.next();
                if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c")) {
                        System.out.println(2);
                } 
                else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e")
                                || letter.equalsIgnoreCase("f")) {
                        System.out.println(3);
                }
                else if (letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h")
                                || letter.equalsIgnoreCase("i")) {
                        System.out.println(4);
                }
                else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k")
                                || letter.equalsIgnoreCase("l")) {
                        System.out.println(5);
                }
                else if (letter.equalsIgnoreCase("M") || letter.equalsIgnoreCase("n")
                                || letter.equalsIgnoreCase("o")) {
                        System.out.println(6);
                }
                else if (letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q")
                                || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s")) {
                        System.out.println(7);
                }
                else if (letter.equalsIgnoreCase("t")
                                || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("v") ) {
                        System.out.println(8);
                }
                else if (letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x")
                                || letter.equalsIgnoreCase("y")|| letter.equalsIgnoreCase("z")) {
                        System.out.println(9);
                }
                else System.out.println(letter +" is an invalid input");
                

        }
}
import java.util.*;

public class BirthdayGuessing {
    public static void main(String[] arrstring) {
        Scanner scanner = new Scanner(System.in);
        String string = " 1 3 5 7\n 9 11 13 15\n17 19 21 23\n25 27 29 31";
        String string2 = " 2 3 6 7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
        String string3 = " 4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
        String string4 = " 8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
        String string5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";
        int n = 0;
        int n2 = 32;
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(string);
        System.out.print("\nEnter N for No and Y for Yes: ");
        n2 = scanner.next().charAt(0);
        if (n2 == 89) {
            ++n;
        }
        System.out.print("Is your birthday in Set2?\n");
        System.out.print(string2);
        System.out.print("\nEnter N for No and Y for Yes: ");
        n2 = scanner.next().charAt(0);
        if (n2 == 89) {
            n += 2;
        }
        System.out.print("Is your birthday in Set3?\n");
        System.out.print(string3);
        System.out.print("\nEnter N for No and Y for Yes: ");
        n2 = scanner.next().charAt(0);
        if (n2 == 89) {
            n += 4;
        }
        System.out.print("Is your birthday in Set4?\n");
        System.out.print(string4);
        System.out.print("\nEnter N for No and Y for Yes: ");
        n2 = scanner.next().charAt(0);
        if (n2 == 89) {
            n += 8;
        }
        System.out.print("Is your birthday in Set5?\n");
        System.out.print(string5);
        System.out.print("\nEnter N for No and Y for Yes: ");
        n2 = scanner.next().charAt(0);
        if (n2 == 89) {
            n += 16;
        }
        System.out.println("\nYour birthday is " + n + "!");
    }
}
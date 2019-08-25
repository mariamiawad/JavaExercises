public class Test {
 public static void main(String[] args) {
 
  double pi = 0;
 
  for (int i = 1; i <= 100000; i++) {
   pi += Math.pow(-1, i + 1) / (2 * i - 1);
   if (i == 10000) {
    System.out.println("Pi at i = 10000 is " + pi*4);
   } else if (i == 20000) {
    System.out.println("Pi at i = 20000 is " + pi*4);
   } else if (i == 100000) {
    System.out.println("Pi at i = 100000 is " + pi*4);
   }
 
  }
   System.out.println("Java's pi is " + Math.PI);
 
 }
}
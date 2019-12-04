import chapter10.Exercise_10_27;

public class Test {

    private char[] buffer;
    public Test(char[] chars) {
        buffer = new char[chars.length];

        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public Test(String s) {
        this(s.toCharArray());
    }

    public Test append(int i) {

        String temp = "";
        while (i > 0) {
            temp = i % 10 + temp;
            i /= 10;
        }
        return new Test(toString() + temp);
    }

    public Test append(Test s) {

        return new Test(toString() + s.toString());
    }

    public String toString() {
        return new String(buffer);
    }

    public int length() {
        return buffer.length;
    }

    public char charAt(int i) {
        return buffer[i];
    }

    public Test toLowerCase() {
        char[] lower = new char[buffer.length];

        for (int i = 0; i < buffer.length; i++) {
            char old = buffer[i];
            if (old >= 'A' && old <= 'Z') {
                lower[i] = (char) (old - 'A' + 'a');
            } else {
                lower[i] = old;
            }
        }
        return new Test(lower);
    }

    public Test substring(int begin, int end) {

        char[] temp = new char[end - begin];
        for (int i = begin; i < end; i++) {
            temp[i - begin] = buffer[i];
        }

        return new Test(temp);
    }

    public Test insert(int offset, Test s) {
        char[] temp = new char[s.length() + buffer.length];
        for (int i = 0; i < offset; i++) {
            temp[i] = buffer[i];
        }

        for (int i = 0; i < s.length(); i++) {
            temp[offset + i] = s.charAt(i);

        }
        for (int i = offset + s.length(); i < temp.length; i++) {
            temp[i] = buffer[offset++];
        }

        return new Test(temp);
    }

    public Test reverse() {
        char[] reverse = new char[buffer.length];

        int start = 0;
        for (int i = buffer.length - 1; i >= 0; i--) {
            reverse[i] = buffer[start++];
        }
        return new Test(reverse);
    }

    public Test substring(int begin) {
        return substring(begin, buffer.length);
    }

    public Test toUpperCase() {

        char[] temp = new char[buffer.length];

        for (int i = 0; i < buffer.length; i++) {
            char ch = buffer[i];
            if (ch >= 'a' && ch <= 'z') {
                temp[i] = (char) (ch - 'a' + 'A');
            } else {
                temp[i] = ch;
            }
        }
        return new Test(temp);
    }
    public static void main(String[] args) {

        Exercise_10_27 s = new Exercise_10_27("ButtonDemo");
        System.out.println(s.toString());
        System.out.println(s.append(100).toString());
        System.out.println(s.toString());
        System.out.println("lowercase = " + s.toLowerCase());
        System.out.println("substring 0 3: " + s.substring(0, 3));

    }


}
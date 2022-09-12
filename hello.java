package javaconcepts;

public class hello {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c=a/b;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            b=b+2;
            c=a/b;
        }
        System.out.println(c);
    }
}

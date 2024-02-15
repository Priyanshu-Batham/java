import java.io.PrintWriter;

public class Unicode {
    public static void main(String args[]) {
        System.out.println('\u2620');

        PrintWriter printWriter = new PrintWriter(System.out, true);
        char aa = '\u0905';
        printWriter.println("aa = " + aa);

    }

}

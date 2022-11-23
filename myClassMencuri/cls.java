package myClassMencuri;
import java.io.IOException;

public class cls {
    public static void clSpause() throws IOException, InterruptedException{
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        } catch (Exception e) {}
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void clscreen() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
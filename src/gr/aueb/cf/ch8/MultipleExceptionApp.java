package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.err.println("Error, File not Found" + e.getMessage());

            e.printStackTrace();
            // throw e;
        } catch (IOException e) {
            System.err.println("IOException" + e.getMessage());
            e.printStackTrace();
           // throw e;
        } catch (Exception e) {
            System.err.println("Generic error" + e.getMessage());
            e.printStackTrace();
        }
    }
}

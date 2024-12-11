package gr.aueb.cf.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class ReadNamesApp {
    public static void main(String[] args) {
        String inFilePath = "C:/tmp/names.txt";
        String outFilepath = "C:/tmp/names-formated.txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilepath, StandardCharsets.UTF_8)){
                 String line;
                 String[] tokens;
                while((line = bf.readLine()) != null) {
                tokens = line.split(",+ \\s*");



                printFormated(ps, tokens);
                printFormated(System.out, tokens);
                }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
        public static void printFormated(PrintStream ps, String[] tokens) {
        ps.printf("{\"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\"}, \n", tokens[0], tokens[1], tokens[2]);
        }
}

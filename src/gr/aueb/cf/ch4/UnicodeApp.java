package gr.aueb.cf.ch4;

import java.sql.SQLOutput;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;
        System.out.println("Smiley: \uD83D\uDE03");
        System.out.println("Smiley: ");
        System.out.println(Character.toChars(codePoint));
    }

}

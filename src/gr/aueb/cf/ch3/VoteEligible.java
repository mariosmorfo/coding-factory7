package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  δικαιωμα ψηφου >18
 *  ελεγχει εαν μια ηλικια εχει δικαιωμα να ψησησει
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean  isVoteEligible = false;
        int age= 0;

        System.out.println("Please insert your age");
        age = in.nextInt();

        isVoteEligible = (age>=18);

        System.out.println("Is vote eligible:" + isVoteEligible);
    }
}

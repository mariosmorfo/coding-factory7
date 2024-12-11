package gr.aueb.cf.ch3;

public class FrogJumpApp {
    public static void main(String[] args) {
        int target = 70;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        jumps = (int) Math.ceil((target - start) / (double)hop);
        System.out.println("Jumps :" + jumps);
    }
}

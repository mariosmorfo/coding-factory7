package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running(>100)
 */
public class LightsOnApp {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      boolean isDark = false;
      boolean israining = false;
      boolean isruning = false;
      boolean lightson = false;
      int speed = 0;
      final int MAX_SPEED = 100;

        System.out.println("insert if is raining (true/false)");
        israining = in.nextBoolean();

        System.out.println("insert if is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("insert: speed");
        speed= in.nextInt();

        isruning = (speed > MAX_SPEED);
        lightson = israining && (isDark ||isruning);

        System.out.println("lights on:" + lightson);
    }
}

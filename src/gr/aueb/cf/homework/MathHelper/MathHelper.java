package gr.aueb.cf.homework.MathHelper;

public class MathHelper {

    private MathHelper(){

    }

    public static int getMax(int[] numbers){

        if( numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Array can not be empty");
        }

        int max = numbers[0];

        for(int el : numbers){
            max = Math.max(max, el);
        }
        return max;

    }

    public static int getMin(int[] numbers){
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array can not be empty");
        }

        int min = numbers[0];

        for(int el : numbers){
            min = Math.min(min, el);
        }
        return min;
    }

    public static double getAverage(int[] numbers){
        if(numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array can not be empty");

        }

        int sum = 0;

        for(int el : numbers){
            sum += el;
        }
            return (double) sum / numbers.length;

        }
    }



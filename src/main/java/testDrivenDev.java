public class testDrivenDev {


    public static String fizzBuzz(int i) {
        if (i%3==0 && i%5==0) {
            return "fizzBuzz";
        } else if (i%5==0) {
            return "Buzz";
        } else if (i%3==0) {
            return "fizz";
        }
        else {
            return Integer.toString(i);
        }
    }
}

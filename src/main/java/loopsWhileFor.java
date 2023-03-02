public class loopsWhileFor {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        int j = 0;
        while (j < numbers.length) {
            numbers[j] = j + 1;
            j++;
        }

        int k = 0;
        while (k < numbers.length) {
            //System.out.println(numbers[k]);
            k++;
        }

        //System.out.println(forLoop(3));
        //whileLoop(3);
        //System.out.println(whileLoop(3));

    }

    public static int forLoop(int faculty){

        int result = 1;

        for (int b = 1; b <= faculty; b++){
            result = result*b;
            //System.out.println(result);
        }
        return result;
    }

    public static int whileLoop(int faculty){

        int result = 1;
        int b = 1;

        while (b <= faculty){
            result = result * b;
            //System.out.println(result);
            b++;
        }
        return result;
    }
}
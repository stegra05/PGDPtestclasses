import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // switch value to test other tasks
        int testTask = 1;
        int[] array;
        int[][] twoDArray;
        String[] stringArray;
        switch (testTask) {

            // Simple Array
            case 1:
                array = new int[] {1, 2, 3};
                System.out.println("Array input: " + Arrays.toString(array));
                break;

            // Array with reoccuring numbers
            case 2:
                array = new int[] {5, 3, 6, 15, 23, 12, 5, 3, 6};
                System.out.println("Array input: " + Arrays.toString(array));
                break;

            // Array with numbers from to 100
            case 3:
                array = new int[100];
                for (int i = 0; i < 100; i++) {
                    array[0] = i;
                }
                System.out.println("Array input: [0;99]");
                break;

            // 2D Array with 2 Arrays
            case 4:
                twoDArray = new int[][] {{1, 3, 5}, {2, 4, 6, 7}};
                System.out.println("Array input: " + Arrays.deepToString(twoDArray));
                break;

            // 2D Array with multiple Arrays
            case 5:
                twoDArray = new int[][] {{1, 4, 6}, {2}, {342, 12}};
                System.out.println("Array input: " + Arrays.deepToString(twoDArray));
                break;

            // 2D Array representing 4x4 Picture (Color as Integer)
            case 6:
                array = new int[] {16562691, 2581199, 2790333, 4136834, 4136834, 2790333, 2581199, 16562691, 16562691, 2581199, 2790333, 4136834, 4136834, 2790333, 2581199, 16562691};
                System.out.println("Array input: " + Arrays.toString(array));
                break;

            // 2D Array representing 4x4 Picture (Color as Hex)
            case 7:
                stringArray = new String[] {"fcba03", "2762cf", "2a93bd", "3f1f82", "3f1f82", "2a93bd", "2762cf", "fcba03", "fcba03", "2762cf", "2a93bd", "3f1f82", "3f1f82", "2a93bd", "2762cf", "fcba03"};
                System.out.println("Array input: " + Arrays.toString(stringArray));
                break;

            // Empty Array
            case 8:
                array = new int[] {};
                break;

            // Extreme Value Array
            case 9:
                array = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};

            default:
                System.out.println("Not a test!");
                break;
        }


    }

    // Get distinct elements from Array
    public static int[] distinctArray(int[] array) {
        int[] distinctArray = Arrays.stream(array).distinct().toArray();
        return distinctArray;
    }

    public static int[] filterArray (int[] array) {
        array = Arrays.stream(array).filter(x -> x > 5).toArray();
        return array;
    }
}
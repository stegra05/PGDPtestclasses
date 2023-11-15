import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // switch 'testTask' value to test other tasks
        int testTask = 7;
        int[] array = new int[0];
        int[][] twoDArray = new int[0][];
        String[] stringArray = new String[0];


        switch (testTask) {

            // 1D Arrays
            // Empty Array
            case 1:
                array = new int[] {};
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

            // Simple Array
            case 4:
                array = new int[] {1, 2, 3};
                System.out.println("Array input: " + Arrays.toString(array));
                break;


            // 2D Arrays
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

            // 2D Array with 2 subarrays
            case 8:
                twoDArray = new int[][] {{1, 3, 5}, {2, 4, 6, 7}};
                System.out.println("Array input: " + Arrays.deepToString(twoDArray));
                break;

            // Extreme Value Array
            case 9:
                array = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};

            default:
                System.out.println("Not a test!");
                break;
        }

        // Enter method to test below
        System.out.println(stringArray);
    }

    // Get distinct elements from Array
    public static int[] distinctArray(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    // filters array, specified by input to the right of '->'
    public static int[] filterArray (int[] array) {
        return Arrays.stream(array).filter(x -> x < 2).toArray();
    }

    // Copies array and changes length
    public static int[] copyDefineSize (int[] array) {
        return Arrays.copyOf(array, array.length + 5);
    }

    // Copies array from (inclusive) to (exclusive)
    public static int[] copyRange (int[] array) {
        return Arrays.copyOfRange(array, 2, array.length);
    }

    // Sorts array
    public static int[] sortArray (int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

    // Adds each element of Array
    public static int sumArray (int[] array) {
        return Arrays.stream(array).sum();
    }
 }
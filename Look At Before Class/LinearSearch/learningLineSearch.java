import java.util.Scanner;

public class learningLineSearch {

    public static int linearSeach(int[] arr, int target) {
        int[] numArray = arr;
        int counter = 0;
        for (int val : numArray) {
            if (val == target){
                break;
            }
            else {
                counter += 1;
            }
        }
        int length = numArray.length;
        if (counter >= length) {
            return -1;
        }
        else {
            return counter;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 45, 1, 2, 99, -5, 46, 1012, 56, 8};
        Scanner inReader = new Scanner(System.in);
        System.out.println("What number do you want to search for?: ");
        int target = inReader.nextInt();
        int resultIndex = linearSeach(numbers, target);
        System.out.println(String.valueOf(resultIndex));
    }

    /*
     * Here are a few tips to know about this starter file.
     * 1. The function linearSearch is where you should write the linear search algorithm.
     * 2. A for-loop is a great way to iterate through each value in a list.
     * 3. the arrayName.Length method will return the length of an array, so if you are trying to iterate
     * through an entire array, this is a good starting place.
     * 4. if the value 'target' is not found in the array, 'numbers', the function should return -1.
     */
}

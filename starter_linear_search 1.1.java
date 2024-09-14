public class starter_linear_search {

    // a blank function that takes in an array of integers, and the target value to find. 
    
    public static int linearSearch(int[] arr, int target) {

        int arrPos = 0;
        
        for(int i: arr){
            if(i == target) {
                break;
            } else {
                arrPos += 1;
            }
        }

        return arrPos;       // statement exists to remove error underlining.
    }

    public static void main(String[] args) {
        int[] numbers = {3, 45, 1, 2, 99, -5, 46, 1012, 56, 8};
        int target = 99;
        int resultIndex = linearSearch(numbers, target);

        System.out.println(resultIndex);

    }

    /*
     * Here are a few tips to know about this starter file.
     * 1. The function linearSearch is where you should write the linear search algorithm.
     * 2. A for-loop is a great way to iterate through each value in a list.
     * 3. the arrayName.Length method will return the length of an array, so if you are trying to iterate
     * through an entire array, this is a good starting place.
     * 4. if the value 'target' is not found in the array 'numbers', the function should return -1.
     */
}

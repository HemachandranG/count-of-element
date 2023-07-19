package count;

public class CountGreaterElements {
	
    public static int countElements(int[] arr) {
        int count = 0;
        int n = arr.length;

       
        for (int i = 0; i < n; i++) {
            boolean hasGreater = false;

            
            for (int j = 0; j < n; j++) {
                if (i != j && arr[j] > arr[i]) {
                    hasGreater = true;
                    break;
                }
            }

            if (hasGreater) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int count = countElements(arr);
        System.out.println("Number of elements with at least one greater element: " + count);
    }
}

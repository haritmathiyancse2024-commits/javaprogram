public class Binarysearch {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 60;
        int low = 0;
        int high = arr.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                index = mid;
                break;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index:"+index);

        }else{
            System.out.println("Element not found");
        }
    }
}
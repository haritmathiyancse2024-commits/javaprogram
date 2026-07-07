public class Linearsearch {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 20;
       /* boolean found = false;// we will write index = -1 instead of boolean
         for(int i = 0; i < arr.length; i++){
             if(arr[i] == target){
                 found = true;
                 break;
             }
         }
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }*/
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}

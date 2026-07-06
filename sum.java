public class sum {
    static void main(String[] args) {
        int [] arr = {1,42,3,44,85};
        int sum = 0;

        for(int num : arr){
            sum +=num;
        }
        System.out.println(sum);
    }
}

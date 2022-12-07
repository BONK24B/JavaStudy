public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1, 0, 0, 1, 1};
        int count = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++){
            
            
            if (arr[i] == 1){
                count++;
            }
            else if (arr[i] != 1){
                count = 0;
            }
            if (res < count){
                res = count;
            }
            
        }

        System.out.println(res);

        
    }

}

public class Append {
public static void main(String[] args) {
//     Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//  а остальные - равны ему.

    int[] nums = new int[] {3, 2, 2, 3};
    int val = 3;
    int counter = 0;
    int iter = 0;
    int[] nums_2 = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == val){
            counter++;
        }
        else{
            nums_2[iter] = nums[i];
            iter++;
        }
    }

    for (int i = iter; i < iter + counter; i++) {
        nums_2[i] = val;
    }
    

    for (int i = 0; i < nums_2.length; i++) {
        System.out.println(nums_2[i]);
    }
}
}

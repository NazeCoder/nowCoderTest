//冒泡排序
//时间复杂度太高，很简单但是很落后的一种算法
import java.util.*;
public class Solution {
    public int[] MySort (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                for (int j = i; j < arr.length; j++) {
                    if(arr[j] <= min) {
                        min = arr[j];
                        arr[j] = arr[i];
                        arr[i] = min;
                    }
                }
            }
            return arr;
    }
}

//Arryas自带的一种排序方法
public class Solution2 {
    public int[] MySort (int[] arr) {
            Arrays.sort(arr);
            return arr;
    }
}

/*是对冒泡排序的一种改进方法，在冒泡排序中，进行元素的比较和交换是在相邻元素之间进行的，元素每次交换只能移动一个位置，所以比较次数和移动次数较多，效率相对较低。
而在快速排序中，元素的比较和交换是从两端向中间进行的，较大的元素一轮就能够交换到后面的位置，而较小的元素一轮就能交换到前面的位置，元素每次移动的距离较远，所以
比较次数和移动次数较少，y速度较快，故称为“快速排序”。
*/
import java.util.*;
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort (int[] arr) {
        quickSort(arr , 0 , arr.length-1);
        return arr;
    }
    public void quickSort(int[] list, int left, int right) {
        if (left < right) {
            // 分割数组，找到分割点
            int point = partition(list, left, right);
            // 递归调用，对左子数组进行快速排序
            quickSort(list, left, point - 1);
            // 递归调用，对右子数组进行快速排序
            quickSort(list, point + 1, right);
        }
    }

    /**
     * 分割数组，找到分割点
     */
    public int partition(int[] list, int left, int right) {
        // 用数组的第一个元素作为基准数
        int first = list[left];
        while (left < right) {
            while (left < right && list[right] >= first) {
                right--;
            }

            // 交换
            swap(list, left, right);

            while (left < right && list[left] <= first) {
                left++;
            }

            // 交换
            swap(list, left, right);
        }
        // 返回分割点所在的位置
        return left;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

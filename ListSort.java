//冒泡排序

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

//时间复杂度太高，很简单但是很落后的一种算法

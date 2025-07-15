package com.luo.dau_pointer;

/**
 * 双指针算法实现将零移动到数组末尾
 * 
 * 该算法采用双指针策略，通过一次遍历完成元素移动操作。
 * 特点：保持非零元素相对顺序，原地操作无需额外空间。
 * 
 * 时间复杂度：O(n) - 单次遍历完成操作
 * 空间复杂度：O(1) - 原地操作，仅使用常数级额外空间
 */
public class MoveZero {
    public static void main(String[] args) {
        // 测试用例1: 普通情况
        int[] nums1 = {0,1,0,3,12};
        Solution s = new Solution();
        s.moveZeroes(nums1);
        System.out.print("测试用例1结果: ");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        
        // 测试用例2: 全零情况
        int[] nums2 = {0,0,0,0};
        s.moveZeroes(nums2);
        System.out.print("测试用例2结果: ");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        
        // 测试用例3: 无零情况
        int[] nums3 = {1,2,3,4};
        s.moveZeroes(nums3);
        System.out.print("测试用例3结果: ");
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }
        System.out.println();
    }
}
class Solution {
    /**
     * 使用双指针策略将数组中的零移动到末尾
     * 
     * 算法步骤：
     * 1. 初始化两个指针left和right，均从数组起始位置开始
     * 2. 遍历数组，当right指针指向非零元素时：
     *    a. 将left指针和right指针的元素交换
     *    b. 移动left指针
     * 3. right指针每次循环都向后移动
     * 
     * @param nums 待处理数组
     */
    public void moveZeroes(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    
    /**
     * 另一种实现方式：保留非零元素并补零
     * 
     * 算法步骤：
     * 1. 遍历数组，将所有非零元素依次前移
     * 2. 记录非零元素的个数
     * 3. 在数组末尾补上相应数量的零
     * 
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 
     * @param nums 待处理数组
     */
    public void moveZeroesAlternative(int[] nums) {
        int insertPos = 0;
        // 首先收集所有非零元素
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        // 在末尾补零
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}



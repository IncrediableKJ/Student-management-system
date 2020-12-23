package com.wdd.studentmanager;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Classname IteratorTest
 * @Description None
 * @Date 2019/6/30 19:50
 * @Created by WDD
 */
public class IteratorTest {
    @Test
    public void test() {
        //准备数据
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);

        //遍历删除,除去男生
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            if (iterator.next().equals(3)) {
                iterator.remove();//使用迭代器的删除方法删除
            }
        }
        System.out.println(list.size());
    }
    @Test
    public void test1(){
        int[] arr = {5,4,3,2,1};
        quicksort(arr,0,arr.length);
        System.out.println(arr);
    }
    public void quicksort(int  []arr,int left,int right){
        int pivot=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=pivot){
                right--;
            }
            arr[left]=arr[right];
            while(left<right&&arr[left]<=pivot){
                left++;
            }
            arr[right]=arr[left];


        }
        arr[left] = pivot;



    }
    public void swap(int []arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}


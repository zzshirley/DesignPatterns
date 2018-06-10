package com.ccnu.nercel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("排序前的数组是：");
		int key=0;
		int array[]= {2,3,10,11,8,1,25,29};
		for(int element : array){
            System.out.print(element+" ");
        }
		AlgorithmsOperation ao;
		BinarySearch binarysearch=new BinarySearch();
		QuickSort quicksort=new QuickSort();
		ao=new AlgorithmsOperation(binarysearch,quicksort);
		ao.sort(array);
		System.out.println("\n排序后的数组是：");
		for(int element : array){
            System.out.print(element+" ");
        }
		System.out.println("\n请输入要查找的数字：");
		Scanner input=new Scanner(System.in);
		key=input.nextInt();
		int a=ao.search(array, key);
		if (a==-1) {
			System.out.println("没找到！");
		}else {
			System.out.println("找到了！"+"下标是"+a);
		}
		
	}
	
}

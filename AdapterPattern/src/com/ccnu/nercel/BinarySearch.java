package com.ccnu.nercel;

public class BinarySearch {

	public  int binarysearch(int[] arr,int key) {
		int max=arr.length-1;
		int min=0;
		while(min<=max) {
			int middle=min+(max-min)/2;
			if(key==arr[middle]) {
				return middle;
			}else if(key<arr[middle]) {
				max=middle-1;
			}else {
				min=middle+1;
			}			
		}
		return -1;
	}
}

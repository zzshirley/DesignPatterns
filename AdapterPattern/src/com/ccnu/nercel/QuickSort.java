package com.ccnu.nercel;

public class QuickSort {
	
	public  void quicksort(int arr[],int l ,int r) {
		int left=l;
		int right=r;
		int key=0;
		if(left<=right) {
			key=arr[left];
			while(left!=right) {			
				while(left<right&&key<=arr[right])
					right--;
				arr[left]=arr[right];
				while(left<right&&key>=arr[left])
					left++;
				arr[right]=arr[left];
				}
			arr[right]=key;
			quicksort(arr,l,left-1);
			quicksort(arr,right+1,r);
			}		
		}
	public void sort(int[] a) {
		quicksort(a,0,a.length-1);
	}
}

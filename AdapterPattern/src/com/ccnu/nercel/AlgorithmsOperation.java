package com.ccnu.nercel;

public class AlgorithmsOperation implements DataOperation{
	
	private BinarySearch binarysearch;
	private QuickSort quicksort;
	
	public AlgorithmsOperation(BinarySearch binarysearch,QuickSort quicksort) {
		this.binarysearch=binarysearch;
		this.quicksort=quicksort;
	}
	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		quicksort.sort(arr);
	}

	@Override
	public int search(int[] arr, int key) {
		// TODO Auto-generated method stub
		return binarysearch.binarysearch(arr, key);
	}

}

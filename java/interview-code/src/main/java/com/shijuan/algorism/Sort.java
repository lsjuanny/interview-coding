package com.shijuan.algorism;

import org.apache.commons.lang.ArrayUtils;

public class Sort {
	public static void main(String[] args) {
		int[] list = new int[] {5,8,9,2,1,6,5,10,0};
		quickSort(list, 0, list.length - 1);
		System.out.println(ArrayUtils.toString(list));
	}
	

	
	private static void quickSort(int[] list, int i, int j) {
		if(i<j) {
			int q = partition(list, i, j);
			quickSort(list, i, q-1);
			quickSort(list, q+1, j);
		}
	}
	
    private static int partition(int[] list, int i, int j) {
    	int p = list[i];
    	while (i < j) {
    		while(i<j && list[j] > p) {
    			j--;
    		}
    		if(i<j){
    			list[i]=list[j];
    			i++;
    		}
    		while (i<j && list[i] < p) {
    			i++;
    		}
    		if(i<j) {
    			list[j] = list[i];
    			j--;
    		}
    	}
    	list[i]=p;
    	return i;
    }

}

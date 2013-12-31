package com.shijuan.algorism;

public class ReverseSentence {
	public static void main(String[] args) {
		String rval = reverse(args[0]);
		System.out.println(rval);
		
		char[] tcs = args[0].toCharArray();
		reverse(tcs);
		System.out.println(new StringBuilder().append(tcs).toString());
		
		int[] list = new int[] {5,8,9,2,1,6,5,10,0};
		quickSort(list, 0, list.length - 1);
		System.out.println(org.apache.commons.lang.ArrayUtils.toString());
	}

	private static void reverse(char[] args) {
		int i = 0, j = args.length - 1;
		while (i < j) {
			char tmp = args[i];
			args[i] = args[j];
			args[j] = tmp;
			i++;
			j--;
		}
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

	private static String reverse(String str) {
		System.out.println("Origin string: " + str);
		char[] cs = str.toCharArray();
		char[] tcs = new char[cs.length];
		int i = 0;
		int j = cs.length - 1;
		int left = 0;
		int right = cs.length - 1;
		int rl = 0;
		int ll = 0;
		while (i < cs.length) {
			if (cs[i] != ' ' && i != cs.length - 1) {
				i = i + 1;
				rl = rl + 1;
				right = right - 1;
			} else {
				if (i == cs.length - 1) {
					i = i + 1;
					rl = rl + 1;
					right = right - 1;
				}
				for (int x = 0; x < rl; x++) {
					tcs[right + x + 1] = cs[i - rl + x];
				}
				if (i != cs.length) {
					tcs[right] = ' ';
				}
				right = right - 1;
				i = i + 1;
				rl = 0;
			}
			// if(cs[j] != ' ') {
			// j = j -1;
			// ll = ll+1;
			// } else {
			// for (int x = 0; x < ll; x++){
			// tcs[left +x] = cs[j-x+1];
			// }
			// tcs[left+ll] = ' ';
			// left = left + ll+1;
			// j = j -1;
			// ll = 0;
			// }
		}

		return new StringBuilder().append(tcs).toString();
	}
}
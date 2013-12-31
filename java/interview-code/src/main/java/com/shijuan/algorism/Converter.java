package com.shijuan.algorism;

public class Converter {
	public static void main(String args[]) {
		System.out.println(stringToInt("324987"));
		System.out.println(stringToInt("-0283498"));
		try {
			System.out.println(stringToInt("823sj90"));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println(stringToInt("j82390"));
	}

	private static int stringToInt(String str) {
		int rval = 0;
		int index = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			if ('9' >= c && '0' <= c) {
				rval += (c - '0') * Math.pow(10, index);
			} else {
				if (i == 0) {
					if (c == '-') {
						rval = rval * -1;
					} else if (c == '+') {
					} else {
						throw new IllegalArgumentException(String.format(
								"The input str [%s] is not in integer format",
								str));
					}
				} else {
					throw new IllegalArgumentException(String.format(
							"The input str [%s] is not in integer format", str));
				}
			}
			index++;
		}

		return rval;

	}

}

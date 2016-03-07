package org.istvanbohm.tricks;

public class Range {

	// (-1)*Integer.MIN_VALUE == Integer.MIN_VALUE
	public static void main(String[] args) {
		int m[] = new int[3];
		int from=Integer.MIN_VALUE;
		int to=-from;
		for(int i=from;i<to;) m[Math.abs(i++%3)]++;
		for(int j=0;j<3;++j) System.out.print(m[j]);	
	}
}

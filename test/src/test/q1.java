package test;

import java.util.*;
class q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int missingNumber = -1;
		int A[] = new int[size];
		for (int i = 0; i < size; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int n = A.length;
		int num = A[0];
		for (int i = 0; i < n; i++) {
			if (num == A[i] || A[i] == ++num)
				continue;
			else
				missingNumber = num;
		}
		System.out.println(missingNumber);
	}
}
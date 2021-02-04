package Baekjoon_Q_DEQUE.ShortCode;


import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

//모범답안

public class Main5_2 {
	static Queue<Integer> q;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		Deque<Integer> dq = new LinkedList<>();
		int countSum = 0;
		
		for (int i = 1; i <= n; i++) {		// Queue 에 입력
			dq.offer(i);
		}
		
		for (int i = 0; i < m; i++) {
			int k = scan.nextInt();
			int count = 0;
			
			while (dq.peekFirst() != k) {
				dq.offer(dq.poll());
				count++;
			}
			
			countSum += Math.min(count, dq.size() - count);
			
			dq.pollFirst();

		}
		System.out.println(countSum);

	}
}

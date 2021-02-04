package Baekjoon_Q_DEQUE.ShortCode;

import java.util.*;

public class Main4_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, m, count;
		
		for(int i = 0; i < t; i++) {
			LinkedList<int[]> queue = new LinkedList<>();
			count = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			
			for(int j = 0; j < n; j++) {
				queue.add(new int[] {j, sc.nextInt()}); //(***)
			}
			while(!queue.isEmpty()) {
				
				int[] now = queue.poll();
				
				boolean isPriority = true; //(***)
				
				for(int[] q : queue) {    //(***)
					if(q[1] > now[1]) { 
						isPriority = false;
					}
				}
				if(isPriority) {
					count ++;
					if(now[0] == m) {
						break;
					}
				}else {
					queue.add(now);
				}
			}
			System.out.println(count);
		}
		sc.close();
    }
}
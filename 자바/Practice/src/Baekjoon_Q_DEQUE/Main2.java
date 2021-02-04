package Baekjoon_Q_DEQUE;
import java.io.*;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> q = new LinkedList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=1;i<=T;i++) {
			q.add(i);
		}
		
		while(q.size()!=1) {
			q.remove();
			q.add(q.remove());
		}
		
		bw.write(q.remove()+"");
		bw.flush();
		bw.close();
	}

}

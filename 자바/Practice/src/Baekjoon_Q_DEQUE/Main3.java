package Baekjoon_Q_DEQUE;
import java.util.*;
import java.io.*;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N =Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int index = K-1; //시작 index
		
		LinkedList<Integer> q = new LinkedList<>();  //Queue 에는 remove(int index)가 정의 되어있지 x ->LinkedList(q를 구현함)를 q처럼 사용함
		
		for(int i=1;i<=N;i++) {
			q.addLast(i);
		}
		
		bw.write("<"+q.remove(index));
		
	    while(q.size()!=0){
	    	
			index=((index+K)-1)%q.size();
			
			bw.write(", "+q.remove(index)); //Making Shape
			
		}
		
		bw.write(">");
		
		bw.flush();
		bw.close();
	}

}

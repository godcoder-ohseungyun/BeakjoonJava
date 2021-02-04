package Baekjoon_DFS_BFS;

import java.util.*;
import java.io.*;

public class Main1 {

	public static void main(String[] args) throws IOException {
		//How get the elements in vertex
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pointNums=0;
		int vertexNums=0;
		int start=0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		pointNums = Integer.parseInt(st.nextToken()); vertexNums = Integer.parseInt(st.nextToken()); start = Integer.parseInt(st.nextToken());
	    
		//행 열 을 입력 받아 2차원 배열을 동적할당 하는 연산(**********)
		ArrayList<ArrayList<Integer>> vertex = new ArrayList<>(pointNums); //2차원 ArrayList
		
		for(int i=0;i<vertexNums;i++) {
			vertex.add(new ArrayList<>()); //ArrayList 적용
		}
		
		for(int i=0;i<vertexNums;i++) {
			st = new StringTokenizer(br.readLine()," ");
			vertex.get(Integer.parseInt(st.nextToken())-1).add(Integer.parseInt(st.nextToken())); //해당 행(1번 토큰) 의 열(2번토큰) 적재
		}
		
		DFS(start,vertex);
		
		BFS(start,vertex);
		
		
		
	}

	private static void DFS(int start,ArrayList<ArrayList<Integer>> vertex) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> s = new Stack<>(); //스택
		ArrayList<Integer> check = new ArrayList<>(); //지나간 간선 저장
		int value;
		
		s.add(start);
		check.add(start);
		bw.write(s.pop()+"");
		for(int i:vertex.get(start-1)) {
			s.add(i);
		}
		
		
		while(!s.isEmpty()) {
			value =s.peek();
			if(!check.contains(value)) {
				bw.write(value+"");
				for(int i:vertex.get(value-1)){
					 s.add(i);
				}
				check.add(value);
				s.pop();
			}
			else  s.pop();
		}
		bw.newLine();
		bw.flush();
		s.clear();
	}
	
	private static void BFS(int start,ArrayList<ArrayList<Integer>> vertex) throws IOException { //사실 이럴 필요도 없음
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> q = new LinkedList<>(); //큐
		ArrayList<Integer> check = new ArrayList<>(); //지나간 간선 저장
		int value;
		
		q.add(start); //시작 정점
		check.add(start);
		for(int i: vertex.get(start-1)) { //다음 간선 탐색
			q.add(i);
		}
		bw.write(q.poll()+"");
		
		while(!q.isEmpty()){
			if(!check.contains(q.peek())) {
			
				bw.write(q.peek()+""); //이동한 정점
				value = q.poll();

				for(int i: vertex.get(value-1)) { //다음 간선 탐색
					q.add(i);
				}
				check.add(value); //현재간선 지나침 표시
			
		    }
			else q.poll();
		}
		
		bw.flush();
		q.clear();
		bw.close();
	}
}

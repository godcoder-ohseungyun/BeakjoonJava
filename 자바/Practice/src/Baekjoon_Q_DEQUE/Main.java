package Baekjoon_Q_DEQUE;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		ArrayQueue q = new ArrayQueue();
		
		for(int i=0;i<T;i++) {
			String command = br.readLine();
			StringTokenizer st = new StringTokenizer(command," ");
			
			
			switch(st.nextToken()) {
				case "push": 
					q.push(Integer.parseInt(st.nextToken()));break;
				case "pop":
					bw.write(q.pop()+"\n");break;
				case "size":
					bw.write(q.size()+"\n");break;
				case "empty":
					bw.write(q.empty()+"\n");break;
				case "front":
					bw.write(q.front()+"\n");break;
				case "back":
					bw.write(q.back()+"\n");break;
					
				default: System.out.println("존재하지 않는 커멘드");
			}
			bw.flush();
		}
		
		bw.close();


	}
	
	

}

class ArrayQueue implements Queue{
	
	private final int MaxSize=1000;
	private int[] list;
	private int front;
	private int rear;
	
	public ArrayQueue() {
		front=0; //선단
		rear=0;	//후단
		list = new int[MaxSize];
	}
	
	public void push(int x) {
		if(!isFull()) {	//오류 상태 방지
			rear=(rear+1)%MaxSize;
			list[rear]=x;
		}
	}
	public int pop() { 
		if(empty()==1) {
			return -1;
		}
		else {
			front=(front+1)%MaxSize;
			return list[front]; 
		}
	}
	
	public int size() {
		return ((rear-front)+MaxSize)%MaxSize;
	}
	
	public boolean isFull() { //수상
		return ((rear+1)%MaxSize==front);
	}
	
	public int empty() { //수상
			if(!isFull() && rear==front) return 1;
			else return 0;
	}
	
	public int front() {
		return list[(front+1)%MaxSize];
	}
	
	public int back() {
		return list[rear];
	}
	
}

interface Queue {
    int empty();
    void push(int x);
    int pop();
    int front();
    int back();
    boolean isFull();
}

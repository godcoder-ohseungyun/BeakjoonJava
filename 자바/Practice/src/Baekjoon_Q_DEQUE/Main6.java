package Baekjoon_Q_DEQUE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main6 {

	private static LinkedList<String> list = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] commend;
		StringTokenizer array;
		boolean isError;
		int listSize=0;
		int Test= Integer.parseInt(br.readLine());
		
		for(int T=0;T<Test;T++) {
		list.clear();	
		isError=false;	
	    //commend = new StringTokenizer(br.readLine(),""); //""=> x 한개 이상의 구분자를 사용해야함 "[,]"여러개 넣을수있음
	    commend = br.readLine().split("");
	    
		
	    listSize = Integer.parseInt(br.readLine());
	    
	    array = new StringTokenizer(br.readLine(),"[,]"); //입력[1,2,3,4] -> 1234 -> 1 2 3 4 (token) 
	    
	    while(array.hasMoreTokens()) { //리스트 데이터 저장  
	    	list.add(array.nextToken());
	    }
	   
		
		for(int i=0;i<commend.length;i++) {//명령어 분석
			
			switch(commend[i]) {
				case "R":
					reverse();
					break;
				case "D":
					if(list.isEmpty()) { //why need a break?
						bw.write("error");
						isError=true;
						break;
					}
					delete(); 
					break;
				
			}
			if(isError) break;
		}
		
		if(!isError) {
			int i= 1;
			bw.write("["+list.get(0));
			while(list.size()!=i) {
				bw.write(","+list.get(i));
				i++;
			}
			bw.write("]");
		}
		
		bw.flush();
		}
		
		
		bw.close();
		
	}
	
	private static void reverse() { //!
	    String temp;
	    int i=0;
	    int size = list.size()-1;
		while(i<=size/2){
	    	temp=list.get(i);
	    	list.set(i, list.get(size));
	    	list.set(size, temp);
	    	i++;
	    	size--;
	    }
		
	}
	
	private static void delete() {
		list.removeFirst();
	
	}
	

}


package Baekjoon_Q_DEQUE;

import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
//**과정 연산 lfc
//팝연산 O1
//회전 연산 O1
//왼쪽 
//오른쪽 


//**정보 갱신 lfr
//판단 : index 0의 다음 목표물과 거리가 짧은 것  (왼쪽연산은 거리*2-1필요) 
//전체 읽어들임 On
//판단하기 위해 value 조회 O1
public class Main5 {
	//LinkedList to 회전연산 & removeFirst  
	private static	LinkedList<Integer> lfc = new LinkedList<>(); //list for calculate
		
	//ArrayList to 어떤 연산을 쓰는게 효율적인지 판단하기 위해여
	private static	ArrayList<Integer> lfr = new ArrayList<>(); //list for renewal 
	
	private static int count=0;
	
	//=================================연산
	private static void removeFirst() {
		lfc.removeFirst();
	}
	
	private static void moveLeft(){
		lfc.addLast(lfc.removeFirst());
	}
	
	private static void moveRight(){
		lfc.addFirst(lfc.removeLast());
	}
	
	//=================================정보갱신
	private static void renew() {
		lfr.clear();
		for(int i=0;i<lfc.size();i++) {
			lfr.add(lfc.get(i)); //조회 데이터 갱신
		}
	}
	//=================================판단
	private static void findBetterWay(int findValue) {
		int to = lfr.indexOf(findValue);
		int size = lfr.size();
		int i;
		
		if((to>(size/2))) { //역회전이 이득인경우
			for(i=0;i<size-to;i++) {
				moveRight(); //뒤->앞 n
				count++;
			}
			removeFirst(); //선단 삭제
			
		}
		else{			//회전이 이득인경우
	        for(i=0;i<to;i++) {
	        	moveLeft();
	        	count++;
	        }
	        removeFirst();
			
		}
	}
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int size = Integer.parseInt(st.nextToken());
		
		int tofind = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=1;i<=size;i++) {
			lfc.add(i);
		}
		
		for(int i=0;i<tofind;i++) {
			renew();
			findBetterWay(Integer.parseInt(st.nextToken()));
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
		}
}



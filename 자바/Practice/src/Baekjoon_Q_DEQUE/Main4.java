package Baekjoon_Q_DEQUE;

import java.util.*;
import java.io.*;


public class Main4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<String> q = new LinkedList<>();
		StringTokenizer input;
		StringTokenizer input2;
		int T = Integer.parseInt(br.readLine());
		int number=0;
		int findIndex=0;
		
		for(int i=0;i<T;i++) {
			q.clear();
			input = new StringTokenizer(br.readLine()," "); 
			
			number = Integer.parseInt(input.nextToken());
			findIndex = Integer.parseInt(input.nextToken()); 
			//System.out.println(number);
			//System.out.println(findIndex);
			
			input = new StringTokenizer(br.readLine()," "); 
			
			while(input.hasMoreTokens()) {
				q.add(input.nextToken());
				//System.out.println(q.removeFirst());
			}
			
			String find = q.get(findIndex);
			String[] busket;
			
			q.set(findIndex,q.get(findIndex)+" o");
			
			int count =1;
			
			while(q.size()!=0) {
				if(!Change(q)) {
					busket = q.removeFirst().split(" ");
					if(busket.length==2) {
						System.out.println(count);
						break;
					}
					else ++count;
				}
			}
			
			
		}

	}

	private static boolean Change(LinkedList<String> q) {
		for(int index=1;index<q.size();index++) {
	         if(q.get(0).compareTo(q.get(index).split(" ")[0])<0) { //ºñ±³
	        	 q.addLast(q.removeFirst());
	        	 return true;
	         }
	    }
	    return false;
	 }
	
	
	
  }


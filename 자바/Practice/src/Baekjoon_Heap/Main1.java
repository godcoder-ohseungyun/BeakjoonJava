package Baekjoon_Heap;
import java.io.*;
import java.util.*;

public class Main1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> Maxheap = new PriorityQueue<>(Collections.reverseOrder());
		//PriorityQueue<Integer> Maxheap = new PriorityQueue<>((o1,o1)->o2-o1); //람다식활용
		
	
		int T = Integer.parseInt(br.readLine());
		int value;
		for(int i=0;i<T;i++) {
			
		     value = Integer.parseInt(br.readLine());
		     
		     if(value==0) {
		    	 if(Maxheap.size()==0) {
		    		 bw.write("0\n");
		    	 }
		    	 else {
		    		 bw.write(Maxheap.poll()+"\n");
		    	 }
		     }
		     else {
		    	 Maxheap.add(value);
		     }
		     
		     bw.flush();
			
		}
		bw.close();
	
	}
}

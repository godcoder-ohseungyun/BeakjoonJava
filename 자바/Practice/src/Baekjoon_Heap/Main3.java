package Baekjoon_Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main3 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> { //람다식 + Comparator
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        }); //수를 비교하여 큰것을 반환하는 것에 오버라이딩 +절대값의 경우 추가인걸로 추정됨

        for(int i = 0 ; i < n; i++){
            int val = Integer.parseInt(br.readLine());
            if(val == 0){
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            }else{
                queue.add(val);
            }
        }
    }
}

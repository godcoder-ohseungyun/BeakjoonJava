package Baekjoon_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;

import Baekjoon_DFS_BFS.Main4.Point;

public class Main4_Thinking {

	/*
	 private static void BFS(int h,int l) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(h,l));
		map[h][l]=0; 
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			
			for(int i=0;i<4;i++) {
				int ny = p.y + y[i]; //행
				int nx = p.x + x[i]; //열
				
				if(ny>=N||ny<0||nx>=M||nx<0) continue;

				if(map[ny][nx]==1) {q.add(new Point(ny,nx)); map[ny][nx]=0;}
			}
			
			
		}
		
	}
	 */
	//위는 메모리 초과 x 아래는 메모리 초과 o why????=======================================================
	/*
	 private static void BFS(int h,int l) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(h,l));
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			map[p.y][p.x]=0;
			for(int i=0;i<4;i++) {
				int ny = p.y + y[i]; //행
				int nx = p.x + x[i]; //열
				
				if(ny>=N||ny<0||nx>=M||nx<0) continue;

				if(map[ny][nx]==1) q.add(new Point(ny,nx)); 
			}
			
			
		}
		
	}
	 */
	
	/*
	 * 111
	 * 111
	 * 111
	 * 
	 * 위 연산대로 따라가 보니 뽑을때 방문 표시를 하기때문에 뽑기전까진 stack이나 q에 저장했더라도 방문 여부를 확인 못함 따라서 중복 연산이 발생! -> 메모리 초과
	 */
	
}

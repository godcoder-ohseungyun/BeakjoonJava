package Baekjoon_DFS_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int h = sc.nextInt();
		
		int[] dx = {1,-1,0,0,-n,n};
		int[] dy = {0,0,1,-1, 0,0};
		
		boolean[][] ch = new boolean[n*h][m];
		int[][] map = new int[n*h][m];
		
		Queue<int[]> q = new LinkedList<int[]>();
		int zeronum = 0;
		int cnt = -1;
		for(int i=0;i<n*h;i++) {
			for(int j=0;j<m;j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j]==1) {
					q.add(new int[] {i,j,0});
					ch[i][j] = true;
				}
				else if(map[i][j]==-1)
					ch[i][j] = true;
				else
					zeronum++;
			}
		}

		if(zeronum==0) {
			System.out.println(0);
			return;
		}
		while(!q.isEmpty()) {
		
			int[] po = q.poll();
				cnt = po[2];

			for(int i=0;i<6;i++) {
				int x = po[0]+dx[i];
				int y = po[1]+dy[i];

				if(po[0]%n==0 && i==1)
					continue;
				
				if(po[0]%n==n-1 && i==0)
					continue;
				
				if(x<0||x>=n*h || y<0||y>=m|| ch[x][y]) continue;
				q.add(new int[]{x,y,po[2]+1});
				ch[x][y] = true;
				map[x][y] = 1;
				zeronum--;
			}
			
		}
	
		if(zeronum==0) {
			System.out.println(cnt);
		}
		else
			System.out.println(-1);
		
		
	}

}
package Baekjoon_DFS_BFS;
import java.util.*;
import java.io.*;
//vertex
//edges
public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int vertex = Integer.parseInt(br.readLine());
		int edges = Integer.parseInt(br.readLine());
		int i;
		int j;
		int[][] map = new int[vertex+1][vertex+1];
		boolean[] visited = new boolean[vertex+1];
		
		for(int e=0;e<edges;e++) {
			st =  new StringTokenizer(br.readLine()," ");
			i=Integer.parseInt(st.nextToken());
			j=Integer.parseInt(st.nextToken());
			map[i][j]=map[j][i]=1;
		}
		
		int count = BFS(vertex,visited,map);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(count+"");
		bw.newLine();
		bw.flush();
		bw.close();

	}
	
	private static int BFS(int vertex,boolean[] visited,int[][] map) {
		int count=0;
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		visited[1]=true;
		
		while(!q.isEmpty()) {
			int vtx = q.poll();
			
			for(int i=1;i<=vertex;i++) {
				if(map[vtx][i]==1&&!visited[i]) {
					q.add(i);
					visited[i]=true;
					count++;
				}
			}
			
		}
		
		return count;
	}

}

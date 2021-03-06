package boj_기초;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
 * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
 * 한 간선이 여러 번 주어질 수도 있는데, 간선이 하나만 있는 것으로 생각하면 된다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 
4 5 1
1 2
1 3
1 4
2 4
3 4

예제 출력 
1 2 4 3
1 2 3 4
 */

public class BOJ_1260 {
	public static Scanner sc;
	
	public static int numOfNode;
	public static int numOfEdge;
	public static int startNode;
	
	public static int [][]graph;
	public static boolean []visited;
	
	//data structure-> queue recursion instead of stack
	public static Queue<Integer> queue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		
		numOfNode = sc.nextInt();
		numOfEdge = sc.nextInt();
		startNode = sc.nextInt();
		
		graph = new int[1001][1001]; //여기서 노드 갯수만큼 동적할당했는데 RTE 나는데 이유가 먼지모르겠다
		visited = new boolean[10001];//여기서 노드 갯수만큼 동적할당했는데 RTE 나는데 이유가 먼지모르겠다
		queue = new LinkedList<>();
		
		
		//인접행렬 초기화
		for(int i = 0; i < numOfEdge; i++) {
			String colStr = sc.next();
			String rowStr = sc.next();
			
			int col = Integer.parseInt(colStr);
			int row = Integer.parseInt(rowStr);
			
			graph[col-1][row-1] = graph[row-1][col-1] = 1;
			
		}
		
		dfs(startNode - 1); //dfs
		
		//bfs 전 방문초기화
		for(int i = 0; i < numOfNode; i++){
			visited[i] = false;
		}
		System.out.println();
		bfs(startNode - 1); //bfs

	}
	
	public static void dfs(int node){
		
		visited[node] = true;
		System.out.print(node+1+" ");
		for(int i = 0; i < numOfNode; i++){
			if(!visited[i] && graph[node][i] == 1){
				dfs(i);
			}
		}
	}
	
	public static void bfs(int node){
		visited[node] = true;
		queue.offer(node);
		System.out.print(node+1+" ");
		while(!queue.isEmpty()){
			int cur = queue.poll();
			
			for(int i = 0; i < numOfNode; i++){
				if(!visited[i] && graph[cur][i] == 1){
					queue.offer(i);
					System.out.print(i+1+" ");
					visited[i] = true;
				}
			}
		}
	}
}

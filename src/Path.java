import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class Path {
	
	public int distance(int dist[], Boolean bool[])   
	{
		int minimum = Integer.MAX_VALUE , index = -1;
		for(int z=0 ; z<17; z++) {
			if(bool[z] == false && dist[z] <= minimum)
			{
				minimum = dist[z];
				index = z ;			
			}
		}
		return index ;
	}
	
	
	
	public void dijkstra(int graph[][] , int fromWhere,String from) 
	{
		int dist[] = new int[17];
		Boolean bool[]= new Boolean[17];
		

		for (int i = 0 ; i<17 ; i++) 
		{
			dist[i] = Integer.MAX_VALUE;
			bool[i] = false;
		}
		
		dist[fromWhere]=0;
		for (int j =0; j < 17 ; j++)
		{
			int k = distance(dist,bool);
			bool[k] = true;
			for (int x =0; x < 17 ; x++)
			{
				if(!bool[x]&& graph[k][x]!=0 && dist[k]!= Integer.MAX_VALUE && dist[k]+ graph[k][x] < dist[x] )
						{
							dist[x] = dist[k] + graph [k][x];
						}
			
			}
			
		}
		print(dist,from);
	}
	
	public void print(int dist[] ,String from) 
	{
		Graph gr = new Graph();
		Scanner scan = new Scanner(System.in);
		System.out.println("To Where");
		String toWhere=scan.nextLine();
			
		
		System.out.println("From  "+ from +"   TO   "+ toWhere + "  -->"+ dist[gr.cityToArray(toWhere)]);
		
	}
	
	
	
		
}
	
	
	

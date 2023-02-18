import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {
	
	
	
	public int cityToArray(String city) {
		int point=Integer.MIN_VALUE;
		
		switch(city) {
		  case "SAN RAFAEL":
			  point=0;
		    break;
		  case "P1":
			  point=1;
			    break;
		  case "OAKLAND":
			  point=2;
			    break;
		  case "DALY CITY":
			  point=3;
			    break;
		  case "SAN FRANCISCO":
			  point=4;
			    break;
		  case "SAN LORENZO":
			  point=5;
			    break;
		  case "DUBLIN":
			  point=6;
			    break;
		  case "P2":
			  point=7;
			    break;
		  case "SAN MATEO":
			  point=8;
			    break;
		  case "HAYWARD":
			  point=9;
			    break;
		  case "SAN JOSE":
			  point=10;
			    break;
		  case "P3":
			  point=11;
			    break;
		  case "REDWOOD CITY":
			  point=12;
			    break;
		  case "FREMONT":
			  point=13;
			    break;
		  case "MOUNTAIN VIEW":
			  point=14;
			    break;
		  case "CUPERTINO":
			  point=15;
			    break;
		  case "PALO ALTO":
			  point=16;
			    break;
			    
		  default:
		    System.out.println("City not found!!!");
		}
		
		return point;
		}

	public void mapToGraph() throws FileNotFoundException {  //txt yi arraye aktarýyor
		
		int [][]arr=new int [17][17];
		File file = new File("map.txt");
		Scanner input = new Scanner(file); 
		Path path=new Path();
		Scanner scan = new Scanner(System.in);
		 
		
		    while (input.hasNext()) {
		    
		     for(int i =0;i<17;i++) {
		    	 for(int j =0;j<17;j++) {
		    		 int sayi  = input.nextInt();
			    	 arr[i][j]=sayi;			    	
			     } 		    	
		     }		
		    }
		    System.out.println("From Where");
			String fromWhere=scan.nextLine();
		      
		   path.dijkstra(arr,cityToArray(fromWhere),fromWhere);	
	}
}

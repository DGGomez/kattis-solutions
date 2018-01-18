/**
 * 
 */
package nkattis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class Graph {

	    private int V;   // No. of vertices
	    private  long libCost, roadCost;

	    // Array  of lists for Adjacency List Representation
	    private LinkedList<Integer> adj[];

	    // Constructor
	    Graph(int v, long clib, long croad)
	    {
	        V = v;
	        libCost = clib;
	        roadCost = croad;
	        adj = new LinkedList[v+1];
	        for (int i=0; i<=v; ++i)
	            adj[i] = new LinkedList();
	    }

	    //Function to add an edge into the graph
	    void addEdge(int v, int w)
	    {
	        adj[v].add(w);  // Add w to v's list.
	        adj[w].add(v);
	    }

	    // A function used by DFS
	    long DFSUtil(int v,boolean visited[], long count)
	    {
	        // Mark the current node as visited and print it
	        visited[v] = true;


	        // Recur for all the vertices adjacent to this vertex
	        Iterator<Integer> i = adj[v].listIterator();
	        while (i.hasNext())
	        {
	            int n = i.next();
	            if (!visited[n])
	            {

	                count = 1+ DFSUtil(n, visited,count);
	            }
	        }
	        return count;
	    }

	    // The function to do DFS traversal. It uses recursive DFSUtil()
	    long DFS()
	    {
	        // Mark all the vertices as not visited(set as
	        // false by default in java)
	        boolean visited[] = new boolean[V+1];
	        long clusterSize = 0;
	        // Call the recursive helper function to print DFS traversal
	        long totalCost = 0;
	        long optimalOption = (libCost<roadCost)?libCost:roadCost;
	        for (int node = 1; node <= V; node++) {
	            if (!visited[node]) {
	                 clusterSize=DFSUtil(node, visited,1);
	                 //System.out.println("cluster size: "+clusterSize);
	                totalCost += libCost;
	                totalCost += (clusterSize - 1) * optimalOption;
	            }

	        }

	        return totalCost;
	    }

	    public static void main(String args[]) {

	        /*Graph g = new Graph(4);
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        System.out.println("Following is Depth First Traversal "+
	                "(starting from vertex 2)");
	       // System.out.println(g.DFS());
	        g.DFS();*/
	        Scanner in = new Scanner(System.in);

	        int tests = in.nextInt();
	        for (int t = 0; t < tests; t++) {
	            int n = in.nextInt(); // number of cities
	            int m = in.nextInt(); // number of roads
	            long clib = in.nextLong();
	            long croad = in.nextLong();
	            Graph g = new Graph(n,clib,croad);

	            for (int i = 0; i < m; i++) {
	                int u = in.nextInt();
	                int v = in.nextInt();
	                g.addEdge(u,v);
	            }

	            System.out.println(g.DFS());

	        }
	        in.close();

	    }
	
}

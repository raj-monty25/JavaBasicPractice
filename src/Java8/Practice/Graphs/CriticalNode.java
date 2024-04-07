package Practice.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * Find all Critical Connections in the Graph
 *
 * A critical connection refers to an edge that, upon removal, will make it impossible for certain nodes
 * to reach each other through any path. You are given an undirected connected graph with v vertices
 * and e edges and each vertex distinct and ranges from 0 to v-1, and you have to find all critical
 * connections in the graph. It is ensured that there is at least one such edge present.
 *
 * Note: The answers may be presented in various potential orders. Each edge should be displayed
 * in sorted order. For instance, if there's an edge between node 1 and node 2,
 * it should be stored as (1,2) rather than (2,1). Additionally, it is expected that you
 * store the edges in sorted order.
 */
public class CriticalNode {
    public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean visited[] = new boolean[v];
        int parent = -1;
        int disc[] = new int[v];
        int low[] = new int[v];

        int timer = 0;
        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i<v; i++) {
            if(!visited[i]) {
                dfs(i, parent, timer, disc, low, ans, visited, adj);
            }
        }

        Collections.sort(ans, new Comparator<ArrayList<Integer>>() {

            @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
                if ((a.get(0)-b.get(0)) == 0) {
                    return a.get(1) - b.get(1);
                }
                return a.get(0) - b.get(0);
            }
        });

        return ans;
    }

    private static void dfs(int node, int parent, int timer, int[] disc, int[] low,
                            ArrayList<ArrayList<Integer>> ans, boolean[] visited,
                            ArrayList<ArrayList<Integer>> list) {

        visited[node] = true;
        disc[node] = timer;
        low[node] = timer;
        timer++;

        for(Integer val : list.get(node)) {
            if (val == parent) {
                continue;
            }

            if(!visited[val]) {
                dfs(val, node, timer, disc, low, ans, visited, list);
                low[node] = Math.min(low[node], low[val]);
                if (low[val] > disc[node]) {
                    ArrayList<Integer> a = new ArrayList<>();

                    a.add(node);
                    a.add(val);
                    Collections.sort(a);
                    ans.add(a);
                }
            } else {
                low[node] = Math.min(low[node], disc[val]);
            }
        }
    }
}

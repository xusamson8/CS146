import java.util.Arrays;

public class hw12 {
    // keeps track of root parents
    private int[] p;

    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        // array hold copy of pipes in addition to space for the wells 
        int[][] nums = Arrays.copyOf(pipes, pipes.length + n);
        //virtual pipes for wells, connects well i to house i with cost of well[i]
        for (int i = 0; i < n; i++) {
            nums[pipes.length + i] = new int[] {0, i + 1, wells[i]};
        }

        //sorts costs for edges which are the pipes and wirtual well pipes 
        Arrays.sort(nums, (a, b) -> a[2] - b[2]);

        //each node becomes own parent?
        p = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            p[i] = i;
        }
        int ans = 0;
        //loop all edges, find and compute costs
        for (var x : nums) {
            int a = x[0], b = x[1], c = x[2];
            int pa = find(a), pb = find(b);
            // if the parents are different, combine and add costs
            if (pa != pb) {
                p[pa] = pb;
                ans += c;
                //decerment edges, if 0 then we stop
                if (--n == 0) {
                    return ans;
                }
            }
        }
        return ans;
    }
    //find root of parent
    private int find(int x) {
        //if its not its root parent, fidn its root parent
        if (p[x] != x) {
            p[x] = find(p[x]);
        }
        return p[x];
    }
    public static void main(String[] args) {
        //given test case, expected output:2
        hw12 solution = new hw12();
        int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};
        int result = solution.minCostToSupplyWater(n, wells, pipes);
        System.out.println("Minimum cost to supply water: " + result);
    }
}



public class hw12 {
    
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
    }
    public static void main(String[] args) {
        hw12 solution = new hw12();
        int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};
        int result = solution.minCostToSupplyWater(n, wells, pipes);
        System.out.println("Minimum cost to supply water: " + result);
    }
}

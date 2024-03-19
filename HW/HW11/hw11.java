package HW.HW11;

public class hw11 {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            // row , column
            if(image[sr][sc] == newColor){
                return image; // if the pixel is already the newColor, return it
            }
            helpFill(image, sr, sc, image[sr][sc], newColor); //use of the helper function , with the starting coordinate
            return image; //return the final image after everything is done
        }
    
        //void returns nothin, helper method, fills a pixel
        // this helper function is DFS
        /* calls itself recursively for adjacent pixels (up, down, left, right). 
        This is the depth-first aspect: before moving to the next adjacent pixel, 
        it attempts to color all pixels in one direction to the end 
        ( it goes as deep as possible in one direction before backtracking). */
        public void helpFill(int[][] image, int sr, int sc, int color, int newColor){
            // if the where we are going is OUT OF BOUNDs, then return without changing
            // when we return, then the recursion stops for that path
            //dont change it if the color doesnt match what we want to change, say we want to change 1 to 2s, and we come across a 3
            if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color) return;
            // if it IS within bounds and the color is the same ,THEN change it
            if(image[sr][sc] == color ){
                image[sr][sc] = newColor;
            }
            //recursive calls, this is depth first because it will recurse in that firection until it cant
            //these calls follow the steps, going right, left, up, down (4-way)
            helpFill(image, sr+1, sc, color, newColor);
            helpFill(image, sr-1, sc, color, newColor);
            helpFill(image, sr, sc+1, color, newColor);
            helpFill(image, sr, sc-1, color, newColor);
    
        }
        // for the given example 
        //helpFill(int[][] image, int sr, int sc, int color, int newColor)
        // woukld be (image, 1, 1, 1, 2), 
        //given that the color we want to chnage is out starting point , which is image[sr][sc] (look at the top)
    
    }
}

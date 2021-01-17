class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[r].length; c++){
                if(grid[r][c] == '1'){
                   count += dfs(grid, r, c);
                }
            }
        }
        return count;
    }
        
       public int dfs(char[][] grid, int r, int c){
            if(grid[r][c] == '1'){
                grid[r][c] = 0;
                
                if(r >= 1){
                    dfs(grid, r-1, c);
                }
                if(r + 1 < grid.length){
                    dfs(grid, r+1, c);
                }
                if(c >= 1){
                    dfs(grid, r, c-1);
                }
                if(c + 1 < grid[0].length){
                    dfs(grid, r, c+1);
                }
            }
            
            return 1;
        }
  
}

public class Flood_Fill_733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        // Grab the color of the starting pixel. (1 or 2).
        int color = image[sr][sc];

        // If the color of the pixel isn't the new color we want,
        // we need to do a flood fill.
        if(color != newColor) {
            dfs(image, sr, sc, color, newColor);
        }

        // Eventually we're going to return the same array we started with,
        // just with some of the colors/numbers changed.
        return image;
    }

    public static void dfs(int[][] image, int r, int c, int color, int newColor) {

        // If the current pixel is the old color, we need to change it and
        // perform DFS. Otherwise, we don't need to do anything since it must be
        // the right color already.
        if(image[r][c] == color) {

            // Start by changing it to the new color.
            image[r][c] = newColor;

            // Now we need to check the 4 cardinal directions.

            // This checks 'up' by seeing if the row is at least 1.
            // If the row is 0, we can't move up at all, so no point checking up.
            if(r >= 1) {
                dfs(image, r-1, c, color, newColor);
            }

            // This checks 'left' by seeing if the coloumn is at least 1.
            // If the column is 0, we can't move left at all, so no point checking left.
            if(c >= 1) {
                dfs(image, r, c-1, color, newColor);
            }

            // This checks 'down' by seeing if the current row hasn't reached
            // the bottom edge yet. If it has, we can't go down any further, so no
            // point checking down.
            if(r+1 < image.length) {
                dfs(image, r+1, c, color, newColor);
            }

            // This checks 'right' by seeing if the current column hasn't reached
            // the right side yet. We check image[0].length since we don't want to go
            // past the current array-row length. If we've reached the last column,
            // we can't go right any further, so no point in checking right.
            if(c+1 < image[0].length) {
                dfs(image, r, c+1, color, newColor);
            }
        }
    }
}

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PGMImage {
    int width;
    int height;
    int[][] array;

    PGMImage(int width, int height){
        this.width = width;
        this.height  = height;
        array = new int[width][height];
    }
    public void setPixel(int x, int y, int color) {
        int[][] ar = this.array;
        ar[x][y] = color;
    }
    public void saveTo(String filename) throws IOException {
        try(PrintStream out = new PrintStream(filename, StandardCharsets.UTF_8)){
            out.println("P2");
            out.println(width);
            out.println(height);
            out.println("255");
            for(int y = 0; y < height; y++){
                for(int x =0; x < width; x++){
                    out.print(array[x][y]);
                    out.print(" ");
                }
                out.println();
            }
        }
    }
}

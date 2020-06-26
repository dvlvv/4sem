public class Exam4sem {
    public static void main(String[] args) throws Exception{
        PGMImage one = new PGMImage(80,60);
        Randomazier(one);
        one.saveTo("random.pgm");
        PGMImage two = new PGMImage(80,60);
        Gradienter(two);
        two.saveTo("gradient.pgm");
    }
    public static void Randomazier(PGMImage image){
        for(int y = 0; y < image.height; y++){
            for(int x =0; x < image.width; x++)
                image.setPixel(x,y,(int) ( Math.random() * 256));
        }
    }
    public static void Gradienter(PGMImage image){
        for(int y = 0; y < image.height; y++){
            for(int x =0; x < image.width; x++)
                image.setPixel(x,y,(x + y) % 256);
        }
    }
}
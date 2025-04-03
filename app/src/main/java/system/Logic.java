package system;

public class Logic {
    // Will take a point of x,y coordinates and check if it inside the box.
    public static boolean contains(int x1 ,int y1,int x2, int y2, int width, int height){


        return insideLine(x1, x2, width) && insideLine(y1,y2,height);
    }

    public static boolean insideLine(int x1,int x2, int width){
        return x1 >= x2 && x1 <= x2+width;
    }
}

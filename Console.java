import java.awt.*;

public class Console {

    //Field

    private static String line = "null";
    private static String[] lines;

    //Methods

    public void setLine(String s){

        if (s != null) {
            line = s;
        } else {
            line = "null";
        }

    }

    public String getLine(){
        return line;
    }

    public void print(Graphics g){
        g.setColor(Color.ORANGE);
        g.drawString(getLine(), 0, 15);
    }

}

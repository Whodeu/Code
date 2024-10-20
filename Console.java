import java.awt.*;
import java.util.ArrayList;

public class Console implements XY {

    //Field

    private int Y = 15;
    private static ArrayList<String> lines = new ArrayList<String>();
    private static int count;

    //Methods

    public void addFirstLine(String s){
        lines.add(s);
    }

    public void addLine(String s){
        lines.remove(count);
        lines.add(s);
    }

    private void ConsoleEventText(Graphics g){
        g.setColor(Color.YELLOW);
        g.setFont(new Font("Bitstrean Charter", Font.BOLD, 15));
        g.drawString(lines.get(count), 0, getY());
        if (count < (lines.size() - 1)){
            count++;
        }else {
        }
    }

    private void PlayerCoordinate(Graphics g){
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        g.drawString("X = " + Rendi.player.getX(), 240, 40);
        g.drawString("Y = " + Rendi.player.getY(), 300, 40);
    }

    public void print(Graphics g){
        ConsoleEventText(g);
        g.setColor(Color.white);
        g.setFont(new Font("Bitstrean Charter", Font.BOLD, 20));
        g.drawString("Count Items: " + HelpClassGame.inventory.getSize(), 240, 20);
        PlayerCoordinate(g);

    }

    @Override
    public void setX(int i) {
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public void setY(int i) {
        Y = i;
    }

    @Override
    public int getY() {
        return Y;
    }
}

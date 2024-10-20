import javax.imageio.stream.IIOByteBuffer;
import javax.swing.*;
import java.awt.*;

public class Item extends ClassicItem implements XY{

    //Constructor

    public Item(String n, RareRate r){
        setTitleName(n);
        setRare(r);
    }

    public Item(String n, int i){
        setTitleName(n);
        setRareRateRandom(i);
    }

    //Field

    private int Y;
    private Color color;
    private Image ItemIcon = new ImageIcon("resource/textures/TestTexture.png").getImage();

    //Methods

    @Override
    public void setX(int i) {

    }

    @Override
    public int getX() {
        return 0;
    }

    public void setY(int i){
        if (i < 0){
            Y = 0;
        } else if (i > 450) {
            Y = 450;
        }else {
            Y = i;
        }
    }

    public int getY(){
        return Y;
    }



    private void ColorRare(RareRate rareRate){

        rareRate = getRare();

        switch (rareRate){
            case COMMON : color = Color.GRAY; break;
            case RARE: color = Color.BLUE;break;
            case EPIC: color = Color.MAGENTA; break;
            case LEGENDARY: color = Color.ORANGE; break;
        }

    }

    public void print(Graphics g){

        ColorRare(getRare());
        g.drawImage(ItemIcon, 0, 20, color, null);



    }

}

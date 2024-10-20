import javax.swing.*;
import java.awt.*;

public class BoxObject extends ClassicObject{

    //Field

    Image BoxIcon =  new ImageIcon("resource/textures/Box_placeholder.png").getImage();

    //Methods

    public void print(Graphics g){

        g.drawImage(BoxIcon, getX(), getY(), Color.ORANGE, null);


    }

}

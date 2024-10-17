import javax.swing.*;
import java.awt.*;

public class Player extends ClassicEntity {

    //Field

    private Image PlayerIcon = new ImageIcon("resource/textures/player_placeholder.jpg").getImage();

    //methods

    public void print(Graphics g){

        g.drawImage(PlayerIcon, getX(), getY(), null);

    }

}
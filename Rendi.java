import javax.swing.*;
import java.awt.*;

public  class Rendi extends JComponent {

    Image bg = new ImageIcon("resource/textures/GraceTexture.jpg").getImage();
    //Image TestTexture = new ImageIcon("resource/textures/TestTexture.png").getImage()
    static Player player = new Player();
    static BoxObject boxObject = new BoxObject();
    static Console console = new Console();


    public void paint(Graphics g){
        g.drawImage(bg, 0, 0, null);
        boxObject.print(g);
        player.print(g);
        console.print(g);
    }

}

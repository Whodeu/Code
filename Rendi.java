import javax.swing.*;
import java.awt.*;

public  class Rendi extends JComponent {

    Image bg = new ImageIcon("resource/textures/GraceTexture.jpg").getImage();
    //Image TestTexture = new ImageIcon("resource/textures/TestTexture.png").getImage()
    static Player player = new Player();
    static BoxObject boxObject = new BoxObject();
    static Console console = new Console();
    HelpClassGame helpClassGame = new HelpClassGame();


    public void paint(Graphics g){
        g.drawImage(bg, 0, 0, null);
        boxObject.print(g);
        player.print(g);
        console.print(g);
        if (HelpClassGame.inventory.getSize() != 0){
            helpClassGame.item = (Item) HelpClassGame.inventory.getitem();
            helpClassGame.item.print(g);

        }else {

        }
    }

}

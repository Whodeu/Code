import javax.swing.*;
import java.awt.*;

public class Player extends ClassicEntity {


    //Field

    private String name = "Player";
    private Image PlayerIcon = new ImageIcon("resource/textures/Player.png").getImage();
    private Color SkinColor;


    //methods

    public void setName(String s){
        switch (s){
            case "" : name = "Player" + new RandNum().RandNUM(1000); break;
            default: name = s; break;
        }
    }

    public String getName(){
        return name;
    }

    public void SkinRandomChoose(int i){
        switch (i){
            case 0 : SkinColor = Color.RED; break;
            case 1 : SkinColor = Color.BLUE; break;
            case 2 : SkinColor = Color.ORANGE; break;
            case 3 : SkinColor = Color.MAGENTA; break;
            case 4 : SkinColor = Color.CYAN; break;
        }
    }

    public void SkinChoose(Skins i){
        switch (i){
            case SKIN1 : SkinColor = Color.RED; break;
            case SKIN2 : SkinColor = Color.BLUE; break;
            case SKIN3 : SkinColor = Color.ORANGE; break;
            case SKIN4 : SkinColor = Color.MAGENTA; break;
            case SKIN5 : SkinColor = Color.CYAN; break;
        }
    }


    private void HealGraf(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(getX()-2, getY()-5, 35, 2);
        g.setColor(Color.green);
        g.fillRect(getX()-2, getY()-5, getHeal(), 2);
    }

    private void NickName(Graphics g){
        g.setColor(Color.WHITE);
        g.drawString(name, getX()-4, getY()-10);
    }

    public void print(Graphics g){

        HealGraf(g);
        NickName(g);
        g.drawImage(PlayerIcon, getX(), getY(), SkinColor,  null);

    }

}
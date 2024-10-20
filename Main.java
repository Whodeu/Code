import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    //Field

    private static final String VERSION = "2.0.0";
    private JFrame frame;
    private  Rendi rendi;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 450;
    private static HelpClassGame helpClassGame = new HelpClassGame();
    private Thread thread;


    //Methods

    //public static String getVersion(){
    //    return VERSION;
    //}

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main().Start();
    }

    public void Start() {

        Rendi.player.setName(JOptionPane.showInputDialog("Set Name"));
        frame = new JFrame("[OFFLINE] Version " + VERSION);
        rendi = new Rendi();
        Rendi.console.addFirstLine("set all ");
        frame.getContentPane().add(rendi);
        frame.addKeyListener(new moves());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(789, 313);
        helpClassGame.SetPos();
        Rendi.console.addLine("seting pose.. ");
        thread = new Thread(new UpdateClass());
        thread.setName("Update");
        thread.start();
        frame.setVisible(true);
        Rendi.console.addLine("Done!");
        Rendi.console.addLine("Welcome to Version " + VERSION);
        while (true){
            frame.setSize(WIDTH, HEIGHT);
        }
    }


    private void update(){
        rendi.repaint();
    }

    private class moves implements KeyListener{
        private static final int SPEED = 1;
        public void keyTyped(KeyEvent e) {

        }

        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_UP){
                Rendi.player.setY(Rendi.player.getY() - SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                Rendi.player.setY(Rendi.player.getY() + SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                Rendi.player.setX(Rendi.player.getX() - SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                Rendi.player.setX(Rendi.player.getX() + SPEED);
            }

            if (e.getKeyCode() == KeyEvent.VK_1){
                if(HelpClassGame.inventory.getSize() != 0){
                    Rendi.console.addLine(  HelpClassGame.inventory.getNameOfItem() + HelpClassGame.inventory.getIDitem() + " removed");
                    HelpClassGame.inventory.removeItem(HelpClassGame.inventory.getIDitem());
                }else {
                    Rendi.console.addLine("There is nothing to remove!");
                    Rendi.player.setHeal(Rendi.player.getHeal()-5);

                }

            }

        }

        public void keyReleased(KeyEvent e) {

        }
    }

    private class UpdateClass implements Runnable{

        public void run() {

            while (true){
                update();
                helpClassGame.CollectBox();
            }

        }

    }

}
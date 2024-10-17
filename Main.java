import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {

    //Field

    private JFrame frame;
    private  Rendi rendi;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 450;
    //private Player player = new Player();
    private static HelpClassGame helpClassGame = new HelpClassGame();
    private Thread thread;
    private JTextArea textArea = new JTextArea(10, 10);


    //Methods

    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Main().Start();
    }

    public void Start(){

        textArea.setEditable(false);
        frame = new JFrame("[OFFLINE] Version 2.0.0");
        rendi = new Rendi();
        textArea.append("set all " + "\n");
        frame.getContentPane().add(rendi);
        frame.addKeyListener(new moves());
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocation(789, 313);
        helpClassGame.SetPos();
        textArea.append("seting pose.. " + "\n");
        thread = new Thread(new UpdateClass());
        thread.setName("Update");
        thread.start();
        frame.setVisible(true);
        textArea.append("Done! " + "\n");

        while (true){
            frame.setSize(WIDTH, HEIGHT);
            frame.setLocation(789, 313);


        }
    }

    private void TextConsole(){
        Rendi.console.setLine(textArea.getText());
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
                rendi.player.setY(rendi.player.getY() - SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                rendi.player.setY(rendi.player.getY() + SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                rendi.player.setX(rendi.player.getX() - SPEED);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                rendi.player.setX(rendi.player.getX() + SPEED);
            }

        }

        public void keyReleased(KeyEvent e) {

        }
    }

    private class UpdateClass implements Runnable{

        public void run() {

            while (true){
                update();
                TextConsole();
                helpClassGame.CollectBox();

            }

        }

    }

}
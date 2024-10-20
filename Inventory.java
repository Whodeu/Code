import java.util.ArrayList;

public class Inventory {

    //Field


    private int IDinv = -1;
    private ArrayList<ClassicItem> items = new ArrayList<>();
    //private Image InvBar = new ImageIcon("resource/textures/TestTexture.png").getImage();

    //methods

    public void addItem(ClassicItem item){
        items.add(item);
        ++IDinv;
        System.out.println(item.getTitleName() + IDinv +" Added to inventory");

    }

    public void removeItem(int i){
        System.out.println(items.get(i).getTitleName() + IDinv +" removed from inventory");
        items.remove(i);
        --IDinv;
    }

    public int getIDitem(){
        return IDinv;
    }

    public int getSize(){
        return items.size();
    }

    public static void main(String[] args) {
        System.out.println(new Inventory().getSize());
    }

    public Object getitem(){
        return items.get(IDinv);
    }

    public Object getitem(int n){
        return items.get(n);
    }

    public String getNameOfItem(){
        return items.get(IDinv).getTitleName();
    }

}

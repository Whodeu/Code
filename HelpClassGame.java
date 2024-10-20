import java.lang.ref.ReferenceQueue;

public class HelpClassGame {

    //Field


    //Main m = new Main();
    Item item;
    static Inventory inventory = new Inventory();

    //methods

    public void SetPos(){
        Rendi.player.setX(35);
        Rendi.player.setY(35);
        Rendi.player.SkinRandomChoose(new RandNum().RandNUM(5));
        Rendi.boxObject.setX(new RandNum().RandNUM(300));
        Rendi.boxObject.setY(new RandNum().RandNUM(300));
    }

    //public void createItems(){
    //
    //}

    private void CreateItem(){

        inventory.addItem(new Item("[TEST]item", new RandNum().RandNUM(4)));
        item = (Item) inventory.getitem();
        //System.out.println(item.hashCode());
        System.out.println(item.getTitleName()+ " rare is -> " +item.getRare());

    }

    public void CollectBox(){

        if (Rendi.player.getX() == Rendi.boxObject.getX()  && Rendi.player.getY() == Rendi.boxObject.getY()){

            Rendi.boxObject.setX(new RandNum().RandNUM(300));
            Rendi.boxObject.setY(new RandNum().RandNUM(300));
            System.out.println("Collected");

            CreateItem();

            Rendi.player.setHeal(Rendi.player.getHeal() + 5);

            Rendi.console.addLine(HelpClassGame.inventory.getNameOfItem() + HelpClassGame.inventory.getIDitem() + " Collected");

        }else{

        }

    }

    //public void invPose(){
    //    Item item1 = (Item) inventory.getitem((inventory.getIDitem() - 1));
    //    if (inventory.getSize() != 2){
    //        if (item.getY() == item1.getY()) {
    //            item.setY(item.getY() + 10);
    //        }
    //    }else {
    //
    //    }
    //
    //}

}

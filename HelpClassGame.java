public class HelpClassGame {

    //Field

    Rendi rendi = new Rendi();
    //Main m = new Main();

    //methods

    public void SetPos(){
        Rendi.player.setX(35);
        Rendi.player.setY(35);
        Rendi.boxObject.setX(new RandNum().RandNUM(300));
        Rendi.boxObject.setY(new RandNum().RandNUM(300));
    }


    public void CollectBox(){

        if (Rendi.player.getX() == Rendi.boxObject.getX()  && Rendi.player.getY() == Rendi.boxObject.getY()){

            Rendi.boxObject.setX(new RandNum().RandNUM(300));
            Rendi.boxObject.setY(new RandNum().RandNUM(300));
            System.out.println("Collected");

        }else{



        }

    }

}

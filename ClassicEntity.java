public abstract class ClassicEntity implements XY {

    //Constructor

    //Nope XD

    //Field

    private boolean Alive;
    private int HP = 35;
    private int x;
    private int y;

    //Methods

    public int getHeal(){
        return HP;
    }

    public void setHeal(int i){
        if(i >= 35){
            HP = 35;
        }else if(i <= 0){
            HP = 0;
        }else {
            HP = i;
        }
    }

    public void setX(int i){
        if (i < 0){
            x = 0;
        } else if (i > 355) {
            x = 355;
        }else {
            x = i;
        }
    }

    public void setY(int i){
        if (i < 0){
            y = 0;
        } else if (i > 382) {
            y = 382;
        }else {
            y = i;
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

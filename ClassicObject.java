public abstract class ClassicObject implements XY {

    private int Points;
    private int x;
    private int y;

    //Methods

    public void setX(int i){
        if (i < 0){
            x = 0;
        } else if (i > 400) {
            x = 400;
        }else {
            x = i;
        }
    }

    public void setY(int i){
        if (i < 0){
            y = 0;
        } else if (i > 450) {
            y = 450;
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

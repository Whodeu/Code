public abstract class ClassicItem implements XY {

    //Field

    private String titleName;
    private RareRate rareRate;
    //private int ID;

    //Constructor

    //public abstract ClassicItem(String n; RareRate r){
    //    setTitleName(n);
    //    setRare(r);
    //}

    //Methods

    public void setTitleName(String name){
        titleName = name;
    }

    public String getTitleName(){
        return titleName;
    }

    //public int getIDitem(){
    //    return ID;
    //}

    public void setRare(RareRate r){

        switch (r){
            case EPIC :
            case RARE :
            case COMMON :
            case LEGENDARY :
            default : rareRate = r; break;
        }

    }

    public RareRate getRare(){
        return rareRate;
    }

    public void setRareRateRandom(int i){

        switch (i){

            case 0 : rareRate = RareRate.COMMON; break;
            case 1 : rareRate = RareRate.RARE; break;
            case 2 : rareRate = RareRate.EPIC; break;
            case 3 : rareRate = RareRate.LEGENDARY;break;

        }

    }

}
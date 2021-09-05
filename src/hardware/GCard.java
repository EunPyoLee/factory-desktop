package hardware;

public abstract class GCard {
    private String brandName;

    public GCard(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }
}

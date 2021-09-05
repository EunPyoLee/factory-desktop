package hardware;

public abstract class RAM {
    private String brandName;

    public RAM(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }
}

package hardware;

public abstract class CPU {
    private String brandName;

    public CPU(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName(){
        return brandName;
    }
}

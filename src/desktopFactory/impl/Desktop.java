package desktopFactory.impl;

public abstract class Desktop {
    private String cpu;
    private String gcard;
    private String ram;

    public String getCpu(){
        return cpu;
    }

    public String getGcard(){
        return gcard;
    }

    public String getRam(){
        return ram;
    }
}

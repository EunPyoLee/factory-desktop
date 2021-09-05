package desktopFactory;

import hardware.CPU;
import hardware.GCard;
import hardware.RAM;

public abstract class Desktop {
    private CPU cpu;
    private GCard gcard;
    private RAM ram;

    public Desktop(CPU cpu, GCard gcard, RAM ram){
        this.cpu = cpu;
        this.gcard = gcard;
        this.ram = ram;
    }

    public String getCpuBrandName(){
        return cpu.getBrandName();
    }

    public String getGcardBrandName(){
        return gcard.getBrandName();
    }

    public String getRamBrandName(){
        return ram.getBrandName();
    }
}

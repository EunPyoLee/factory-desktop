package desktopFactory.impl.amd;

import desktopFactory.Desktop;
import hardware.CPU;
import hardware.GCard;
import hardware.RAM;

public class AMDDesktop extends Desktop {
    public AMDDesktop(CPU cpu, GCard gcard, RAM ram){
        super(cpu, gcard, ram);
    }
}

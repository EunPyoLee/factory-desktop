package desktopFactory.impl.intel;

import desktopFactory.Desktop;
import hardware.CPU;
import hardware.GCard;
import hardware.RAM;

public class IntelDesktop extends Desktop {
    public IntelDesktop(CPU cpu, GCard gcard, RAM ram){
        super(cpu, gcard, ram);
    }
}

package hardware.amd;

import hardware.CPU;
import hardware.GCard;
import hardware.HWFactory;
import hardware.RAM;

public class AMDHWFactory implements HWFactory {
    @Override
    public CPU createCPU() {
        return new Ryzen();
    }

    @Override
    public GCard createGCard() {
        return new Radeon();
    }

    @Override
    public RAM createRAM() {
        return new AMDMemeory();
    }
}

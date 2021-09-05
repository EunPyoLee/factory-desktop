package hardware.intel;

import hardware.CPU;
import hardware.GCard;
import hardware.HWFactory;
import hardware.RAM;

public class IntelHWFactory implements HWFactory {
    @Override
    public CPU createCPU() {
        return new ISeries();
    }

    @Override
    public GCard createGCard() {
        return new Xe();
    }

    @Override
    public RAM createRAM() {
        return new Optane();
    }
}

package desktopFactory.impl.intel;

import desktopFactory.Desktop;
import desktopFactory.DesktopFactory;
import hardware.HWFactory;
import hardware.intel.IntelHWFactory;

public class IntelStore implements DesktopFactory {
    private HWFactory intelHWFactory;
    public IntelStore(){
        this.intelHWFactory = new IntelHWFactory();
    }
    @Override
    public Desktop createDesktop() {
        return new IntelDesktop(intelHWFactory.createCPU(), intelHWFactory.createGCard(), intelHWFactory.createRAM());
    }
}

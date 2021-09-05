package desktopFactory.impl.amd;

import desktopFactory.Desktop;
import desktopFactory.DesktopFactory;
import hardware.HWFactory;
import hardware.amd.AMDHWFactory;

public class AMDStore implements DesktopFactory {
    private HWFactory amdHWFactory;
    public AMDStore(){
        this.amdHWFactory = new AMDHWFactory();
    }
    @Override
    public Desktop createDesktop() {
        return new AMDDesktop(amdHWFactory.createCPU(), amdHWFactory.createGCard(), amdHWFactory.createRAM());
    }
}

import desktopFactory.Desktop;
import desktopFactory.DesktopFactory;
import desktopFactory.impl.amd.AMDStore;
import desktopFactory.impl.intel.IntelStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesktopFactoryTest {
    @Test
    public void testIntelDesktopFactory(){
        DesktopFactory intelStore = new IntelStore();
        Desktop intelDesktop =  intelStore.createDesktop();
        Assertions.assertEquals(intelDesktop.getCpuBrandName(), "[Intel]ISeries");
        Assertions.assertEquals(intelDesktop.getGcardBrandName(), "[Intel]Xe");
        Assertions.assertEquals(intelDesktop.getRamBrandName(), "[Intel]Optane");
    }

    @Test
    public void testAMDDesktopFactory(){
        DesktopFactory amdStore = new AMDStore();
        Desktop amdDesktop =  amdStore.createDesktop();
        Assertions.assertEquals(amdDesktop.getCpuBrandName(), "[AMD]Ryzen");
        Assertions.assertEquals(amdDesktop.getGcardBrandName(), "[AMD]Radeon");
        Assertions.assertEquals(amdDesktop.getRamBrandName(), "[AMD]AMDMemoery");
    }
}

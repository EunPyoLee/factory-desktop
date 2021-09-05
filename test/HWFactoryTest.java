import hardware.CPU;
import hardware.GCard;
import hardware.HWFactory;
import hardware.RAM;
import hardware.amd.AMDHWFactory;
import hardware.intel.IntelHWFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HWFactoryTest {
    @Test
    public void testIntelHWFactory(){
        HWFactory intelHWFactory = new IntelHWFactory();
        CPU intelCPU = intelHWFactory.createCPU();
        GCard intelGcard = intelHWFactory.createGCard();
        RAM intelRAM = intelHWFactory.createRAM();
        Assertions.assertEquals(intelCPU.getBrandName(), "[Intel]ISeries");
        Assertions.assertEquals(intelGcard.getBrandName(), "[Intel]Xe");
        Assertions.assertEquals(intelRAM.getBrandName(), "[Intel]Optane");
    }

    @Test
    public void testAMDHWFactory(){
        HWFactory amdHWFactory = new AMDHWFactory();
        CPU amdCPU = amdHWFactory.createCPU();
        GCard amdGcard = amdHWFactory.createGCard();
        RAM amdRAM = amdHWFactory.createRAM();
        Assertions.assertEquals(amdCPU.getBrandName(), "[AMD]Ryzen");
        Assertions.assertEquals(amdGcard.getBrandName(), "[AMD]Radeon");
        Assertions.assertEquals(amdRAM.getBrandName(), "[AMD]AMDMemoery");
    }
}

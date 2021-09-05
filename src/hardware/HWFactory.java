package hardware;

public interface HWFactory {
    CPU createCPU();
    RAM createRAM();
    GCard createGCard();
}

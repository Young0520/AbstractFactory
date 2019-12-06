package Factory;

import interfaces.*;
import Class.*;

public class NormalFactory extends ComputerFactory {
    @Override
    public CPU createCPU() {
        return new NormalCPU();
    }

    @Override
    public RAM createRAM() {
        return new NormalRAM();
    }

    @Override
    public GC createGC() {
        return new NormalGC();
    }
}

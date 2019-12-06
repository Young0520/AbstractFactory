package Factory;

import interfaces.*;
import Class.*;

public class ExcellentFactory extends ComputerFactory {
    @Override
    public CPU createCPU() {
        return new ExcellentCPU();
    }

    @Override
    public RAM createRAM() {
        return new ExcellentRAM();
    }

    @Override
    public GC createGC() {
        return new ExcellentGC();
    }
}

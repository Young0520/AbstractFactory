package Factory;

import interfaces.*;

public abstract class ComputerFactory {
    //配置CPU
    public abstract CPU createCPU();
    //配置内存
    public abstract RAM createRAM();
    //配置显卡
    public abstract GC createGC();

}

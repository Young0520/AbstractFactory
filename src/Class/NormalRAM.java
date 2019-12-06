package Class;

import interfaces.RAM;

public class NormalRAM implements RAM {
    @Override
    public void ram() {
        System.out.println("配置性能一般的内存");
    }
}

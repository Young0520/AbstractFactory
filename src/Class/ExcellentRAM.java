package Class;

import interfaces.RAM;

public class ExcellentRAM implements RAM {
    @Override
    public void ram() {
        System.out.println("配置高性能的内存");
    }
}

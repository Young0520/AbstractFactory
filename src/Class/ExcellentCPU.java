package Class;

import interfaces.CPU;

public class ExcellentCPU implements CPU {
    @Override
    public void cpu() {
        System.out.println("配置高性能的CPU");
    }
}

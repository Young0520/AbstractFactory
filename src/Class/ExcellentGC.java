package Class;

import interfaces.GC;

public class ExcellentGC implements GC {
    @Override
    public void gc() {
        System.out.println("配置高性能的显卡");
    }
}

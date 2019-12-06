package Class;

import interfaces.GC;

public class NormalGC implements GC {
    @Override
    public void gc() {
        System.out.println("配置性能一般的显卡");
    }
}

package terrell.chen.learn.JVM.memory.allocation;
/**
 * @author: TerrellChen
 * @version: Created in 00:32 2019-01-04
 */

/**
 * Description:
 * vm options: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * 观察到allocation4申请失败，进行一次GC，allocation123均进入老年代
 */
public class MinorGC {
    private static final int _1MB = 1024 * 1024;

    public static void testAlocation(){
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testAlocation();
    }
}

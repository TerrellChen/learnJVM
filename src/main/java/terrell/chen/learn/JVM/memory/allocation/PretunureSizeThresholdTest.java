package terrell.chen.learn.JVM.memory.allocation;
/**
 * @author: TerrellChen
 * @version: Created in 00:41 2019-01-04
 */

/**
 * Description:
 * vm options: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
 * 观察到 allocation 直接进入老年代
 */
public class PretunureSizeThresholdTest {
    private static final int _1MB= 1024 * 1024;

    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}

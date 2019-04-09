package terrell.chen.learn.JVM.memory.allocation;
/**
 * @author: TerrellChen
 * @version: Created in 00:45 2019-01-04
 */

/**
 * Description:
 * vm options: -verbose:gc -XX:+PrintGCDetails -XX:+UseSerialGC -XX:SurvivorRatio=4 -Xms20M -Xmx20M -Xmn10M
 * -XX:MaxTenuringThreshold=1 from space(survivor) 空间被占用(allocation1)
 * -XX:MaxTenuringThreshold=15 from space(survivor) 空间为空，老年代被占用对应空间
 * -XX:SurvivorRatio=8 时，无论MaxTenuringThreshold=1 或 =15 ，因survivor被占用空间超过50%，表现均为；空间为空，上升至老年代
 */
public class SurvivorToOld {
    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold(){
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}

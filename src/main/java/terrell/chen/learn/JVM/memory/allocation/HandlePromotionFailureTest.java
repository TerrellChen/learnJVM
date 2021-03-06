package terrell.chen.learn.JVM.memory.allocation;
/**
 * @author: TerrellChen
 * @version: Created in 01:06 2019-01-04
 */

/**
 * Description:
 * vm options: -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:-HandlePromotionFailure
 * jdk6之后该参数无影响
 * jdk8无该参数
 */
public class HandlePromotionFailureTest {

    private static final int _1MB = 1024 * 1024;

    public static void testHandlePromotionFailure(){
        byte[] allocation1,allocation2,allocation3,allocation4,allocation5,allocation6,allocation7;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation1 = null;
        allocation4 = new byte[2 * _1MB];
        allocation5 = new byte[2 * _1MB];
        allocation6 = new byte[2 * _1MB];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _1MB];
    }

    public static void main(String[] args) {
        testHandlePromotionFailure();
    }
}

package terrell.chen.learn.JVM.gc;
/**
 * @author: TerrellChen
 * @version: Created in 21:39 2018-12-10
 */

/**
 * Description: GC是否使用引用计数法的测试
 * JDK8: 没 Young被回收
 */
public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}

package terrell.chen.learn.JVM.memory.error;
/**
 * @author: TerrellChen
 * @version: Created in 21:19 2018-12-10
 */

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Description: 直接分配本机内存溢出测试
 * book(JDK6): OOM
 * JDK8: 指定-Xmx -XX:MaxDirectMemorySize 之后，仍然没有异常抛出
 */
public class DirectMemoryOOM {
    private static final int _1MB= 1024 * 1024;

    public static void main(String[] args) throws Exception{
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true){
            unsafe.allocateMemory(_1MB);
        }
    }
}

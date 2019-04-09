package terrell.chen.learn.JVM.memory.error;
/**
 * @author: TerrellChen
 * @version: Created in 01:46 2018-12-08
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 运行时常量池导致内存溢出测试
 * book(JDK6): OOM PermGen space
 * JDK8: OOM Java heap space
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}

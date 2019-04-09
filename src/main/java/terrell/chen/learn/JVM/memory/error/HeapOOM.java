package terrell.chen.learn.JVM.memory.error;
/**
 * @author: TerrellChen
 * @version: Created in 22:11 2018-12-06
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 堆内存溢出测试
 * book(JDK6): OOM Java heap space
 * JDK8: OOM Java heap space
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        try {

            while (true) {
                list.add(new OOMObject());
            }
        } catch (Throwable e){
            System.out.println("Its me");
            e.printStackTrace();
        }
    }
}

package terrell.chen.learn.JVM.memory.error;
/**
 * @author: TerrellChen
 * @version: Created in 01:08 2018-12-08
 */

/**
 * Description: 虚拟机栈和本地方法栈OOM测试
 * book(JDK6): SOF length:2402
 * JDK8: SOF length:18000+
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {

        JavaVMStackSOF oom = new JavaVMStackSOF();
        oom.stackLeak();
    }
}

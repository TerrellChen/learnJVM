package terrell.chen.learn.JVM.memory.error;
/**
 * @author: TerrellChen
 * @version: Created in 01:12 2018-12-08
 */

/**
 * Description: 创建线程导致内存溢出测试
 * book(JDK6): OOM unable to create new native thread
 * JDK8: 没有异常抛出，空跑跑满CPU多核，冬季暖手代码～
 */
public class JavaVMStackOOM {
    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread() {
        while (true){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            }
            );
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}

public class TestVar {
    final String name;
    public TestVar(){
        name = "zjd";
    }
    static final int[] a = new int[10];

    static void cal(){
        System.out.println(a[0]);
    }
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(a[0]);
        cal();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.sleep(1000);
        Thread.sleep(1000);  //sleep与t1无关，与Thread（当前运行线程）
        t2.wait();

    }
}

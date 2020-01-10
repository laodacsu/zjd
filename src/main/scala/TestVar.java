public class TestVar {
    final String name;
    public TestVar(){
        name = "zjd";
    }
    static final int[] a = new int[10];

    static void cal(){
        System.out.println(a[0]);
    }
    public static void main(String[] args) {
//        System.out.println(a[0]);
        cal();
    }
}

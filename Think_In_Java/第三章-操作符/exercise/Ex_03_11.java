public class Ex_03_11 {
    public static void main(String[] args) {
        int n1 = 0x80000000;
        for (int i = 0; i < 32; i++)
            System.out.println("移位第" + i + "次:" + Integer.toBinaryString(n1 >> i));
    }
}

public class Ex_03_10 {
    public static void main(String[] args) {
        int a = 0x5;
        int b = 0x2a;
        System.out.println(Integer.toBinaryString(a) + "&" + Integer.toBinaryString(b)
                + "=" + Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a) + "|" + Integer.toBinaryString(b)
                + "=" + Integer.toBinaryString(a | b));
        System.out.println("~" + Integer.toBinaryString(a) + "=" + Integer.toBinaryString(~a));
        System.out.println("~" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(~b));
    }
}

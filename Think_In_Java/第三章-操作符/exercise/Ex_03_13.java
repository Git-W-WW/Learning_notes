public class Ex_03_13 {
    public static void main(String[] args) {
        System.out.println("A:" + displayChar('A'));
        System.out.println("W:" + displayChar('W'));
        System.out.println("?:" + displayChar('?'));
    }
    public static String displayChar(char c){
        return Integer.toBinaryString(c);
    }
}

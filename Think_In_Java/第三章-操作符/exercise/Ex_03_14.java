public class Ex_03_14 {
    public static void main(String[] args) {
        test("abc", "abc");
        String s1 = new String("abc");
        test("abc", s1);
        String s2 = "abc";
        test("abc", s2);
        test(s1, s2);
    }
    public static void test(String s1, String s2){
        // 注意这里写了个括号，否则为先连接再比较
        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s1 != s2:" + (s1 != s2));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
    }
}

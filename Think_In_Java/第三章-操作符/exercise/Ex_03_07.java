import java.util.Random;

public class Ex_03_07 {
    static boolean flip_coin(){
        Random random = new Random();
        double temp = Math.random();
        return temp < 0.5;
    }

    public static void main(String[] args) {
        int i = 1;
        while(i < 6){
            if(flip_coin())
                System.out.println("第"+i+"次为正面");
            else
                System.out.println("第"+i+"次为反面");
            i++;
        }
    }
}

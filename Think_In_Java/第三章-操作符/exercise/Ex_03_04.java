import java.util.Scanner;

public class Ex_03_04 {
    static double speed(double distance, double time){
        return distance / time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        System.out.printf("%.2f", speed(distance, time));
    }
}

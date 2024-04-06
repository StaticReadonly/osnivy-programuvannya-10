import java.util.ArrayList;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
    }

    public static void task1(){
        System.out.println("Task 1");

        IFunction func1 = (double a, double b, double c, double d) -> {
            return sqrt(abs(sin(a) - 4.0 * log(b) / pow(c,d)));
        };
        IFunction func2 = (double a, double b, double c, double d) -> {
            return abs(atan(d)) * (exp(a) + 3.0 * log10(c)) / sqrt(pow(b, c));
        };
        IFunction func3 = (double a, double b, double c, double d) -> {
            return pow((2.0 * sin(a) + cos(abs(b * sqrt(c)))), d);
        };

        double[][] params = new double[3][4];
        params[0][0] = -1.49; params[0][1] = 23.4; params[0][2] = 1.23; params[0][3] = 2.542;
        params[1][0] = 2.34; params[1][1] = 0.756; params[1][2] = 2.23; params[1][3] = -1.653;
        params[2][0] = 1.234; params[2][1] = -3.12; params[2][2] = 5.45; params[2][3] = 2.0;

        for(int i = 0; i < params.length; i++){
            System.out.println("Function " + (i + 1) + "; res:");
            switch (i){
                case 0:{ System.out.println(func1.calculate(params[i][0], params[i][1], params[i][2], params[i][3])); break;}
                case 1:{ System.out.println(func2.calculate(params[i][0], params[i][1], params[i][2], params[i][3])); break;}
                default:{ System.out.println(func3.calculate(params[i][0], params[i][1], params[i][2], params[i][3]));}
            }
        }
    }

    public static void task2(){
        System.out.println("Task 2");

        ArrayList<Pixel> pixels = new ArrayList<>();
        pixels.add(new Pixel(1,1));
        pixels.add(new Pixel(2,2));
        pixels.add(new Pixel(3,3));
        pixels.add(new Pixel(4,4));

        pixels.forEach((i) -> {
            System.out.println(i);
        });
    }
}
package Method.optimization;

public class Main {
    public static void main(String[] args) {
        GradientFall mn = new GradientFall();
        mn.method();
//        FastestFall f = new FastestFall();
//        System.out.println(f.method());
    }
    public static double f(double x1,double x2){
        return 3*x1*x2-x1*x1*x2-x1*x2*x2;
    }
    public static double dfx1(double x1,double x2)
    {
        return 3*x2-2*x1*x2-x2*x2;
    }
    public static double secondDfx1(double x1,double x2){return 0d;}
    public static double dfx2(double x1,double x2){
        return 3*x1-x1*x1-2*x2*x1;
    }
    public static double secondDfx2(double x1,double x2){return 0d;}

}
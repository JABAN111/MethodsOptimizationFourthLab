package Method.optimization;


/**
 * Задание 1. Решить задачу безусловной минимизации функции двух переменных
 * используя метод градиентного спуска.
 */
public class GradientFall {
    private final float lambda = 0.25f;
    private final float epsilon = 0.01f;
    public double method(){
        //начальное приближение
        double x1 = 0.5;
        double x2 = 0.5;
        double x1Approach = dfx1(x1,x2);
        double x2Approach = dfx2(x1,x2);
        double fun = f(x1Approach,x2Approach);

        double funNext = 0;
        double x1Next = x1 + lambda * dfx1(x1, x2) ;
        double x2Next = x2 + lambda * dfx2(x1, x2);;

        while(Math.abs(fun-funNext) > epsilon) {
            fun = f(x1Next, x2Next);
            x1Next = x1Next + lambda * dfx1(x1Next, x2Next);
            x2Next = x2Next + lambda * dfx2(x1Next, x2Next);
            funNext = f(x1Next, x2Next);
            System.out.println("x1 = " + String.format("%.3f",x1Next) + " x2=" + String.format("%.3f",x2Next));
        }
        System.out.println("x1 = " + x1Next);
        System.out.println("fun = " + funNext);
        return funNext;
    }
    public double f(double x1,double x2){
        return 3*x1*x2-x1*x1*x2-x1*x2*x2;
    }
    public double dfx1(double x1,double x2)
    {
        return 3*x2-2*x1*x2-x2*x2;
    }
    public double dfx2(double x1,double x2){
        return 3*x1-x1*x1-2*x2*x1;
    }
}

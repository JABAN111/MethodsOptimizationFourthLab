package Method.optimization;


//Решить задачу безусловной минимизации функции двух переменных используя метод наискорейшего спуска
public class FastestFall {

    public double method()
    {
        double x1=0.5,x2 =0.5;
        double dfX1 = dfx1(x1,x2);
        double dfX2 = dfx2(x1,x2);
        double h = hCalculator(x1,x2);
        double x11 = 0.5 + h*dfX1;
        double x21 = 0.5 + h*dfX2;
        return f(x11,x21);
    }




    public double f(double x1,double x2){
        return 3*x1*x2-x1*x1*x2-x1*x2*x2;
    }
    public double dfx1(double x1,double x2)
    {
        return 3*x2-2*x1*x2-x2*x2;
    }
    private double hCalculator(double x1, double x2) {
        return (double) 2/3;
    }
    public double dfx2(double x1,double x2){
        return 3*x1-x1*x1-2*x2*x1;
    }
}

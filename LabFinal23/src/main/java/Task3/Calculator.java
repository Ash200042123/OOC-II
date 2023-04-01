package Task3;

public class Calculator<T extends Double> implements Operation{
    @Override
    public Number add(Number num1, Number num2) {
        double n1 = (double) num1;
        double n2 = (double) num2;
        return n1+n2;
    }

//    @Override
//    public Number add(Number num1, Number num2) {
//        return null;
//    }

    @Override
    public Number multiply(Number num1, Number num2) {
        return (double)num1*(double)num2;
    }

    @Override
    public Number subtract(Number num1, Number num2) {
        return (double)num1-(double)num2;
    }

    @Override
    public Number divide(Number num1, Number num2) {
        return (double)num1/(double)num2;
    }
}

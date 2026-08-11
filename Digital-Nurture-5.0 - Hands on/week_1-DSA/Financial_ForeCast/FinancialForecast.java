public class FinancialForecast{
    public static double forecast(double initialValue,double growthRate,int years){
        if (years == 0){
            return initialValue;
        }
        return forecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
    public static void main(String[] args){
        double initialValue=10000.0;
        double growthRate=0.05;
        int years=5;

        double futureValue=forecast(initialValue, growthRate, years);
       System.out.printf("Predicted future value after %d years: Rs %.2f%n", years, futureValue);

    }
}


public class MethodOverloading {
    public static double calcFeetAndInchesToCentimeter(double feet,double inches){
        if(feet>=0 && inches>=0 && inches<=12){
            return (feet * 30.48) + (inches * 2.54);
        }else{
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeter(double inches){
        if(inches>=0){
            double feetInInches = inches / 12;
            double remaining = inches % 12;
            return calcFeetAndInchesToCentimeter(feetInInches,remaining);
        }else{
            return -1;
        }
    }
}

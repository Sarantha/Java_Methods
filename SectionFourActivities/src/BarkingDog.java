public class BarkingDog {
    public static boolean shouldWakeUp (boolean status, int hourOfDay){
        if(hourOfDay > 0 && hourOfDay < 23){
            if(status && hourOfDay>0 && hourOfDay<8 || hourOfDay>22){
                return true;
            }
        }
        return false;
    }
}

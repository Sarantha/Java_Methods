public class DigitSumChallenge {
    public static void main(String[] args) {
        //System.out.println(sumDigits(125));
        isPalindrome(11212);
    }

    public static int sumDigits(int number){
        int sum = 0;
            if(number<=10){
                return -1;
            }
            while(number>0){
                int digit = number % 10;
                sum = sum + digit;
                number = number / 10;
            }
        return sum;
    }

    public static void isPalindrome(int number){
        String status = "false";

        int lengthOfNumber = String.valueOf(number).length();
        System.out.println("length of number : "+lengthOfNumber);
        String reverseNumber = "";
        String straightNumber= String.valueOf(number);
        for (int i = lengthOfNumber; i>0; i--){
            reverseNumber = reverseNumber + String.valueOf(number%10);
            number = number / 10;
        }
        status = (straightNumber.equalsIgnoreCase(reverseNumber)) ? "true" : "false";
        System.out.println("Reverse : "+reverseNumber);
        System.out.println("Straight: "+straightNumber);
        System.out.println(status);
    }
}

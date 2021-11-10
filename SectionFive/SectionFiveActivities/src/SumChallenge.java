public class SumChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i=0;i<=10000;i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    sum = sum + i;
                    count++;
                    System.out.println(sum);
                }
                if(count == 5)
                    break;
        }
        System.out.println("Total sum : "+sum);
    }
}

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            sum = sum + number;
            if(count == 5){
                break;
            }
        }
        System.out.println("Total even numbers : "+count);
        System.out.println("Total sum of even numbers : "+sum);
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

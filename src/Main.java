public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for (int div = 1; div < number; div++){
            if (number % div == 0){
                sum += div;
            }
        }
        return sum == number;
    }
}

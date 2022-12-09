public class PrimeNumbers {
    public static void main(String[] args) {
        
        for(int number = 2; number <= 1000; number++){
            boolean isPrime = true;

            for(int factor = 2; factor <= number / 2; factor++){
                if (number % factor == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(number);
            }
        }
    }
}

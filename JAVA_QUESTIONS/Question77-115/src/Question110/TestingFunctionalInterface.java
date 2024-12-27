package Question110;

public class TestingFunctionalInterface {

    public static void main(String[] args) {

        AnshuFunctionalInterface isPrime = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println("Your Number is: "+(isPrime.isAnshu(6) ? "Prime" : "Not Prime"));
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("working");
        FizzBuzz.findFizzBuzz(7);
    }
    public static void findFizzBuzz(int num){
        if( num%3==0&&num%5==0){
            System.out.println("fizzbuzz");
        }
        else if(num%5==0){
            System.out.println("buzz");
        }
        else if (num%3==0){
            System.out.println("Fizz");
        }
        else{
            System.out.println(num);
        }
    }
}

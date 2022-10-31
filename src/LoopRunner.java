public class LoopRunner {
    public static void main(String[] args) {
        WhileLoopFun loop = new WhileLoopFun();
        int x = loop.maxDoubles(4,20);
        System.out.println(x);
        Boolean y = loop.isPrime(30);
        if (y){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        loop.printDigits(150856);
       double a = loop.factorial(20);
        System.out.println(a);
        int b = loop.sumOfDigits(217);
        System.out.println(b);
    }

}


    //recursion is when  a java method calls itself
    // public void callme() { 
    // callme(); (result: would keep calling itself over and over (theroetically infinite) causes stack overflow)
   // }
   //The stack is how each recursice call is stored in memory
   //Each call stacks upon the previous one until either: a condition is met or there is no more memory resulting in a stack overflow
public class Recursion {
    public static void main(String[] args) {

    // tester class

    RecursionAlgos r = new RecursionAlgos();
    r.countDown(5);


    }
}

class RecursionAlgos {

    //Infinite recursion
    public void infinite() {
        //Infinite recursion -- no base case. only recursive case.
        infinite();
    }
    public void countDown(int n) {
        //base case:
        if (n <= 0){
            System.out.println("Hit base case.");
            return;
        }
        System.out.println("Stacking up n:" + n);
        countDown(n - 1);
        //after we return, everything AFTER the  recursive call canrun:
        System.out.println("unstacking!" + n);
    }

}

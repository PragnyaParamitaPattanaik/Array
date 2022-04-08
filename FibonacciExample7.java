package ArrayPractice;

public class FibonacciExample7 {
    public static void main(String[] args) {
            int n=10,  firstTerm=0 ,secondTerm=1;
            System.out.println("Fibonacci Series"+ n+ "terms:");
            for(int i=1;i<=n;++i){
                System.out.print(firstTerm+",");
                //Compute the next  Term
                int nextTerm=firstTerm+secondTerm;
                firstTerm=secondTerm;
                secondTerm=nextTerm;
            }

    }
}

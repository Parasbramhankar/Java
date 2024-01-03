package MenuDriven;

public class Prime {
    static void printPrime(int num1,int num2){
        for(int i=num1;i<=num2;i++)
        {
            int count=0;

            for(int j=2;j<Math.sqrt(i);j++){
                if(i%j==0) {
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println(i+" ");
            }
        }

    }
}

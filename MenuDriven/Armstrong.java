package MenuDriven;

public class Armstrong {

    static boolean checkArmstrong(int number){
        int count=0;
        int num1=number;
        while(num1>0){
            count++;
            num1/=10;
        }
        int num2=number;
        int c=0;
        while(num2>0){
            int b=num2%10;
            c=c+(int)Math.pow(b,count);
            num2/=10;
        }

        if(c==number)
            return true;
        else
            return false;

    }
}

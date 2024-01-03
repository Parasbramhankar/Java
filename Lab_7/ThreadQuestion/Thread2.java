package Lab_7.ThreadQuestion;

public class Thread2 extends Thread{

    public void run(){
        for (int j = 0; j < 3; j++){
            try{
                System.out.println("Current thread : " + Thread.currentThread().getName());

                if(Thread.currentThread().getName().equals("th1")){
                    Thread.sleep(1000);
                }
                if(Thread.currentThread().getName().equals("th2")){
                    Thread.sleep(2000);
                }
                if(Thread.currentThread().getName().equals("th3")){
                    Thread.sleep(3000);
                }

            }
            catch (Exception e){
                System.out.println("Exception : " + e.getMessage());
            }
            System.out.println(j);
        }
    }
}
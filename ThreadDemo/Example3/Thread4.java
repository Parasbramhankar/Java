package ThreadDemo.Example3;

public class Thread4 implements Runnable {
    public void run(){
        for(int i=1;i<=3;i++){
        try{
            System.out.println("Thread name: "+Thread.currentThread().getName());


                if(Thread.currentThread().getName().equals("th1"));
                {
                    Thread.sleep(100);
                }

                if(Thread.currentThread().getName().equals("th2"));
                {
                    Thread.sleep(200);
                }

                if(Thread.currentThread().getName().equals("th3"));
                {
                    Thread.sleep(3000);
                }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("This is: "+Thread.currentThread().getName()+": "+i);
        }
    }

}

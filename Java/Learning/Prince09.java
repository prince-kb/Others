//Concurrent means we can only do one work at a time but we are doing two tasks at different time simultaneously
//Example of concurrent- we are cooking with both hands then coding then cooking then coding

//Parallelism means we are running two different tasks at the same time

//Threads can be in five states
//1>New- thread is declared but is not used
//2>Runnable - thread is ready but is scheduled for running
//3>Running - thread is currently running
//4>Not Running - thread is scheduled
//5>Terminated-start method of thread is completed
//Steps 3, 4 and 5 are used cyclicly and priority of each thread and their scheduling is based on the OS

//Method 1 for using thread
//By extending a predefined thread class
class Thread1 extends Thread{
    //a run method must be declared for thread to work as it is an abstract method declared in preloaded Thread method
    public void run(){
        int i=0;
        while(i<50){
        System.out.print(1+" ");
        i+=1;
    }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.print(2+" ");
            i+=1;
        }
    }
}
class Thread3 extends Thread{
    Thread3(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<50){
            System.out.print(3+" ");
            i+=1;
        }
    }
}

//Runnable is an abstract class
//Only an interface can implement an abstract class
//Method2 for using thread
class Thread11 implements Runnable{
    //a run method must be declared for thread to work
    public void run(){
        for(int i=0;i<50;i++)
            System.out.print(11+" ");
    }
}
class Thread12 implements Runnable{
    //a run method must be declared for thread to work
    public void run(){
        for(int i=0;i<50;i++)
            System.out.print(12+" ");
    }
}
public class Prince09 {
    public static void main(String[] args) {
        //Using thread by extending a pre-defined thread class
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        //Using thread by implementing Runnable interface
        Thread11 bullet1 = new Thread11();
        Thread12 bullet2 = new Thread12();
        
        //A thread must be created to use the runnable interface
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        

        //Multithreading
        //Two processes are started together
        //For some tme t1 works for some time t2 works concurrently

        //start() is the pre available function of thread which we are extending
        //Method1 for using thread

        //t1 will now be given a higher priority among all threads
        t1.setPriority(Thread.MAX_PRIORITY);


        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        
        gun1.start();
        //Whenever Join method called,it  will first run the thread until it is dead , after successful completion it will run next thread
        //Join method must be kept under try catch block
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        gun1.setPriority(Thread.MIN_PRIORITY);

        //gun1 will sleep for 500 milliseconds,for another thread to work
        //Again after 500 ms it will be scheduled 
        try{
            gun1.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        gun2.start();
        gun2.setPriority(Thread.MIN_PRIORITY);

        //A name can be set for a thread just by passing a string 
        //It is already defined in the overriden method we just have to write a constructor using super use it as-
        
        // 1>
        //A constructor in extended Thread class must be defined
        Thread3 t3 = new Thread3("Aalu");
        t3.start();
        // System.out.println("Name and id of thread 3 where constructor is used is : "+t3.getName()+" "+t3.getId());
        
        // 2>
        //A constructor in inplemented Thread class is alreadyy there
        Thread gun3 = new Thread(bullet2,"Shubh");
        // System.out.println("Name and id of thread gun3 where constructor is used is : "+gun3.getName()+" "+gun3.getId());

        gun3.start();

    }
}

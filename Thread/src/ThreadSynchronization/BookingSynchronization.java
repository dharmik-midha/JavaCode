package ThreadSynchronization;
class CallMe1
{
    static int i=3;
    synchronized int booking()
    {   if (i>=1)
        { System.out.println("Booking Done!!");
            i--;
        }        
        else
        { System.out.println("Booking not Availiable");  }
        return 0;
    }
}

class Callers1 implements Runnable
{
    String name;
    Thread t;
    CallMe1 targs;
    Callers1(CallMe1 targs1,String n)
    {
        targs=targs1;
        name=n;
        t=new Thread(this,name);
        t.start();
    }
    public void run()
    {
        targs.booking();
    }
}

public class BookingSynchronization {
    public static void main(String[] args) {
        CallMe1 target=new CallMe1();
        Callers1 ob1=new Callers1(target,"Child1");
        Callers1 ob2=new Callers1(target,"Child2");
        Callers1 ob3=new Callers1(target,"Child3");
        Callers1 ob4=new Callers1(target,"Child4");
        Callers1 ob5=new Callers1(target,"Child5");
    }    
}

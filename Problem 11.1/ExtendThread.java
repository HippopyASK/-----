

class  MyThread extends Thread {

    MyThread(String name) {
        super(name);
        start();
    }

    public void run() {
        System.out.println(getName()+ " - Start");
        try {
            for (int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In "+ getName() +", counter: " +count);
            }
        } 
        catch (InterruptedException exc) {
            System.out.println(getName()+ " - interrupted");
        }
        System.out.println(getName() + " finish");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Star of new thread");

        MyThread mt = new MyThread("Child#1");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("Kill of main thread");
            }
        }

        System.out.println("End of main thread");
    }
}
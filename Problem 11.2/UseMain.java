class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        thrd = Thread.currentThread();

        System.out.println("Name of main Thread: "+ thrd.getName());

        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        System.out.println("Set name and priority\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("New name of main Thread: "+ thrd.getName());

        System.out.println("New priority value: "+thrd.getPriority());
    }
}
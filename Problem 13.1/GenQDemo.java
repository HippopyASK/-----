class GenQDemo {
    public static void main(String[] args) {
        Integer Istore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(Istore);

        Integer iVal;

        System.out.println("Demonstration queue numbers of Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add "+ i + " in queue");
                q.put(i);
            }
        } catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Get next number of type Integer from queue q: ");

                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyExcepiton exc) {
            System.out.println(exc);
        }
        System.out.println();

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;

        System.out.println("Demonstration of queue numbers type Double");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Add "+ (double)i/2 +" in queue q2");
                q2.put((double)i/2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Get next number type of Double from queue q2: ");
                dVal = q2.get();
                System.out.println("dVal");
            }
        } catch (QueueEmptyExcepiton exc) {
            System.out.println(exc);
        }
    }
}
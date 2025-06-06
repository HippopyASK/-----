class QExcDemo {
    public static void main (String args[]) {
        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try{
            for(i=0;i<11;i++) {
                System.out.print("Atempt to save: "+ (char) ('A'+i));
                q.put((char) ('A'+i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try{
            for (i = 0; i < 11; i++) {
                System.out.print("Geting next char");
                ch = q.get();
                System.out.println(ch);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
    }
}
class FDemo {
    int x;

    FDemo (int i) {
        x = i;
    }

    protected void finalize() {
        System.out.println("Finalization " + x);
    }

    void generator (int i) {
        FDemo o = new FDemo(i);
    }
}

class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo od = new FDemo (0);

        for(count=1;count <100000; count++)
        od.generator(count);
    }
}
class LogicalOpTable {
public static void main(String[] args) {
     System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
    for(int p = 1; p >= 0 ; p--)
        for(int q = 1; q >= 0; q--){
            System.out.println(p + "\t" + q + "\t"
                    + (p&q) + "\t" + (p|q) + "\t"
                    + (p^q) + "\t" + (Math.abs(p-1)));
        }
}

    
    }

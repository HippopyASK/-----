class galtolittable {
    public static void main(String[] args) {
        double gallons, liters;
        
        int counter;

        counter = 0;

        int a,b;

        b=2;

        a= ++b;
        
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854;
            System.err.println(gallons +" gallons equeals " + liters + " liters.");
            counter++;
            if (counter == 10){
                System.err.println();
                counter = 0;
            }
        }
    }
}
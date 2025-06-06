

class QDemo{
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using queue bigQ for saving Alphabet");
        for(i=0; i<26; i++)
            bigQ.put((char) ('A'+ i));

        System.out.print("Content queue bigQ:");
        for(i=0; i<26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println();

        System.out.println("Usage queue smallQ for error generation");
        for(i=0; i<5; i++){
            System.out.print("Save try"+ (char) ('Z'- i));
            smallQ.put((char) ('Z'-i));

            System.out.println();
        }
        System.out.println();
        
        System.out.print("Content smallQ:");
        for(i=0; i<5; i++){
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
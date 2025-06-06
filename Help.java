class help {
    public static void main(String[] args) 
        throws java.io.IOException{
            char choice;
            System.out.println("Help");
            System.out.println(" 1. if");
            System.out.println(" 2. swithc");
            System.out.print("Choice:");
            choice = (char) System.in.read();
            System.out.println("\n");
            switch(choice){
                case '1':
                    System.out.println("Operator if:");
                    System.out.println("if (arg) operation");
                    System.out.println("esle operation");
                    break;
                case '2':
                    System.out.println("Operation switch:");
                    System.out.println("switch(arg)");
                    System.out.println("case const");
                    System.out.println("number of operations");
                    System.out.println("break");
                    System.out.println("// ...");
                    System.out.println("}");
                    break;
                default:
                    
                    System.out.println("Request not found");
                    
            }
        }
    }

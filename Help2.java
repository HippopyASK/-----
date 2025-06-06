class Help2 {
    public static void main(String[] args) 
        throws java.io.IOException{
            char choice,ignore;
            do {
            System.out.println("Help");
            System.out.println(" 1. if");
            System.out.println(" 2. swithc");
            System.out.println(" 3. for");
            System.out.println(" 4. whole");
            System.out.println(" 5. do-while");
            System.out.print("Choice:");
            choice = (char) System.in.read();

            do{
                ignore = (char) System.in.read();
            } while (ignore!='\n');
            } while (choice < '1'|choice>'5');
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
                case '3':
                    System.out.println("Operator for:\n");
                    System.out.println("for(initialization; arg; iteration)");
                    System.out.println(" operator");
                    break;
                case '4':
                    System.out.println("Operator while:\n");
                    System.out.println("while(arg) operetor;");
                    break;
                case '5':
                    System.out.println("Operetor do-while:\n");
                    System.out.println("do {");
                    System.out.println(" operator;");
                    System.out.println(")while (arg);");
                    break;
                    
            }
        }
    }

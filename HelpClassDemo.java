class Help {
    void helpon(int what) {
        switch (what) {
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
        System.out.println();
    }

    void showmenu() {
        System.out.println("Help");
            System.out.println(" 1. if");
            System.out.println(" 2. swithc");
            System.out.println(" 3. for");
            System.out.println(" 4. whole");
            System.out.println(" 5. do-while");
            System.out.println(" 6. break");
            System.out.println(" 7. continue");
            
            
            System.out.print("Choose the command(q - exit):");
            
    }

    boolean isvalid(int ch) {
        if(ch < '1' | ch > '7' & ch !='q') return false;
        else return true;
    }
}


class HelpClassDemo {
    public static void main(String[] args) 
        throws java.io.IOException{
            char choice,ignore;
            Help hlpobj = new Help ();

            for(;;){
                do {
                    hlpobj.showmenu();

                    choice = (char) System.in.read();

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');
                }while( !hlpobj.isvalid(choice));
                if(choice =='q') break;

                System.out.println("\n");

                hlpobj.helpon(choice);
            }
        }
    }

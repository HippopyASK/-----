/*
    Problem 10.1

    Compaire 2 files.

    Whenever this program is running we need 
    to name files we compaire. For example, so we can
    compaire file FIRST.TXT with file SECOND.TXT,
    in comand like we should type:

    java CompFile FIRST.TXT SECOND.TXT

*/

import java.io.*;

class CompFiles {
    public static void main(String[] args) {
        int i=0,j=0;

        if(args.length !=2) {
            System.out.println("Ussing: CompFiles file1 file2");
            return;
        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1]))
        {
            do { 
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j)
                System.out.println("Conten of file is diffrent");
            else
                System.out.println("Conten of files is indentical");
        } catch (IOException exc) {
            System.out.println("Error input output: "+ exc);
        }
    }
}
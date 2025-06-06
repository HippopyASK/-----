
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Help {
    String helpfile;

    Help (String fname) {
        helpfile = fname;
    }

    boolean helpon(String what) {
        int ch;
        String topic, info;

        try(BufferedReader helpRdr = 
                new BufferedReader(new FileReader(helpfile)))
            {
                do { 
                    ch = helpRdr.read();
                    if (ch =='#') {
                        topic = helpRdr.readLine();
                        if(what.compareTo(topic)==0){
                            do { 
                                info =helpRdr.readLine();
                                if(info!=null) System.out.println(info);
                            } while ((info != null) && (info.compareTo("")!=0));
                            return true;
                        }
                    }
                } while (ch != -1);
            }
            catch(IOException exc) {
                System.out.println("Err in atempt to get helpfile");
                return false;
            }
            return false;
    }

    String getSelection() {
        String topic ="";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name topic: ");
        try {
            topic = br.readLine();
        }
        catch (IOException exc) {
            System.out.println("Err reading from console");
        }
        return topic;
    }
}

class FileHelp {
    public static void main(String[] args) {
        Help hlpobj =new Help("helpfile.txt");
        String topic;

        System.out.println("""
                        Help system.
                        To exit system type 'stop'-""");
        do { 
            topic = hlpobj.getSelection();

            if (!hlpobj.helpon(topic))
                System.out.println("Topic is not founded");
        } while (topic.compareTo("stop")!=0);
    }
}
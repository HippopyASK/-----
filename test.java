import java.util.*;

class test{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
      for (int i = 0; i<=5; i++){
        int res, j;
        res = 0;
        j=i;
        do{
          res += j%2;
          j /=2;
        }while(j!=0);
        a.add(i,res);
    }
    System.out.println(a);  
    }
}
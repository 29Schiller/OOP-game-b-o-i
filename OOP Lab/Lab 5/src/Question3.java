import java.util.*;

public class Question3 {

 public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            String [] pair_left = new String[t];
            String [] pair_right = new String[t];
            
            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }
            ArrayList<String>list1=new ArrayList<>();
            for (int j=0;j<pair_left.length;j++){
                list1.add(pair_left[j]+" "+pair_right[j]);
            }
            HashSet<String>set1=new HashSet<String>();
            for (int k=0;k<list1.size();k++){
                set1.add(list1.get(k));
                System.out.println(set1.size());
            }
        }

   }
}
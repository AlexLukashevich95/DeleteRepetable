import java.util.*;

public class Main {
    public static void main(String[] args){
        String levels;
        int counter = 0;
        Scanner input = new Scanner(System.in);
        levels = input.nextLine();
        String[] numbersStrings = levels.split("\\s");
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<numbersStrings.length;i++){
            list.add(Integer.parseInt(numbersStrings[i]));
        }
       while (true) {
           int j = 0;
           for (int i = 1; i < list.size() - 1; i++) {
               if (list.get(j).equals(list.get(i)) && list.get(i).equals(list.get(i + 1))) {
                   do {
                       list.remove(i + 1);
                       counter++;
                   }
                   while (i + 1 < list.size() && list.get(i).equals(list.get(i + 1)));
                   list.remove(i);
                   list.remove(j);
                   counter=counter+2;
               }
               j++;
           }
           if(j== list.size()-2){
               System.out.println(counter);
               return;
           }
       }
    }
}

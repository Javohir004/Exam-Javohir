import java.util.ArrayList;
import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("cd");
        list.add("ac");
        list.add("dc");
        list.add("zz");
        list.add("ca");
        list.add("zz");
        task3(list);
    }

    private static void task3(ArrayList<String> list) {
        int sanoq=0;
        for (int i = 0; i < list.size(); i++) {
                String word = String.valueOf( new StringBuilder(list.get(i)).reverse());
            for (int j = i+1; j < list.size(); j++) {
                if(word.equals(list.get(j)) ){
                    System.out.println(++sanoq);
                    break;
                }
            }
        }
        System.out.println("Javob : " + sanoq);
    }
}


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList<Integer> test = new CustomLinkedList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(8);
        test.add(5);
        System.out.println(test.get(2));
        test.remove(1);
        System.out.println(test.get(1));

        Set<String> test1 = new HashSet<>();
        test1.add("olma");
        test1.add("behi");
        test1.add("nok");
        test1.add("tuxum");
        test1.add("ayiq");

        Set<String> test2 = new HashSet<>();
        test2.add("olma");
        test2.add("shaftoli");
        test2.add("nok");
        test2.add("daraxt");
        test2.add("bo'ri");

        Set<String> test3 = new HashSet<>();
        test3.add("olma");
        test3.add("shaftoli");
        test3.add("nok");
        test3.add("daraxt");



        Set<String> last = new HashSet<>();

        for (String s : test1) {
            if( test2.contains(s)){
                last.add(s);
            }
        }

        for (String s3 : test3) {
            if( !last.contains(s3) ){
                last.add(s3);
            }
        }

        System.out.println(last);

    }
}

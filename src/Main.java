
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

    }
}

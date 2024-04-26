
    import java.util.Objects;
    public class CustomLinkedList<E>{
        private Node head;
        private Node last;
        private int size;

        private class Node {
            E value;
            Node next;
            Node prev;

            public Node(E value, Node next, Node prev) {
                this.value = value;
                this.next = next;
                this.prev = prev;
            }

            public Node(E value) {
                this.value = value;
            }
        }


        public void add(E element) {
            if (Objects.isNull(head)) {
                head = new Node(element);
                last = head;
                size++;
                return;
            }

            last.next = new Node(element);
            last.next.prev = last;
            last = last.next;

            size++;
        }


        /** Bo'lganicha bajardimda **/
        public void remove(E element){
            Node current = head;
            if(current.value.equals(element)){
                head = current.next;
                return;
            }

            while (current != null) {
                if (current.value.equals(element)) {
                    current.prev.next = current.next;
                    size--;
                    return;
                }
                if( current.next == null){
                    current.next.prev = null;
                    last = current.prev;
                    return;
                }
                current = current.next;
            }
        }



        /**DIQQAT !!! bu yerda aynan nechinchi index daligiga qaraganman demoqchimanki 0 chi index yo'q deb olganman
         * va sanashni 1 chi indexdan boshlaganman.
         */
        public E get(int index){
            --index;
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for length " + size);
            }
            Node next = head.next;

            if(index == 0){
                return head.value;
            }

            for (int i = 1; i < index; i++) {
                next = next.next;
            }

            return next.value;
        }

        public boolean contains(E element){
            Node current = head;
            while(current != null){
                if(current.value.equals(element)){
                    return true;
                }
                current = current.next;
            }
            return false;
        }


    }

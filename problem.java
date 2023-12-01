public class problem{
    class Node {
        String value;
        Node next;
        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    Node front;
    int size;
    public problem(String[] contents) {
        // Fill in this constructor
        this.front = new Node(null, null);
        Node current = this.front;
        for(int i=0; i<contents.length; i++){
            current.next = new Node(contents[i], null);
            current = current.next;
        }
        this.size = contents.length;
    }
    public void chooseAll(LongWordChooser mc){
        Node current = this.front.next;
        Node prev = this.front;
        //int for_loop = this.size;
        for(int i=0; i<this.size; i++){ //this would iterate through the contents.length 
            if((mc.chooseElement(current.value) == false)){
                //supposed to skip the reference in between so the node is technically lost since nothing references to it
                this.size --;
                prev.next = current.next; //skipping the current value..
                current = current.next; // iterates the current value.. prev is still the same..
            }
            else{
                current = current.next;
                prev = prev.next; // else if assumes that current value is okay and would just iterate to the next value.
            }
        }
    }

    public String[] toArray(){
        @SuppressWarnings("unchecked")
        String[] array = new String[this.size];
        Node current = this.front.next;
        for(int i=0; i<this.size; i++){
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }

    class LongWordChooser {
        public boolean chooseElement(String s) {
            if(s != null) {
                return s.length() > 5;
            }
            return false;
        }
    } 
}
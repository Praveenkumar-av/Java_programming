// LinkedList Class
// A linked list contains a group of elements in the form of nodes. Each node will have three fiels -
// the data field contains data and the link fields contain references to previous and next nodes. 

class LinkedListEg 
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        // add some names to linked list
        ll.add("America");  // adds element to the linked list and returns true if element is added successfully.
        ll.add("India");
        ll.add("UK");

        ll.add(2,"Germany");  // adds element obj at the position of the linked list.

        ll.addFirst("First");  // adds element at the first position of the linked list.

        ll.addLast("First");  // adds element at the end of the linked list.

        // display the elements in the linked list
        System.out.println("List :"+ll);

        System.out.println("First element removed :"+ll.removeFirst());  // removes the first element and returns it.

        System.out.println("First element removed :"+ll.removeLast());  // removes the last element and returns it.

        System.out.println("Remove element at 2 :"+2);  // removes the element at the specified position.

        System.out.println("First element :"+ll.getFirst());  // returns the first element 

        System.out.println("First element :"+ll.getLast());  // returns the last element

        System.out.println("Get the element at 2 :"+ll.get(2));  // removes the element at the position
    }
}
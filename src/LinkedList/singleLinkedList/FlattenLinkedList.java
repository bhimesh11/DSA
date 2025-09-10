package LinkedList.singleLinkedList;



public class FlattenLinkedList {
    // Merges two linked lists in a particular
    // order based on the data value
    public static Node merge(Node list1, Node list2) {
        // Create a dummy node as a
        // placeholder for the result
    	Node dummyNode = new Node(-1);
        Node res = dummyNode;

        // Merge the lists based on data values
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                res.random = list1;
                res = list1;
                list1 = list1.random;
            } else {
                res.random = list2;
                res = list2;
                list2 = list2.random;
            }
            res.next = null;
        }

        // Connect the remaining
        // elements if any
        if (list1 != null) {
            res.random = list1;
        } else {
            res.random = list2;
        }

        // Break the last node's
        // link to prevent cycles
        if (dummyNode.random != null) {
            dummyNode.random.next = null;
        }

        return dummyNode.random;
    }

    // Flattens a linked list with child pointers
    public static Node flattenLinkedList(Node head) {
        // If head is null or there
        // is no next node, return head
        if (head == null || head.next == null) {
            return head;
        }

        // Recursively flatten the
        // rest of the linked list
        Node mergedHead = flattenLinkedList(head.next);
        head = merge(head, mergedHead);
        return head;
    }

    // Print the linked list by
    // traversing through child pointers
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.random;
        }
        System.out.println();
    }

    // Print the linked list
    // in a grid-like structure
    public static void printOriginalLinkedList(Node head, int depth) {
        while (head != null) {
            System.out.print(head.data);

            // If child exists, recursively
            // print it with indentation
            if (head.random != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.random, depth + 1);
            }

            // Add vertical bars
            // for each level in the grid
            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; ++i) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list with child pointers
        Node head = new Node(5);
        head.random = new Node(14);

        head.next = new Node(10);
        head.next.random = new Node(4);

        head.next.next = new Node(12);
        head.next.next.random = new Node(20);
        head.next.next.random.random = new Node(13);

        head.next.next.next = new Node(7);
        head.next.next.next.random = new Node(17);

        // Print the original
        // linked list structure
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten the linked list
        // and print the flattened list
        Node flattened = flattenLinkedList(head);
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}


                          
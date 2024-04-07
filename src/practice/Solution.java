package LinkedList.practice;

class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node temp1 = new Node(key);
        if (head1 == null || head1.data >= key) {
            temp1.next = head1;
            return temp1;
        }

        Node curr = head1;

        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }
        temp1.next = curr.next;
        curr.next = temp1;
        return head1;

    }
}
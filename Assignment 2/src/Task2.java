public class Task2 {
    public static Node findMiddle(LinkedList list) {
        if (list.head == null) return null;
        Node slow = list.head;
        Node fast = list.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

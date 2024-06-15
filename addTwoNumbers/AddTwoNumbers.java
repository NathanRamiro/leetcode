/*public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}*/

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode firstNode;
        ListNode currentNode;
        boolean carryover = false;

        int value = l1.val + l2.val;
        if (value > 9) {
            value -= 10;
            carryover = true;
        }

        firstNode = currentNode = new ListNode(value);

        l1 = l1.next;
        l2 = l2.next;

        while (l1 != null || l2 != null) {
            

            value = (l1 != null ? l1.val : 0) +
                    (l2 != null ? l2.val : 0) +
                    (carryover ? 1 : 0);

            carryover = false;

            if (value > 9) {
                value -= 10;
                carryover = true;
            }

            currentNode.next = new ListNode(value);
            currentNode = currentNode.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            

        }
        if (carryover) {
            currentNode.next = new ListNode(1);
        }

        return firstNode;
    }
    
    public static ListNode ListNodeFactory(int[] array) {

        ListNode node = new ListNode();

        for (int i = array.length - 1; i >= 0; i--) {
            node = (i == array.length - 1)
                    ? new ListNode(array[i])
                    : new ListNode(array[i], node);
        }

        return node;
    }

    public static void main(String[] args) {

        int[] l1 = { 9 };
        int[] l2 = { 1, 9, 9, 9, 9, 9, 9, 9, 9, 9 }; // res= 0,0,0,0,0,0,0,0,0,0,1
        addTwoNumbers(
                ListNodeFactory(l1),
                ListNodeFactory(l2));

    }
}

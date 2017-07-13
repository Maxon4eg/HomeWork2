package HomeWork;

public class NodesWorker {

    public NodesWorker() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return getResultNode(l1, l2);
    }

    ListNode getResultNode(ListNode l1, ListNode l2){
        if (l1.val+l2.val > 10){
            App.printListNode(l1);
            System.out.println(" AND ");
            App.printListNode(l2);
        } else {
            return new ListNode(l1.val + l2.val);
        }
        return null;
    }
}

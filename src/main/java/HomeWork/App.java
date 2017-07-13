package HomeWork;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        int x = 2120;
        int sum = 0;
        while(x > 0) {
            x /= 10;
            System.out.println("the x = "+ x );
        }
//
//
//        NodesWorker nw = new NodesWorker();
//
//        ListNode firstList1 = new ListNode(8);
//        ListNode firstList2 = new ListNode(4);
//        ListNode firstList3 = new ListNode(3);
//
//        ListNode secondList1 = new ListNode(5);
//        ListNode secondList2 = new ListNode(6);
//        ListNode secondList3 = new ListNode(7);
//
//        firstList1.next = firstList2;
//        firstList2.next = firstList3;
//
//        secondList1.next = secondList2;
//        secondList2.next = secondList3;
//
//
//        printListNode(nw.addTwoNumbers(firstList1, secondList1));


    }

    static void printListNode(ListNode listNode) {
        if (listNode.next != null) {
            System.out.print(listNode.val + " > ");
            printListNode(listNode.next);
        } else System.out.println(listNode.val);
    }


}

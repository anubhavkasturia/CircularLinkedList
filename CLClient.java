
public class CLClient {
    public static void main(String[] args)throws Exception {
        CLL cll=new CLL();
        // System.out.println(cll.size());
        // System.out.println(cll.isEmpty());
        cll.insertAtLastorBeforeHead(10);
        cll.insertAtLastorBeforeHead(20);
        cll.insertAtLastorBeforeHead(30);
        cll.display();
        // System.out.println(cll.getAt(2));
        System.out.println();
        // cll.insertAt(3, 40);
        cll.removeHeadNode();
        cll.removeAt(1);
        cll.display();
    }

}
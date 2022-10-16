/**
 *
 * @author yetki
 */
public class main {
    public static void main(String[] args) {
        NodeCommand<Integer> cmd = new NodeCommand<>();
        cmd.createNode(40);
        cmd.createNode(20);
        cmd.addFirst(10);
        cmd.printAll();
        System.out.println("_________________________________________________");
        System.out.println(cmd.getNode(3).value);
    }
}

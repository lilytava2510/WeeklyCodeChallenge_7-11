public class Driver {

    public static void main(String[] args) {
        Linking ln = new Linking();
        Linking n1, n2;

        n1 = new Linking(10);
        n2 = new Linking(3);

        Linking newLink = new Linking(6);
        n2.next = newLink;

        newLink = new Linking(9);
        n2.next.next = newLink;

        newLink = new Linking(15);
        n1.next= newLink;
        n2.next.next.next = newLink;

        newLink = new Linking(30);
        n1.next.next = newLink;

        n1.next.next.next = null;

        Linking intersecting = ln.Intersect(n1, n2);

        if (intersecting == null) {
            System.out.print("no intersect");
        } else {
            System.out.print("intersection");


        }
    }
}

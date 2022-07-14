public class Linking {

        public int data;
        public Linking next;

        Linking(int data, Linking next){
            this.data = data;
            this.next = null;
        }

    public Linking(int i) {

    }

    public Linking() {

    }


    public Linking Intersect(Linking n1, Linking n2){
        while (n2 != null){
            Linking temp = n1;
            while (temp != null){
                if (temp == n2){
                    return n2;
                }
                temp = temp.next;
            }
            n2 = n2.next;
        }
        return null;
    }

}

interface A{
    int sum();
}
interface b{
    int sum();
}
public class cool implements A,b {


    public static void main(String[] args){


        cool c = new cool();
        c.sum();
    }

    @Override
    public int sum() {
        return 0;
    }
}

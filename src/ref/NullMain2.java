package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data.value);

        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data.value);
    }
}

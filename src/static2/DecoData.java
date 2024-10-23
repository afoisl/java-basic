package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++;  // 참조값을 모르기 때문에 compile error
//        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue : " + staticValue);
    }
}

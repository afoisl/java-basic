package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int value = 0;
        for (int j : values) {
            value += j;
        }
        return value;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int value = values[0];
        for (int j : values) {
            if (value > j) {
                value = j;
            }
        }
        return value;
    }

    public static int max(int[] values) {
        int value = values[0];
        for (int j : values) {
            if (value < j) {
                value = j;
            }
        }
        return value;
    }
}

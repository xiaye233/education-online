/**
 * @author Xiaye
 * @create 2021-01-04 13:06
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

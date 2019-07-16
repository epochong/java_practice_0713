import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/15 13:53
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 进制转换 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next().substring(2);
            System.out.println(Integer.valueOf(str,16));
        }
    }
}

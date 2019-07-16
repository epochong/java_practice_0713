import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/7/15 13:39
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 字母统计 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String str = input.next();
            Map<String,Integer> map = new HashMap <>();
            for (Character cur = 'A'; cur <= 'Z'; cur++) {
                map.put(String.valueOf(cur),0);
            }
            for (int i = 0; i < str.length(); i++) {
                String tem = String.valueOf(str.charAt(i));
                if (tem.compareTo("Z") <= 0 && tem.compareTo("A") >= 0) {
                    if (map.containsKey(tem)) {
                        map.put(tem,map.get(tem) + 1);
                    } else {
                        map.put(tem,1);
                    }
                }
            }
            for (Character cur = 'A'; cur <= 'Z'; cur++) {
                System.out.println(cur + ":" + map.get(String.valueOf(cur)));
            }

        }
    }
}

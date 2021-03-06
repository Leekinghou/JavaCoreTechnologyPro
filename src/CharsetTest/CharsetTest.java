package CharsetTest;

import java.nio.charset.Charset;
import java.util.Set;
import java.util.SortedMap;

public class CharsetTest {
    public static void main(String []args){
        //默认字符集GBK
        Charset c = Charset.defaultCharset();
        System.out.println(c.name());

        //输出所有的支持字符集
        SortedMap<String,Charset> sm = Charset.availableCharsets();
        Set<String> keyset = sm.keySet();
        System.out.println("Java所有支持的字符集");
        for(String s : keyset){
            System.out.println(s);
        }
    }
}

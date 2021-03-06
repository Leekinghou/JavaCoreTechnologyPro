package InternationalProgramme;

import java.util.Locale;
import java.util.ResourceBundle;

public class NewHelloWorld {
    public static void main(String []args){
        //获取默认国家/语言
        Locale myLocale = Locale.getDefault();

        System.out.println(myLocale);

        //根据指定语言_国家环境加载资源文件
        ResourceBundle bundle = ResourceBundle.getBundle("message",myLocale);

        //从资源文件中获取消息
        System.out.println(bundle.getString("hello"));

        myLocale = new Locale("en","US"); //强制转换
        bundle = ResourceBundle.getBundle("message",myLocale);
        System.out.println(bundle.getString("hello"));
    }
}

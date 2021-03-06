//package CharsetTest;
//
//import java.io.BufferedReader;
//import java.io.FileOutputStream;
//import java.io.OutputStreamWriter;
//
//public class TxtWriteUTF8 {
//    public static void writeFile1(){
//        FileOutputStream fos = null;
//        OutputStreamWriter osw = null;
//        BufferedReader bw = null;
//        String charset = "UTF-8";
//
//        try{
//            fos = new FileOutputStream("./abc.txt"); //节点类
//            osw = new OutputStreamWriter(fos,charset); //转化类
//            //osw = new OutputStreamWriter(fos); //转化类，采用操作系统默认编码
//            bw = new BufferedReader(osw); //装饰类
//            bw.write("我们是");
//            bw.newLine();
//
//            bw.write("Ecnuers.^^");
//            bw.newLine();
//
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }finally {
//            try{
//                bw.close();
//            }catch (Exception ex){
//                ex.printStackTrace();
//            }
//        }
//    }
//}

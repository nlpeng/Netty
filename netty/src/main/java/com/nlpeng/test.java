package com.nlpeng;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

/**
 * @author Ferry NLP
 * @create 2019-08-14
 * @see
 * @since 1.0v
 **/
public class test {


    @Test
    public void test01() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();

        InputStream inputStream = new FileInputStream("/");

        inputStream.close();


        Integer i = new Integer(100);
    }



    @Test
    public void test02(){


        File fileint ;
        File fileout ;
        try {

            fileint = new File("/test");
            fileout = new File("/test01");

            FileInputStream fileInputStream = new FileInputStream(fileint);
            FileOutputStream fileOutputStream = new FileOutputStream(fileout);

            InputStreamReader gbk = new InputStreamReader(fileInputStream,"GBK");
            OutputStreamWriter utf = new OutputStreamWriter(fileOutputStream,"UTF-8");

            BufferedReader bufferedReader = new BufferedReader(gbk);
            BufferedWriter bufferedWriter = new BufferedWriter(utf);

            String str = null;
            while ((str=bufferedReader.readLine())!=null){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    @Test
    public void test03(){
        DataOutputStream dos =null;
        try {
             dos = new DataOutputStream(new FileOutputStream("/"));
            dos.writeUTF("ab");
            dos.writeBoolean(false);
            dos.writeLong(123);
            System.out.println("asdf");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test04(){
        try {
            File src = new File("/");
            File dest = new File("/");

            FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(dest);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            do{
                String str = bufferedReader.readLine();
                if(str==null){
                    break;
                }
                bufferedWriter.write(str);
            }while (true);

            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void tset05(){
        try {
            File src = new File("/");
            File dest = new File("/");
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);

            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] data = new byte[1024];
            do {
                int len = bis.read(data);
                if(len ==-1){
                    break;
                }
                bos.write(data,0,len);
            }while (true);
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

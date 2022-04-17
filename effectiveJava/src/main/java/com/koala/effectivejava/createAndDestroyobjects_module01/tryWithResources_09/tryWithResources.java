package com.koala.effectivejava.createAndDestroyobjects_module01.tryWithResources_09;

import java.io.*;

/**
 * 第9条：
 *      try-with-resources 优先 try-finally
 * Create by koala on 2022-04-17
 */
public class tryWithResources {

    // 第一个范例
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))){
            return br.readLine();
        }
    }

    // 第二个范例
    public static final int BUFFER_SIZE = 10;
    static void copy(String src,String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)){
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0){
                out.write(buf,0,n);
            }
        }
    }

}
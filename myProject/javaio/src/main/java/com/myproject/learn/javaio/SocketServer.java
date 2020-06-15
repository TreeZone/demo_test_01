package com.myproject.learn.javaio;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: myProject
 * @description: 服务端
 * @author: CuiZhen
 * @create: 2020-06-12 16:10
 **/
public class SocketServer {

  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(9000);
      System.out.println("服务端启动成功---");
      while (!serverSocket.isClosed()){
        Socket accept = serverSocket.accept();
        System.out.println("服务端收到连接---");
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        InputStreamReader reader = new InputStreamReader(bufferedInputStream,"UTF-8");
//        String message;
//        System.out.println("开始读取数据");
//        while ((message = bufferedReader.readLine())!=null){
//          if (message.length() == 0){ System.out.println("数据长度为0"); break;}
//          System.out.println(message);
//        }
        StringBuffer message = new StringBuffer();
        int available = bufferedInputStream.available();
        if (available >0){
          char[] chars = new char[available];
          int len ;
//          while ((len = reader.read(chars))!=-1){
          reader.read(chars);
            message.append(chars);
//          }
          System.out.println(message.toString());
        }
        System.out.println("服务端接收到数据"+accept.toString());
        String respMessage = "HTTP/1.1 200 OK \r\n" + "Content-Type: text/html \r\n\r\n" + "message";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(accept.getOutputStream());
        outputStreamWriter.write(respMessage);
        outputStreamWriter.flush();
        outputStreamWriter.close();
      }
//      outputStreamWriter.write(message);
//      outputStreamWriter.write(message);
    }catch (Exception e){
      System.out.println(e);
    }

  }

}

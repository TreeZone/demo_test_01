package com.myproject.learn.javaio;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @program: myProject
 * @description: 客户端1
 * @author: CuiZhen
 * @create: 2020-06-12 16:09
 **/

@Service
public class SocketClient {
  public static void main(String[] args) throws IOException, InterruptedException {
    Socket socket = new Socket("localhost",9000);
    OutputStream outputStream = socket.getOutputStream();
    String message = "你好啊啊啊";
    outputStream.write(message.getBytes("UTF-8"));
    outputStream.close();
    socket.close();
  }
}

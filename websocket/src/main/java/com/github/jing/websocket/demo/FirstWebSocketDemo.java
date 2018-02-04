package com.github.jing.websocket.demo;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 */
@ServerEndpoint("/websocket/demos/1")
public class FirstWebSocketDemo {

//    private static CopyOnWriteArraySet<FirstWebSocketDemo> webSocketSet = new CopyOnWriteArraySet<FirstWebSocketDemo>();


    /**
     * session: 与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    private Session session;

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
//        webSocketSet.add(this);
        System.out.println("有新连接加入！");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose(){
//        webSocketSet.remove(this);
        System.out.println("有一连接关闭!");
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message) {
        System.out.println("来自客户端的消息:" + message);
        //群发消息
        try {
            this.sendMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        for(FirstWebSocketDemo item: webSocketSet){
//            try {
//                item.sendMessage(message);
//            } catch (IOException e) {
//                e.printStackTrace();
//                continue;
//            }
//        }
    }

    /**
     * 发生错误时调用
     * @param error
     */
    @OnError
    public void onError(Throwable error){
        System.out.println("发生错误");
        error.printStackTrace();
    }

    public void sendMessage(String message) throws IOException{
        this.session.getBasicRemote().sendText(message);
        //this.session.getAsyncRemote().sendText(message);
    }

}

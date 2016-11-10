package com.study.websocket;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by cuong on 11/10/2016.
 */
@ClientEndpoint
public class WebSocketClient {
    protected WebSocketContainer container;
    protected Session userSession = null;

    public WebSocketClient() {
        container = ContainerProvider.getWebSocketContainer();
    }

    public void Connect(String sServer) {

        try {
            userSession = container.connectToServer(this, new URI(sServer));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void SendMessage(String sMsg) throws IOException {
        userSession.getBasicRemote().sendText(sMsg);
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected");
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
    }

    @OnMessage
    public void onMessage(Session session, String msg) {
        System.out.println(msg);
    }

    public void Disconnect() throws IOException {
        userSession.close();
    }
}

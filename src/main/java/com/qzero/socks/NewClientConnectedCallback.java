package com.qzero.socks;

public interface NewClientConnectedCallback {

    void onNewClientConnected(String clientId,Socks5Connection connection);

}

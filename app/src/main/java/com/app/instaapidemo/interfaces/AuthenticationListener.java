package com.app.instaapidemo.interfaces;

public interface AuthenticationListener {

    void onCodeReceived(String auth_token);
}

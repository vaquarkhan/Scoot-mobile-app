package com.squareup.okhttp;

import java.net.Socket;

public abstract interface Connection
{
  public abstract Handshake getHandshake();
  
  public abstract Protocol getProtocol();
  
  public abstract Route getRoute();
  
  public abstract Socket getSocket();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\Connection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
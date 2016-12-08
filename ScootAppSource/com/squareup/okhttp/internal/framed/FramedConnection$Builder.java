package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import d.i;
import d.j;
import d.r;
import java.net.InetSocketAddress;
import java.net.Socket;

public class FramedConnection$Builder
{
  private boolean client;
  private String hostName;
  private FramedConnection.Listener listener = FramedConnection.Listener.REFUSE_INCOMING_STREAMS;
  private Protocol protocol = Protocol.SPDY_3;
  private PushObserver pushObserver = PushObserver.CANCEL;
  private i sink;
  private Socket socket;
  private j source;
  
  public FramedConnection$Builder(boolean paramBoolean)
  {
    this.client = paramBoolean;
  }
  
  public FramedConnection build()
  {
    return new FramedConnection(this, null);
  }
  
  public Builder listener(FramedConnection.Listener paramListener)
  {
    this.listener = paramListener;
    return this;
  }
  
  public Builder protocol(Protocol paramProtocol)
  {
    this.protocol = paramProtocol;
    return this;
  }
  
  public Builder pushObserver(PushObserver paramPushObserver)
  {
    this.pushObserver = paramPushObserver;
    return this;
  }
  
  public Builder socket(Socket paramSocket)
  {
    return socket(paramSocket, ((InetSocketAddress)paramSocket.getRemoteSocketAddress()).getHostName(), r.a(r.b(paramSocket)), r.a(r.a(paramSocket)));
  }
  
  public Builder socket(Socket paramSocket, String paramString, j paramj, i parami)
  {
    this.socket = paramSocket;
    this.hostName = paramString;
    this.source = paramj;
    this.sink = parami;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
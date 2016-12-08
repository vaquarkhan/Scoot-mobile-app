package com.squareup.okhttp.internal.framed;

public abstract class FramedConnection$Listener
{
  public static final Listener REFUSE_INCOMING_STREAMS = new FramedConnection.Listener.1();
  
  public void onSettings(FramedConnection paramFramedConnection) {}
  
  public abstract void onStream(FramedStream paramFramedStream);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$Listener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
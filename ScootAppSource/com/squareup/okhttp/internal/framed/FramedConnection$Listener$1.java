package com.squareup.okhttp.internal.framed;

final class FramedConnection$Listener$1
  extends FramedConnection.Listener
{
  public void onStream(FramedStream paramFramedStream)
  {
    paramFramedStream.close(ErrorCode.REFUSED_STREAM);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FramedConnection$Listener$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.squareup.okhttp.internal.framed;

import d.j;
import java.util.List;

final class PushObserver$1
  implements PushObserver
{
  public boolean onData(int paramInt1, j paramj, int paramInt2, boolean paramBoolean)
  {
    paramj.g(paramInt2);
    return true;
  }
  
  public boolean onHeaders(int paramInt, List<Header> paramList, boolean paramBoolean)
  {
    return true;
  }
  
  public boolean onRequest(int paramInt, List<Header> paramList)
  {
    return true;
  }
  
  public void onReset(int paramInt, ErrorCode paramErrorCode) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\PushObserver$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
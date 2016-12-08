package com.squareup.okhttp.internal.framed;

import d.j;
import d.k;
import java.util.List;

public abstract interface FrameReader$Handler
{
  public abstract void ackSettings();
  
  public abstract void alternateService(int paramInt1, String paramString1, k paramk, String paramString2, int paramInt2, long paramLong);
  
  public abstract void data(boolean paramBoolean, int paramInt1, j paramj, int paramInt2);
  
  public abstract void goAway(int paramInt, ErrorCode paramErrorCode, k paramk);
  
  public abstract void headers(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, List<Header> paramList, HeadersMode paramHeadersMode);
  
  public abstract void ping(boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract void priority(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void pushPromise(int paramInt1, int paramInt2, List<Header> paramList);
  
  public abstract void rstStream(int paramInt, ErrorCode paramErrorCode);
  
  public abstract void settings(boolean paramBoolean, Settings paramSettings);
  
  public abstract void windowUpdate(int paramInt, long paramLong);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FrameReader$Handler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
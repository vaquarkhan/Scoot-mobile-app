package com.mixpanel.android.c;

import java.io.BufferedOutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;

final class p
{
  private static final ByteBuffer d = ByteBuffer.allocate(0);
  private final r a;
  private final s b;
  private final URI c;
  
  public p(URI paramURI, r paramr, Socket paramSocket)
  {
    this.a = paramr;
    this.c = paramURI;
    try
    {
      this.b = new s(this, paramURI, 5000, paramSocket);
      this.b.c();
      return;
    }
    catch (InterruptedException paramURI)
    {
      throw new t(this, paramURI);
    }
  }
  
  public boolean a()
  {
    return (!this.b.e()) && (!this.b.f()) && (!this.b.d());
  }
  
  public BufferedOutputStream b()
  {
    return new BufferedOutputStream(new u(this, null));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
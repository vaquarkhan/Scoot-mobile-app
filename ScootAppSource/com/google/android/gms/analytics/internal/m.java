package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class m
{
  private int b;
  private ByteArrayOutputStream c = new ByteArrayOutputStream();
  
  public m(l paraml) {}
  
  public int a()
  {
    return this.b;
  }
  
  public boolean a(d paramd)
  {
    b.a(paramd);
    if (this.b + 1 > this.a.q().m()) {
      return false;
    }
    Object localObject = this.a.a(paramd, false);
    if (localObject == null)
    {
      this.a.p().a(paramd, "Error formatting hit");
      return true;
    }
    localObject = ((String)localObject).getBytes();
    int j = localObject.length;
    if (j > this.a.q().e())
    {
      this.a.p().a(paramd, "Hit size exceeds the maximum size limit");
      return true;
    }
    int i = j;
    if (this.c.size() > 0) {
      i = j + 1;
    }
    if (i + this.c.size() > this.a.q().g()) {
      return false;
    }
    try
    {
      if (this.c.size() > 0) {
        this.c.write(l.d());
      }
      this.c.write((byte[])localObject);
      this.b += 1;
      return true;
    }
    catch (IOException paramd)
    {
      this.a.e("Failed to write payload when batching hits", paramd);
    }
    return true;
  }
  
  public byte[] b()
  {
    return this.c.toByteArray();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
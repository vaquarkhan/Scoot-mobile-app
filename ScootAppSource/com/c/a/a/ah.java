package com.c.a.a;

import android.content.Context;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.y;
import b.a.a.a.a.b.z;
import java.util.Map;
import java.util.UUID;

final class ah
{
  private final Context a;
  private final y b;
  private final String c;
  private final String d;
  
  public ah(Context paramContext, y paramy, String paramString1, String paramString2)
  {
    this.a = paramContext;
    this.b = paramy;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  public af a()
  {
    Object localObject = this.b.i();
    String str1 = this.b.c();
    String str2 = this.b.b();
    String str3 = (String)((Map)localObject).get(z.d);
    String str4 = (String)((Map)localObject).get(z.g);
    Boolean localBoolean = this.b.l();
    localObject = (String)((Map)localObject).get(z.c);
    String str5 = m.m(this.a);
    String str6 = this.b.d();
    String str7 = this.b.g();
    return new af(str1, UUID.randomUUID().toString(), str2, str3, str4, localBoolean, (String)localObject, str5, str6, str7, this.c, this.d);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
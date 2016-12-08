package b.a.a.a.a.f;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import b.a.a.a.q;

public final class d
  implements c
{
  private final SharedPreferences a;
  private final String b;
  private final Context c;
  
  public d(Context paramContext, String paramString)
  {
    if (paramContext == null) {
      throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }
    this.c = paramContext;
    this.b = paramString;
    this.a = this.c.getSharedPreferences(this.b, 0);
  }
  
  @Deprecated
  public d(q paramq)
  {
    this(paramq.E(), paramq.getClass().getName());
  }
  
  public SharedPreferences a()
  {
    return this.a;
  }
  
  @TargetApi(9)
  public boolean a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT >= 9)
    {
      paramEditor.apply();
      return true;
    }
    return paramEditor.commit();
  }
  
  public SharedPreferences.Editor b()
  {
    return this.a.edit();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\f\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
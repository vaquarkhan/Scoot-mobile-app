package b.a.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b.a.a.a.a.b.y;
import b.a.a.a.a.c.w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class i
{
  private final Context a;
  private q[] b;
  private w c;
  private Handler d;
  private t e;
  private boolean f;
  private String g;
  private String h;
  private l<f> i;
  
  public i(Context paramContext)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("Context must not be null.");
    }
    this.a = paramContext.getApplicationContext();
  }
  
  public f a()
  {
    if (this.c == null) {
      this.c = w.a();
    }
    if (this.d == null) {
      this.d = new Handler(Looper.getMainLooper());
    }
    if (this.e == null)
    {
      if (this.f) {
        this.e = new e(3);
      }
    }
    else
    {
      if (this.h == null) {
        this.h = this.a.getPackageName();
      }
      if (this.i == null) {
        this.i = l.d;
      }
      if (this.b != null) {
        break label182;
      }
    }
    label182:
    for (Object localObject = new HashMap();; localObject = f.a(Arrays.asList(this.b)))
    {
      y localy = new y(this.a, this.h, this.g, ((Map)localObject).values());
      return new f(this.a, (Map)localObject, this.c, this.d, this.e, this.f, this.i, localy);
      this.e = new e();
      break;
    }
  }
  
  public i a(q... paramVarArgs)
  {
    if (this.b != null) {
      throw new IllegalStateException("Kits already set.");
    }
    this.b = paramVarArgs;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.a.a.a;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;

public final class a
{
  private final Application a;
  private b b;
  
  public a(Context paramContext)
  {
    this.a = ((Application)paramContext.getApplicationContext());
    if (Build.VERSION.SDK_INT >= 14) {
      this.b = new b(this.a);
    }
  }
  
  public void a()
  {
    if (this.b != null) {
      b.a(this.b);
    }
  }
  
  public boolean a(d paramd)
  {
    return (this.b != null) && (b.a(this.b, paramd));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
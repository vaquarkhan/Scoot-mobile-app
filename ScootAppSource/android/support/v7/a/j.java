package android.support.v7.a;

import android.app.Activity;
import android.content.Context;
import android.support.v7.b.a.b;

final class j
  extends b
  implements k
{
  private final Activity a;
  
  public j(Activity paramActivity, Context paramContext)
  {
    super(paramContext);
    this.a = paramActivity;
  }
  
  public void a(float paramFloat)
  {
    if (paramFloat == 1.0F) {
      b(true);
    }
    for (;;)
    {
      d(paramFloat);
      return;
      if (paramFloat == 0.0F) {
        b(false);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
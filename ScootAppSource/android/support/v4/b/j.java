package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;

class j
  implements i
{
  public Intent a(ComponentName paramComponentName)
  {
    Intent localIntent = new Intent("android.intent.action.MAIN");
    localIntent.setComponent(paramComponentName);
    localIntent.addCategory("android.intent.category.LAUNCHER");
    return localIntent;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
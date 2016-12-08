package android.support.v4.b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.h;

public final class ad
{
  public static int a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
  
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1) {}
    String str;
    do
    {
      return -1;
      str = h.a(paramString1);
      if (str == null) {
        return 0;
      }
      paramString1 = paramString2;
      if (paramString2 != null) {
        break;
      }
      paramString1 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
    } while ((paramString1 == null) || (paramString1.length <= 0));
    paramString1 = paramString1[0];
    if (h.a(paramContext, str, paramString1) != 0) {
      return -2;
    }
    return 0;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
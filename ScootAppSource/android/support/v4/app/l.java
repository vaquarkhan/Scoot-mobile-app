package android.support.v4.app;

import android.app.AppOpsManager;
import android.content.Context;

final class l
{
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return ((AppOpsManager)paramContext.getSystemService(AppOpsManager.class)).noteProxyOp(paramString1, paramString2);
  }
  
  public static String a(String paramString)
  {
    return AppOpsManager.permissionToOp(paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
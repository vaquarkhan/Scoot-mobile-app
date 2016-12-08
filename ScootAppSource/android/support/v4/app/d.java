package android.support.v4.app;

import android.app.Activity;

final class d
{
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt)
  {
    if ((paramActivity instanceof e)) {
      ((e)paramActivity).b_(paramInt);
    }
    paramActivity.requestPermissions(paramArrayOfString, paramInt);
  }
  
  public static boolean a(Activity paramActivity, String paramString)
  {
    return paramActivity.shouldShowRequestPermissionRationale(paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
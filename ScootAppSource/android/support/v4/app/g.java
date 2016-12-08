package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

final class g
{
  public static void a(Activity paramActivity)
  {
    paramActivity.finishAffinity();
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
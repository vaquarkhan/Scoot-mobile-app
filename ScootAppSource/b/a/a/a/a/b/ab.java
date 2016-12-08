package b.a.a.a.a.b;

import android.content.Context;
import android.content.pm.PackageManager;
import b.a.a.a.a.a.d;

final class ab
  implements d<String>
{
  ab(aa paramaa) {}
  
  public String a(Context paramContext)
  {
    String str = paramContext.getPackageManager().getInstallerPackageName(paramContext.getPackageName());
    paramContext = str;
    if (str == null) {
      paramContext = "";
    }
    return paramContext;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
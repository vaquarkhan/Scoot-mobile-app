package b.a.a.a.a.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import b.a.a.a.f;
import b.a.a.a.t;

public final class k
{
  protected String a()
  {
    return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
  }
  
  public String a(Context paramContext)
  {
    String str2 = b(paramContext);
    String str1 = str2;
    if (TextUtils.isEmpty(str2)) {
      str1 = c(paramContext);
    }
    if (TextUtils.isEmpty(str1)) {
      d(paramContext);
    }
    return str1;
  }
  
  protected String b(Context paramContext)
  {
    String str2 = null;
    Object localObject1 = null;
    String str1 = str2;
    try
    {
      Object localObject2 = paramContext.getPackageName();
      str1 = str2;
      localObject2 = paramContext.getPackageManager().getApplicationInfo((String)localObject2, 128).metaData;
      paramContext = (Context)localObject1;
      if (localObject2 != null)
      {
        str1 = str2;
        str2 = ((Bundle)localObject2).getString("io.fabric.ApiKey");
        paramContext = str2;
        if (str2 == null)
        {
          str1 = str2;
          f.h().a("Fabric", "Falling back to Crashlytics key lookup from Manifest");
          str1 = str2;
          paramContext = ((Bundle)localObject2).getString("com.crashlytics.ApiKey");
        }
      }
      return paramContext;
    }
    catch (Exception paramContext)
    {
      f.h().a("Fabric", "Caught non-fatal exception while retrieving apiKey: " + paramContext);
    }
    return str1;
  }
  
  protected String c(Context paramContext)
  {
    String str = null;
    int j = m.a(paramContext, "io.fabric.ApiKey", "string");
    int i = j;
    if (j == 0)
    {
      f.h().a("Fabric", "Falling back to Crashlytics key lookup from Strings");
      i = m.a(paramContext, "com.crashlytics.ApiKey", "string");
    }
    if (i != 0) {
      str = paramContext.getResources().getString(i);
    }
    return str;
  }
  
  protected void d(Context paramContext)
  {
    if ((f.i()) || (m.i(paramContext))) {
      throw new IllegalArgumentException(a());
    }
    f.h().e("Fabric", a());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
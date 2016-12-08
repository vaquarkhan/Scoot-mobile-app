package b.a.a.a.a.b;

import android.os.Build;
import android.text.TextUtils;
import b.a.a.a.f;
import b.a.a.a.t;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

 enum o
{
  private static final Map<String, o> k;
  
  static
  {
    k = new HashMap(4);
    k.put("armeabi-v7a", g);
    k.put("armeabi", f);
    k.put("arm64-v8a", j);
    k.put("x86", a);
  }
  
  private o() {}
  
  static o a()
  {
    Object localObject = Build.CPU_ABI;
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      f.h().a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
      localObject = h;
    }
    o localo;
    do
    {
      return (o)localObject;
      localObject = ((String)localObject).toLowerCase(Locale.US);
      localo = (o)k.get(localObject);
      localObject = localo;
    } while (localo != null);
    return h;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
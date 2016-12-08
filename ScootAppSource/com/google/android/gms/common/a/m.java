package com.google.android.gms.common.a;

import com.google.android.gms.common.internal.v;
import java.util.regex.Pattern;

public final class m
{
  private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");
  
  public static boolean a(String paramString)
  {
    return (paramString == null) || (v.a.b(paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
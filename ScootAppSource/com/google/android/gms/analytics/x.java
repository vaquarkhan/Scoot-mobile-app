package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class x
  implements ak
{
  private static final Uri a;
  private final LogPrinter b = new LogPrinter(4, "GA/LogCatTransport");
  
  static
  {
    Uri.Builder localBuilder = new Uri.Builder();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    a = localBuilder.build();
  }
  
  public Uri a()
  {
    return a;
  }
  
  public void a(z paramz)
  {
    Object localObject = new ArrayList(paramz.b());
    Collections.sort((List)localObject, new y(this));
    paramz = new StringBuilder();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = ((ab)((Iterator)localObject).next()).toString();
      if (!TextUtils.isEmpty(str))
      {
        if (paramz.length() != 0) {
          paramz.append(", ");
        }
        paramz.append(str);
      }
    }
    this.b.println(paramz.toString());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class bi
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", paramString1, null));
    paramString1.putExtra("android.intent.extra.SUBJECT", paramString2);
    paramString1.putExtra("android.intent.extra.TEXT", paramString3);
    paramContext.startActivity(Intent.createChooser(paramString1, "Send email..."));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
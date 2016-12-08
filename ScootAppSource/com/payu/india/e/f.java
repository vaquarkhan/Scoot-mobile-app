package com.payu.india.e;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static long b = 0L;
  private static boolean h = true;
  private String a = "sdk_local_cache_device";
  private final Activity c;
  private String d;
  private boolean e;
  private ArrayList<String> f;
  private Timer g;
  
  public f(Activity paramActivity, String paramString)
  {
    if (h) {}
    for (String str = "https://info.payu.in/merchant/mobileWebService.php";; str = "https://mobiletest.payu.in/merchant/mobileWebService.php")
    {
      this.d = str;
      this.e = false;
      this.f = new ArrayList();
      this.c = paramActivity;
      this.a = paramString;
      Thread.setDefaultUncaughtExceptionHandler(new g(this, Thread.getDefaultUncaughtExceptionHandler()));
      return;
    }
  }
  
  public static JSONArray a(JSONArray paramJSONArray, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > paramJSONArray.length() - 1)) {
      throw new IndexOutOfBoundsException();
    }
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    int j = paramJSONArray.length();
    while (i < j)
    {
      if (i != paramInt) {
        localJSONArray.put(paramJSONArray.get(i));
      }
      i += 1;
    }
    return localJSONArray;
  }
  
  private void c()
  {
    if (this.g != null) {
      this.g.cancel();
    }
    this.g = new Timer();
    this.g.schedule(new h(this), b);
  }
  
  void a()
  {
    try
    {
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(String paramString)
  {
    if (this.e) {
      this.f.add(paramString);
    }
    for (;;)
    {
      c();
      return;
      a();
      try
      {
        localJSONObject = new JSONObject(paramString);
        localJSONArray = new JSONArray();
        String str = "";
        if (!new File(this.c.getFilesDir(), this.a).exists()) {
          this.c.openFileOutput(this.a, 0);
        }
        localObject = this.c.openFileInput(this.a);
        for (;;)
        {
          int i = ((FileInputStream)localObject).read();
          if (i == -1) {
            break;
          }
          str = str + Character.toString((char)i);
          localJSONArray = new JSONArray(str);
        }
      }
      catch (IOException localIOException)
      {
        JSONObject localJSONObject;
        JSONArray localJSONArray;
        Object localObject;
        localIOException.printStackTrace();
        this.f.add(paramString);
        for (;;)
        {
          b();
          break;
          ((FileInputStream)localObject).close();
          localObject = this.c.openFileOutput(this.a, 0);
          localJSONArray.put(localJSONArray.length(), localJSONObject);
          ((FileOutputStream)localObject).write((localIOException + localJSONArray.toString() + "\r\n").getBytes());
          ((FileOutputStream)localObject).close();
        }
      }
      catch (JSONException paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
    }
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = this.c.getSharedPreferences("com.payu", 0).edit();
    localEditor.putBoolean(paramString, paramBoolean);
    localEditor.commit();
  }
  
  void b()
  {
    try
    {
      this.e = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean b(String paramString)
  {
    return this.c.getSharedPreferences("com.payu", 0).getBoolean(paramString, false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
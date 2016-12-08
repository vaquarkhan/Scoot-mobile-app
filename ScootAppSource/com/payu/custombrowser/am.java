package com.payu.custombrowser;

import android.app.Activity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class am
{
  private long a = 0L;
  private final Activity b;
  private final String c = "https://info.payu.in/merchant/mobileWebService.php";
  private boolean d = false;
  private ArrayList<String> e;
  private Timer f;
  private String g = "cb_local_cache_device";
  
  public am(Activity paramActivity, String paramString)
  {
    this.b = paramActivity;
    this.g = paramString;
    this.e = new ArrayList();
    Thread.setDefaultUncaughtExceptionHandler(new an(this, paramString, Thread.getDefaultUncaughtExceptionHandler()));
  }
  
  private void a()
  {
    if (this.f != null) {
      this.f.cancel();
    }
    this.f = new Timer();
    this.f.schedule(new ao(this), this.a);
  }
  
  private static JSONArray b(JSONArray paramJSONArray, int paramInt)
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
  
  private void b()
  {
    try
    {
      this.d = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void c()
  {
    try
    {
      this.d = false;
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
    if (this.d)
    {
      this.e.add(paramString);
      a();
      return;
    }
    b();
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject(paramString);
        if (!new File(this.b.getFilesDir(), this.g).exists()) {
          this.b.openFileOutput(this.g, 0);
        }
        Object localObject2 = this.b.openFileInput(this.g);
        localObject1 = "";
        int i = ((FileInputStream)localObject2).read();
        if (i != -1)
        {
          localObject1 = (String)localObject1 + Character.toString((char)i);
          continue;
        }
        if (!((String)localObject1).equalsIgnoreCase("")) {
          continue;
        }
        localObject1 = new JSONArray();
        ((FileInputStream)localObject2).close();
        localObject2 = this.b.openFileOutput(this.g, 0);
        ((JSONArray)localObject1).put(((JSONArray)localObject1).length(), localJSONObject);
        ((FileOutputStream)localObject2).write(((JSONArray)localObject1).toString().getBytes());
        ((FileOutputStream)localObject2).close();
      }
      catch (IOException localIOException)
      {
        Object localObject1;
        localIOException.printStackTrace();
        this.e.add(paramString);
        continue;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        continue;
      }
      c();
      break;
      localObject1 = new JSONArray((String)localObject1);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
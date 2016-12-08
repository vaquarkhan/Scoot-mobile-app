package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.net.HttpURLConnection;
import java.util.List;

public class ao
  extends AsyncTask<Void, Void, List<as>>
{
  private static final String a = ao.class.getCanonicalName();
  private final HttpURLConnection b;
  private final ap c;
  private Exception d;
  
  public ao(ap paramap)
  {
    this(null, paramap);
  }
  
  public ao(HttpURLConnection paramHttpURLConnection, ap paramap)
  {
    this.c = paramap;
    this.b = paramHttpURLConnection;
  }
  
  protected List<as> a(Void... paramVarArgs)
  {
    try
    {
      if (this.b == null) {
        return this.c.g();
      }
      paramVarArgs = GraphRequest.a(this.b, this.c);
      return paramVarArgs;
    }
    catch (Exception paramVarArgs)
    {
      this.d = paramVarArgs;
    }
    return null;
  }
  
  protected void a(List<as> paramList)
  {
    super.onPostExecute(paramList);
    if (this.d != null) {
      Log.d(a, String.format("onPostExecute: exception encountered during request: %s", new Object[] { this.d.getMessage() }));
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (w.b()) {
      Log.d(a, String.format("execute async task: %s", new Object[] { this }));
    }
    if (this.c.c() == null) {
      if (!(Thread.currentThread() instanceof HandlerThread)) {
        break label66;
      }
    }
    label66:
    for (Handler localHandler = new Handler();; localHandler = new Handler(Looper.getMainLooper()))
    {
      this.c.a(localHandler);
      return;
    }
  }
  
  public String toString()
  {
    return "{RequestAsyncTask: " + " connection: " + this.b + ", requests: " + this.c + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
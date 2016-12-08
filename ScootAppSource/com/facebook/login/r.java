package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.b.az;
import com.facebook.k;
import com.facebook.n;
import com.facebook.p;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class r
{
  private static final Set<String> a = ;
  private static volatile r b;
  private g c = g.a;
  private a d = a.c;
  
  r()
  {
    az.b();
  }
  
  private Intent a(LoginClient.Request paramRequest)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(com.facebook.w.f(), FacebookActivity.class);
    localIntent.setAction(paramRequest.b().toString());
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("request", paramRequest);
    localIntent.putExtras(localBundle);
    return localIntent;
  }
  
  public static r a()
  {
    if (b == null) {}
    try
    {
      if (b == null) {
        b = new r();
      }
      return b;
    }
    finally {}
  }
  
  static x a(LoginClient.Request paramRequest, AccessToken paramAccessToken)
  {
    Set localSet = paramRequest.a();
    HashSet localHashSet = new HashSet(paramAccessToken.d());
    if (paramRequest.f()) {
      localHashSet.retainAll(localSet);
    }
    paramRequest = new HashSet(localSet);
    paramRequest.removeAll(localHashSet);
    return new x(paramAccessToken, localHashSet, paramRequest);
  }
  
  private void a(Context paramContext, LoginClient.Request paramRequest)
  {
    paramContext = w.a(paramContext);
    if ((paramContext != null) && (paramRequest != null)) {
      paramContext.a(paramRequest);
    }
  }
  
  private void a(Context paramContext, m paramm, Map<String, String> paramMap, Exception paramException, boolean paramBoolean, LoginClient.Request paramRequest)
  {
    q localq = w.a(paramContext);
    if (localq == null) {
      return;
    }
    if (paramRequest == null)
    {
      localq.b("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
      return;
    }
    HashMap localHashMap = new HashMap();
    if (paramBoolean) {}
    for (paramContext = "1";; paramContext = "0")
    {
      localHashMap.put("try_login_activity", paramContext);
      localq.a(paramRequest.e(), localHashMap, paramm, paramMap, paramException);
      return;
    }
  }
  
  private void a(AccessToken paramAccessToken, LoginClient.Request paramRequest, p paramp, boolean paramBoolean, n<x> paramn)
  {
    if (paramAccessToken != null)
    {
      AccessToken.a(paramAccessToken);
      Profile.b();
    }
    if (paramn != null)
    {
      if (paramAccessToken == null) {
        break label55;
      }
      paramRequest = a(paramRequest, paramAccessToken);
      if ((!paramBoolean) && ((paramRequest == null) || (paramRequest.a().size() != 0))) {
        break label60;
      }
      paramn.a();
    }
    label55:
    label60:
    do
    {
      return;
      paramRequest = null;
      break;
      if (paramp != null)
      {
        paramn.a(paramp);
        return;
      }
    } while (paramAccessToken == null);
    paramn.a(paramRequest);
  }
  
  private void a(y paramy, LoginClient.Request paramRequest)
  {
    a(paramy.a(), paramRequest);
    com.facebook.b.r.a(com.facebook.b.t.a.a(), new u(this));
    if (!b(paramy, paramRequest))
    {
      p localp = new p("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
      a(paramy.a(), m.c, null, localp, false, paramRequest);
      throw localp;
    }
  }
  
  private void a(Collection<String> paramCollection)
  {
    if (paramCollection == null) {}
    String str;
    do
    {
      return;
      while (!paramCollection.hasNext()) {
        paramCollection = paramCollection.iterator();
      }
      str = (String)paramCollection.next();
    } while (!a(str));
    throw new p(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] { str }));
  }
  
  private boolean a(Intent paramIntent)
  {
    return com.facebook.w.f().getPackageManager().resolveActivity(paramIntent, 0) != null;
  }
  
  static boolean a(String paramString)
  {
    return (paramString != null) && ((paramString.startsWith("publish")) || (paramString.startsWith("manage")) || (a.contains(paramString)));
  }
  
  private LoginClient.Request b(Collection<String> paramCollection)
  {
    g localg = this.c;
    if (paramCollection != null)
    {
      paramCollection = new HashSet(paramCollection);
      paramCollection = new LoginClient.Request(localg, Collections.unmodifiableSet(paramCollection), this.d, com.facebook.w.i(), UUID.randomUUID().toString());
      if (AccessToken.a() == null) {
        break label70;
      }
    }
    label70:
    for (boolean bool = true;; bool = false)
    {
      paramCollection.a(bool);
      return paramCollection;
      paramCollection = new HashSet();
      break;
    }
  }
  
  private static Set<String> b()
  {
    return Collections.unmodifiableSet(new t());
  }
  
  private boolean b(y paramy, LoginClient.Request paramRequest)
  {
    paramRequest = a(paramRequest);
    if (!a(paramRequest)) {
      return false;
    }
    try
    {
      paramy.a(paramRequest, LoginClient.d());
      return true;
    }
    catch (ActivityNotFoundException paramy) {}
    return false;
  }
  
  public void a(Activity paramActivity, Collection<String> paramCollection)
  {
    a(paramCollection);
    paramCollection = b(paramCollection);
    a(new v(paramActivity), paramCollection);
  }
  
  public void a(k paramk, n<x> paramn)
  {
    if (!(paramk instanceof com.facebook.b.r)) {
      throw new p("Unexpected CallbackManager, please use the provided Factory.");
    }
    ((com.facebook.b.r)paramk).b(com.facebook.b.t.a.a(), new s(this, paramn));
  }
  
  boolean a(int paramInt, Intent paramIntent)
  {
    return a(paramInt, paramIntent, null);
  }
  
  boolean a(int paramInt, Intent paramIntent, n<x> paramn)
  {
    Object localObject2 = null;
    Object localObject4 = null;
    Object localObject1 = m.c;
    boolean bool2 = false;
    boolean bool1 = false;
    Object localObject6;
    Object localObject5;
    Object localObject3;
    if (paramIntent != null)
    {
      localObject6 = (LoginClient.Result)paramIntent.getParcelableExtra("com.facebook.LoginFragment:Result");
      if (localObject6 == null) {
        break label278;
      }
      localObject5 = ((LoginClient.Result)localObject6).e;
      localObject3 = ((LoginClient.Result)localObject6).a;
      if (paramInt == -1) {
        if (((LoginClient.Result)localObject6).a == m.a)
        {
          localObject1 = ((LoginClient.Result)localObject6).b;
          paramIntent = (Intent)localObject2;
          localObject4 = ((LoginClient.Result)localObject6).f;
          localObject2 = paramIntent;
          paramIntent = (Intent)localObject3;
          localObject3 = localObject1;
          localObject1 = paramIntent;
          paramIntent = (Intent)localObject4;
          localObject4 = localObject5;
        }
      }
    }
    for (;;)
    {
      localObject5 = localObject4;
      localObject6 = paramIntent;
      localObject4 = localObject3;
      localObject3 = localObject5;
      paramIntent = (Intent)localObject2;
      localObject2 = localObject6;
      for (;;)
      {
        localObject5 = paramIntent;
        if (paramIntent == null)
        {
          localObject5 = paramIntent;
          if (localObject4 == null)
          {
            localObject5 = paramIntent;
            if (!bool1) {
              localObject5 = new p("Unexpected call to LoginManager.onActivityResult");
            }
          }
        }
        a(null, (m)localObject1, (Map)localObject2, (Exception)localObject5, true, (LoginClient.Request)localObject3);
        a((AccessToken)localObject4, (LoginClient.Request)localObject3, (p)localObject5, bool1, paramn);
        return true;
        paramIntent = new com.facebook.m(((LoginClient.Result)localObject6).c);
        localObject1 = localObject4;
        break;
        localObject1 = localObject4;
        paramIntent = (Intent)localObject2;
        if (paramInt != 0) {
          break;
        }
        bool1 = true;
        localObject1 = localObject4;
        paramIntent = (Intent)localObject2;
        break;
        if (paramInt == 0)
        {
          localObject1 = m.b;
          bool1 = true;
          localObject4 = null;
          localObject3 = null;
          paramIntent = null;
          localObject2 = null;
        }
        else
        {
          bool1 = false;
          localObject4 = null;
          localObject3 = null;
          paramIntent = null;
          localObject2 = null;
        }
      }
      label278:
      localObject4 = null;
      localObject3 = null;
      paramIntent = null;
      localObject2 = null;
      bool1 = bool2;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
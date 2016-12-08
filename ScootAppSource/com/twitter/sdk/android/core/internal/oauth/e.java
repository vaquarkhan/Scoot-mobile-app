package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.u;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import retrofit.client.Response;
import retrofit.mime.TypedInput;

final class e
  extends f<Response>
{
  e(OAuth1aService paramOAuth1aService, f paramf) {}
  
  public void a(k<Response> paramk)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      try
      {
        localObject = new BufferedReader(new InputStreamReader(((Response)paramk.a).getBody().in()));
        try
        {
          paramk = ((BufferedReader)localObject).readLine();
          if (paramk == null) {
            continue;
          }
          localStringBuilder.append(paramk);
          continue;
          if (localObject == null) {}
        }
        finally {}
      }
      finally
      {
        Object localObject = null;
        continue;
      }
      try
      {
        ((BufferedReader)localObject).close();
        throw paramk;
      }
      catch (IOException paramk)
      {
        this.a.a(new q(paramk.getMessage(), paramk));
        return;
      }
    }
    if (localObject != null) {
      ((BufferedReader)localObject).close();
    }
    paramk = localStringBuilder.toString();
    localObject = OAuth1aService.a(paramk);
    if (localObject == null)
    {
      this.a.a(new q("Failed to parse auth response: " + paramk));
      return;
    }
    this.a.a(new k(localObject, null));
  }
  
  public void a(u paramu)
  {
    this.a.a(paramu);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
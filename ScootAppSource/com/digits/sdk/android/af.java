package com.digits.sdk.android;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import retrofit.RetrofitError;

final class af
  implements Runnable
{
  af(ContactsUploadService paramContactsUploadService, ee paramee, AtomicInteger paramAtomicInteger) {}
  
  public void run()
  {
    try
    {
      ContactsUploadService.a(this.c).a(this.a);
      this.b.addAndGet(this.a.a.size());
      return;
    }
    catch (RetrofitError localRetrofitError)
    {
      this.c.a(localRetrofitError);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
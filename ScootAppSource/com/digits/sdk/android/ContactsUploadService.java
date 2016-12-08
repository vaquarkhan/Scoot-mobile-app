package com.digits.sdk.android;

import android.app.IntentService;
import android.content.Intent;
import android.database.Cursor;
import b.a.a.a.a.c.a.d;
import b.a.a.a.a.c.a.e;
import b.a.a.a.a.c.a.i;
import b.a.a.a.f;
import b.a.a.a.t;
import com.twitter.sdk.android.core.o;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class ContactsUploadService
  extends IntentService
{
  private ContactsClient a;
  private ab b;
  private ac c;
  private i d;
  private t e;
  private Locale f;
  
  public ContactsUploadService()
  {
    super("UPLOAD_WORKER");
    a(ao.d().k(), new ab(this), new ac(), new i(2, new d(1), new e(1000L)), f.h(), Locale.getDefault());
  }
  
  ContactsUploadService(ContactsClient paramContactsClient, ab paramab, ac paramac, i parami, t paramt, Locale paramLocale)
  {
    super("UPLOAD_WORKER");
    a(paramContactsClient, paramab, paramac, parami, paramt, paramLocale);
  }
  
  private void a(ContactsClient paramContactsClient, ab paramab, ac paramac, i parami, t paramt, Locale paramLocale)
  {
    this.a = paramContactsClient;
    this.b = paramab;
    this.c = paramac;
    this.d = parami;
    this.e = paramt;
    this.f = paramLocale;
    setIntentRedelivery(true);
  }
  
  private List<String> b()
  {
    Object localObject1 = null;
    Collections.emptyList();
    try
    {
      Cursor localCursor = this.b.a();
      localObject1 = localCursor;
      List localList = this.b.a(localCursor);
      if (localCursor != null) {
        localCursor.close();
      }
      return localList;
    }
    finally
    {
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  int a(int paramInt)
  {
    return (paramInt + 100 - 1) / 100;
  }
  
  void a()
  {
    sendBroadcast(new Intent("com.digits.sdk.android.UPLOAD_FAILED"));
  }
  
  void a(ContactsUploadResult paramContactsUploadResult)
  {
    Intent localIntent = new Intent("com.digits.sdk.android.UPLOAD_COMPLETE");
    localIntent.putExtra("com.digits.sdk.android.UPLOAD_COMPLETE_EXTRA", paramContactsUploadResult);
    sendBroadcast(localIntent);
  }
  
  void a(RetrofitError paramRetrofitError)
  {
    Response localResponse = paramRetrofitError.getResponse();
    if (localResponse == null) {}
    for (int i = 0;; i = localResponse.getStatus())
    {
      paramRetrofitError = o.a(paramRetrofitError);
      this.e.e("Digits", String.format(this.f, "contact upload error, httpStatus=%d, errorCode=%d, errorMessage=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramRetrofitError.a()), paramRetrofitError.b() }));
      return;
    }
  }
  
  protected void onHandleIntent(Intent paramIntent)
  {
    int i = 0;
    this.c.a();
    int j;
    AtomicInteger localAtomicInteger;
    try
    {
      paramIntent = b();
      j = paramIntent.size();
      int k = a(j);
      localAtomicInteger = new AtomicInteger(0);
      while (i < k)
      {
        int m = i * 100;
        ee localee = new ee(paramIntent.subList(m, Math.min(j, m + 100)));
        this.d.a(new af(this, localee, localAtomicInteger));
        i += 1;
      }
      this.d.shutdown();
      if (!this.d.awaitTermination(300L, TimeUnit.SECONDS))
      {
        this.d.shutdownNow();
        a();
        return;
      }
      if (localAtomicInteger.get() == 0)
      {
        a();
        return;
      }
    }
    catch (Exception paramIntent)
    {
      a();
      return;
    }
    this.c.a(System.currentTimeMillis());
    this.c.a(localAtomicInteger.get());
    a(new ContactsUploadResult(localAtomicInteger.get(), j));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsUploadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
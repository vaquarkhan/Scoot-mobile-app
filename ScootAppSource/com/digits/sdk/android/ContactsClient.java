package com.digits.sdk.android;

import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.m;
import com.twitter.sdk.android.core.t;
import retrofit.RestAdapter;
import retrofit.RestAdapter.Builder;

public final class ContactsClient
{
  private final t a;
  private final ac b;
  private ContactsClient.ContactsService c;
  private b d;
  
  ContactsClient()
  {
    this(t.d(), new ac(), new b(), null);
  }
  
  ContactsClient(t paramt, ac paramac, b paramb, ContactsClient.ContactsService paramContactsService)
  {
    if (paramt == null) {
      throw new IllegalArgumentException("twitter must not be null");
    }
    if (paramac == null) {
      throw new IllegalArgumentException("preference manager must not be null");
    }
    if (paramb == null) {
      throw new IllegalArgumentException("activityClassManagerFactory must not be null");
    }
    this.a = paramt;
    this.b = paramac;
    this.d = paramb;
    this.c = paramContactsService;
  }
  
  private ContactsClient.ContactsService a()
  {
    if (this.c != null) {
      return this.c;
    }
    this.c = ((ContactsClient.ContactsService)new RestAdapter.Builder().setEndpoint(new az().a()).setClient(new e(this.a.f(), ao.f().b(), this.a.g())).build().create(ContactsClient.ContactsService.class));
    return this.c;
  }
  
  ed a(ee paramee)
  {
    return a().upload(paramee);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
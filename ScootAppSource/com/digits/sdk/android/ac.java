package com.digits.sdk.android;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import b.a.a.a.a.f.c;
import b.a.a.a.a.f.d;
import b.a.a.a.f;

final class ac
{
  private final c a = new d(f.a(ao.class));
  
  @SuppressLint({"CommitPrefEdits"})
  protected void a()
  {
    this.a.a(this.a.b().putBoolean("CONTACTS_IMPORT_PERMISSION", true));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  protected void a(int paramInt)
  {
    this.a.a(this.a.b().putInt("CONTACTS_CONTACTS_UPLOADED", paramInt));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  protected void a(long paramLong)
  {
    this.a.a(this.a.b().putLong("CONTACTS_READ_TIMESTAMP", paramLong));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
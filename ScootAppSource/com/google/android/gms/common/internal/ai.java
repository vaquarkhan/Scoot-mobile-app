package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.b.fi;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.r;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class ai
{
  private final Account a;
  private final Set<Scope> b;
  private final Set<Scope> c;
  private final Map<a<?>, aj> d;
  private final int e;
  private final View f;
  private final String g;
  private final String h;
  private final fi i;
  private Integer j;
  
  public ai(Account paramAccount, Set<Scope> paramSet, Map<a<?>, aj> paramMap, int paramInt, View paramView, String paramString1, String paramString2, fi paramfi)
  {
    this.a = paramAccount;
    if (paramSet == null) {}
    for (paramAccount = Collections.EMPTY_SET;; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      this.b = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null) {
        paramAccount = Collections.EMPTY_MAP;
      }
      this.d = paramAccount;
      this.f = paramView;
      this.e = paramInt;
      this.g = paramString1;
      this.h = paramString2;
      this.i = paramfi;
      paramAccount = new HashSet(this.b);
      paramSet = this.d.values().iterator();
      while (paramSet.hasNext()) {
        paramAccount.addAll(((aj)paramSet.next()).a);
      }
    }
    this.c = Collections.unmodifiableSet(paramAccount);
  }
  
  public static ai a(Context paramContext)
  {
    return new r(paramContext).a();
  }
  
  @Deprecated
  public String a()
  {
    if (this.a != null) {
      return this.a.name;
    }
    return null;
  }
  
  public Set<Scope> a(a<?> parama)
  {
    parama = (aj)this.d.get(parama);
    if ((parama == null) || (parama.a.isEmpty())) {
      return this.b;
    }
    HashSet localHashSet = new HashSet(this.b);
    localHashSet.addAll(parama.a);
    return localHashSet;
  }
  
  public void a(Integer paramInteger)
  {
    this.j = paramInteger;
  }
  
  public Account b()
  {
    return this.a;
  }
  
  public Account c()
  {
    if (this.a != null) {
      return this.a;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public Set<Scope> d()
  {
    return this.b;
  }
  
  public Set<Scope> e()
  {
    return this.c;
  }
  
  public Map<a<?>, aj> f()
  {
    return this.d;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String h()
  {
    return this.h;
  }
  
  public fi i()
  {
    return this.i;
  }
  
  public Integer j()
  {
    return this.j;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
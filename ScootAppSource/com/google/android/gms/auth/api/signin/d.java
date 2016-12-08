package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class d
{
  private Set<Scope> a = new HashSet();
  private boolean b;
  private boolean c;
  private boolean d;
  private String e;
  private Account f;
  private String g;
  
  public d() {}
  
  public d(GoogleSignInOptions paramGoogleSignInOptions)
  {
    b.a(paramGoogleSignInOptions);
    this.a = new HashSet(GoogleSignInOptions.a(paramGoogleSignInOptions));
    this.b = GoogleSignInOptions.b(paramGoogleSignInOptions);
    this.c = GoogleSignInOptions.c(paramGoogleSignInOptions);
    this.d = GoogleSignInOptions.d(paramGoogleSignInOptions);
    this.e = GoogleSignInOptions.e(paramGoogleSignInOptions);
    this.f = GoogleSignInOptions.f(paramGoogleSignInOptions);
    this.g = GoogleSignInOptions.g(paramGoogleSignInOptions);
  }
  
  public d a()
  {
    this.a.add(GoogleSignInOptions.c);
    return this;
  }
  
  public d a(Scope paramScope, Scope... paramVarArgs)
  {
    this.a.add(paramScope);
    this.a.addAll(Arrays.asList(paramVarArgs));
    return this;
  }
  
  public d b()
  {
    this.a.add(GoogleSignInOptions.b);
    return this;
  }
  
  public d c()
  {
    this.a.add(GoogleSignInOptions.a);
    return this;
  }
  
  public GoogleSignInOptions d()
  {
    if ((this.d) && ((this.f == null) || (!this.a.isEmpty()))) {
      a();
    }
    return new GoogleSignInOptions(this.a, this.f, this.d, this.b, this.c, this.e, this.g, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
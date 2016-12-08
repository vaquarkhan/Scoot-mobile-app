package com.google.a.b.a;

import com.google.a.af;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ad
  extends am<Character>
{
  public Character a(a parama)
  {
    if (parama.f() == c.i)
    {
      parama.j();
      return null;
    }
    parama = parama.h();
    if (parama.length() != 1) {
      throw new af("Expecting character, got: " + parama);
    }
    return Character.valueOf(parama.charAt(0));
  }
  
  public void a(d paramd, Character paramCharacter)
  {
    if (paramCharacter == null) {}
    for (paramCharacter = null;; paramCharacter = String.valueOf(paramCharacter))
    {
      paramd.b(paramCharacter);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\a\b\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
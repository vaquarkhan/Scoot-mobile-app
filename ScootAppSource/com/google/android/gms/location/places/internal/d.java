package com.google.android.gms.location.places.internal;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static CharSequence a(String paramString, List<AutocompletePredictionEntity.SubstringEntity> paramList, CharacterStyle paramCharacterStyle)
  {
    if (paramCharacterStyle == null) {
      return paramString;
    }
    paramString = new SpannableString(paramString);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      AutocompletePredictionEntity.SubstringEntity localSubstringEntity = (AutocompletePredictionEntity.SubstringEntity)paramList.next();
      CharacterStyle localCharacterStyle = CharacterStyle.wrap(paramCharacterStyle);
      int i = localSubstringEntity.a();
      int j = localSubstringEntity.a();
      paramString.setSpan(localCharacterStyle, i, localSubstringEntity.b() + j, 0);
    }
    return paramString;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
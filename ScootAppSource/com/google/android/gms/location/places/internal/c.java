package com.google.android.gms.location.places.internal;

import android.text.style.CharacterStyle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.b;
import java.util.Collections;
import java.util.List;

public final class c
  extends ai
  implements b
{
  public c(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private String f()
  {
    return a("ap_description", "");
  }
  
  private String g()
  {
    return a("ap_primary_text", "");
  }
  
  private String h()
  {
    return a("ap_secondary_text", "");
  }
  
  private List<AutocompletePredictionEntity.SubstringEntity> i()
  {
    return a("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  private List<AutocompletePredictionEntity.SubstringEntity> j()
  {
    return a("ap_primary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  private List<AutocompletePredictionEntity.SubstringEntity> k()
  {
    return a("ap_secondary_text_matched", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
  }
  
  public CharSequence a(CharacterStyle paramCharacterStyle)
  {
    return d.a(f(), i(), paramCharacterStyle);
  }
  
  public CharSequence b(CharacterStyle paramCharacterStyle)
  {
    return d.a(g(), j(), paramCharacterStyle);
  }
  
  public String b()
  {
    return a("ap_place_id", null);
  }
  
  public b c()
  {
    return AutocompletePredictionEntity.a(b(), e(), d(), f(), i(), g(), j(), h(), k());
  }
  
  public CharSequence c(CharacterStyle paramCharacterStyle)
  {
    return d.a(h(), k(), paramCharacterStyle);
  }
  
  public int d()
  {
    return a("ap_personalization_type", 6);
  }
  
  public List<Integer> e()
  {
    return a("ap_place_types", Collections.emptyList());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
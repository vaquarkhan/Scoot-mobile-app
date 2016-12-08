package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.style.CharacterStyle;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class AutocompletePredictionEntity
  extends AbstractSafeParcelable
  implements com.google.android.gms.location.places.b
{
  public static final Parcelable.Creator<AutocompletePredictionEntity> CREATOR = new b();
  private static final List<AutocompletePredictionEntity.SubstringEntity> k = Collections.emptyList();
  final int a;
  final String b;
  final String c;
  final List<Integer> d;
  final List<AutocompletePredictionEntity.SubstringEntity> e;
  final int f;
  final String g;
  final List<AutocompletePredictionEntity.SubstringEntity> h;
  final String i;
  final List<AutocompletePredictionEntity.SubstringEntity> j;
  
  AutocompletePredictionEntity(int paramInt1, String paramString1, List<Integer> paramList, int paramInt2, String paramString2, List<AutocompletePredictionEntity.SubstringEntity> paramList1, String paramString3, List<AutocompletePredictionEntity.SubstringEntity> paramList2, String paramString4, List<AutocompletePredictionEntity.SubstringEntity> paramList3)
  {
    this.a = paramInt1;
    this.c = paramString1;
    this.d = paramList;
    this.f = paramInt2;
    this.b = paramString2;
    this.e = paramList1;
    this.g = paramString3;
    this.h = paramList2;
    this.i = paramString4;
    this.j = paramList3;
  }
  
  public static AutocompletePredictionEntity a(String paramString1, List<Integer> paramList, int paramInt, String paramString2, List<AutocompletePredictionEntity.SubstringEntity> paramList1, String paramString3, List<AutocompletePredictionEntity.SubstringEntity> paramList2, String paramString4, List<AutocompletePredictionEntity.SubstringEntity> paramList3)
  {
    return new AutocompletePredictionEntity(0, paramString1, paramList, paramInt, (String)com.google.android.gms.common.internal.b.a(paramString2), paramList1, paramString3, paramList2, paramString4, paramList3);
  }
  
  public CharSequence a(CharacterStyle paramCharacterStyle)
  {
    return d.a(this.b, this.e, paramCharacterStyle);
  }
  
  public CharSequence b(CharacterStyle paramCharacterStyle)
  {
    return d.a(this.g, this.h, paramCharacterStyle);
  }
  
  public String b()
  {
    return this.c;
  }
  
  public com.google.android.gms.location.places.b c()
  {
    return this;
  }
  
  public CharSequence c(CharacterStyle paramCharacterStyle)
  {
    return d.a(this.i, this.j, paramCharacterStyle);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof AutocompletePredictionEntity)) {
        return false;
      }
      paramObject = (AutocompletePredictionEntity)paramObject;
    } while ((br.a(this.c, ((AutocompletePredictionEntity)paramObject).c)) && (br.a(this.d, ((AutocompletePredictionEntity)paramObject).d)) && (br.a(Integer.valueOf(this.f), Integer.valueOf(((AutocompletePredictionEntity)paramObject).f))) && (br.a(this.b, ((AutocompletePredictionEntity)paramObject).b)) && (br.a(this.e, ((AutocompletePredictionEntity)paramObject).e)) && (br.a(this.g, ((AutocompletePredictionEntity)paramObject).g)) && (br.a(this.h, ((AutocompletePredictionEntity)paramObject).h)) && (br.a(this.i, ((AutocompletePredictionEntity)paramObject).i)) && (br.a(this.j, ((AutocompletePredictionEntity)paramObject).j)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.c, this.d, Integer.valueOf(this.f), this.b, this.e, this.g, this.h, this.i, this.j });
  }
  
  public String toString()
  {
    return br.a(this).a("placeId", this.c).a("placeTypes", this.d).a("fullText", this.b).a("fullTextMatchedSubstrings", this.e).a("primaryText", this.g).a("primaryTextMatchedSubstrings", this.h).a("secondaryText", this.i).a("secondaryTextMatchedSubstrings", this.j).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\AutocompletePredictionEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import com.twitter.sdk.android.core.services.a.a;
import retrofit.http.EncodedQuery;
import retrofit.http.GET;
import retrofit.http.Query;

public abstract interface SearchService
{
  @GET("/1.1/search/tweets.json")
  public abstract void tweets(@Query("q") String paramString1, @EncodedQuery("geocode") a parama, @Query("lang") String paramString2, @Query("locale") String paramString3, @Query("result_type") String paramString4, @Query("count") Integer paramInteger, @Query("until") String paramString5, @Query("since_id") Long paramLong1, @Query("max_id") Long paramLong2, @Query("include_entities") Boolean paramBoolean, f<Object> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\SearchService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
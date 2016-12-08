package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import retrofit.http.GET;
import retrofit.http.Query;

public abstract interface CollectionService
{
  @GET("/1.1/collections/entries.json")
  public abstract void collection(@Query("id") String paramString, @Query("count") Integer paramInteger, @Query("max_position") Long paramLong1, @Query("min_position") Long paramLong2, f<Object> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\CollectionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
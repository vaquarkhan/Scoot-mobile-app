package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import java.util.List;
import retrofit.http.GET;
import retrofit.http.Query;

public abstract interface ListService
{
  @GET("/1.1/lists/statuses.json")
  public abstract void statuses(@Query("list_id") Long paramLong1, @Query("slug") String paramString1, @Query("owner_screen_name") String paramString2, @Query("owner_id") Long paramLong2, @Query("since_id") Long paramLong3, @Query("max_id") Long paramLong4, @Query("count") Integer paramInteger, @Query("include_entities") Boolean paramBoolean1, @Query("include_rts") Boolean paramBoolean2, f<List<Object>> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\ListService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
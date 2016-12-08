package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

public abstract interface FavoriteService
{
  @FormUrlEncoded
  @POST("/1.1/favorites/create.json")
  public abstract void create(@Field("id") Long paramLong, @Field("include_entities") Boolean paramBoolean, f<Object> paramf);
  
  @FormUrlEncoded
  @POST("/1.1/favorites/destroy.json")
  public abstract void destroy(@Field("id") Long paramLong, @Field("include_entities") Boolean paramBoolean, f<Object> paramf);
  
  @GET("/1.1/favorites/list.json")
  public abstract void list(@Query("user_id") Long paramLong, @Query("screen_name") String paramString1, @Query("count") Integer paramInteger, @Query("since_id") String paramString2, @Query("max_id") String paramString3, @Query("include_entities") Boolean paramBoolean, f<List<Object>> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\FavoriteService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
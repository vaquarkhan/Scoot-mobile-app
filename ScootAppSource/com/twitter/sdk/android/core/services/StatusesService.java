package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import java.util.List;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

public abstract interface StatusesService
{
  @FormUrlEncoded
  @POST("/1.1/statuses/destroy/{id}.json")
  public abstract void destroy(@Path("id") Long paramLong, @Field("trim_user") Boolean paramBoolean, f<Object> paramf);
  
  @GET("/1.1/statuses/home_timeline.json")
  public abstract void homeTimeline(@Query("count") Integer paramInteger, @Query("since_id") Long paramLong1, @Query("max_id") Long paramLong2, @Query("trim_user") Boolean paramBoolean1, @Query("exclude_replies") Boolean paramBoolean2, @Query("contributor_details") Boolean paramBoolean3, @Query("include_entities") Boolean paramBoolean4, f<List<Object>> paramf);
  
  @GET("/1.1/statuses/lookup.json")
  public abstract void lookup(@Query("id") String paramString, @Query("include_entities") Boolean paramBoolean1, @Query("trim_user") Boolean paramBoolean2, @Query("map") Boolean paramBoolean3, f<List<Object>> paramf);
  
  @GET("/1.1/statuses/mentions_timeline.json")
  public abstract void mentionsTimeline(@Query("count") Integer paramInteger, @Query("since_id") Long paramLong1, @Query("max_id") Long paramLong2, @Query("trim_user") Boolean paramBoolean1, @Query("contributor_details") Boolean paramBoolean2, @Query("include_entities") Boolean paramBoolean3, f<List<Object>> paramf);
  
  @FormUrlEncoded
  @POST("/1.1/statuses/retweet/{id}.json")
  public abstract void retweet(@Path("id") Long paramLong, @Field("trim_user") Boolean paramBoolean, f<Object> paramf);
  
  @GET("/1.1/statuses/retweets_of_me.json")
  public abstract void retweetsOfMe(@Query("count") Integer paramInteger, @Query("since_id") Long paramLong1, @Query("max_id") Long paramLong2, @Query("trim_user") Boolean paramBoolean1, @Query("include_entities") Boolean paramBoolean2, @Query("include_user_entities") Boolean paramBoolean3, f<List<Object>> paramf);
  
  @GET("/1.1/statuses/show.json")
  public abstract void show(@Query("id") Long paramLong, @Query("trim_user") Boolean paramBoolean1, @Query("include_my_retweet") Boolean paramBoolean2, @Query("include_entities") Boolean paramBoolean3, f<Object> paramf);
  
  @FormUrlEncoded
  @POST("/1.1/statuses/unretweet/{id}.json")
  public abstract void unretweet(@Path("id") Long paramLong, @Field("trim_user") Boolean paramBoolean, f<Object> paramf);
  
  @Deprecated
  @FormUrlEncoded
  @POST("/1.1/statuses/update.json")
  public abstract void update(@Field("status") String paramString1, @Field("in_reply_to_status_id") Long paramLong, @Field("possibly_sensitive") Boolean paramBoolean1, @Field("lat") Double paramDouble1, @Field("long") Double paramDouble2, @Field("place_id") String paramString2, @Field("display_cooridnates") Boolean paramBoolean2, @Field("trim_user") Boolean paramBoolean3, f<Object> paramf);
  
  @FormUrlEncoded
  @POST("/1.1/statuses/update.json")
  public abstract void update(@Field("status") String paramString1, @Field("in_reply_to_status_id") Long paramLong, @Field("possibly_sensitive") Boolean paramBoolean1, @Field("lat") Double paramDouble1, @Field("long") Double paramDouble2, @Field("place_id") String paramString2, @Field("display_cooridnates") Boolean paramBoolean2, @Field("trim_user") Boolean paramBoolean3, @Field("media_ids") String paramString3, f<Object> paramf);
  
  @GET("/1.1/statuses/user_timeline.json")
  public abstract void userTimeline(@Query("user_id") Long paramLong1, @Query("screen_name") String paramString, @Query("count") Integer paramInteger, @Query("since_id") Long paramLong2, @Query("max_id") Long paramLong3, @Query("trim_user") Boolean paramBoolean1, @Query("exclude_replies") Boolean paramBoolean2, @Query("contributor_details") Boolean paramBoolean3, @Query("include_rts") Boolean paramBoolean4, f<List<Object>> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\StatusesService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
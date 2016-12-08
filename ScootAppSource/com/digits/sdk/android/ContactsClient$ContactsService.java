package com.digits.sdk.android;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;

abstract interface ContactsClient$ContactsService
{
  @POST("/1.1/contacts/destroy/all.json")
  public abstract void deleteAll(y<Response> paramy);
  
  @POST("/1.1/contacts/upload.json")
  public abstract ed upload(@Body ee paramee);
  
  @GET("/1.1/contacts/users_and_uploaded_by.json")
  public abstract void usersAndUploadedBy(@Query("next_cursor") String paramString, @Query("count") Integer paramInteger, y<Object> paramy);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\ContactsClient$ContactsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
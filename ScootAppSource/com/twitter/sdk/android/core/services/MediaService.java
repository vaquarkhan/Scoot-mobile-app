package com.twitter.sdk.android.core.services;

import com.twitter.sdk.android.core.f;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedFile;
import retrofit.mime.TypedString;

public abstract interface MediaService
{
  @Multipart
  @POST("/1.1/media/upload.json")
  public abstract void upload(@Part("media") TypedFile paramTypedFile1, @Part("media_data") TypedFile paramTypedFile2, @Part("additional_owners") TypedString paramTypedString, f<Object> paramf);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\services\MediaService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
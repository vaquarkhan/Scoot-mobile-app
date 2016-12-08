package com.sagar.taxiapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import com.squareup.picasso.Picasso.LoadedFrom;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileOutputStream;

final class l
  implements Target
{
  l(ActivityMainNew paramActivityMainNew) {}
  
  public void onBitmapFailed(Drawable paramDrawable) {}
  
  public void onBitmapLoaded(Bitmap paramBitmap, Picasso.LoadedFrom paramLoadedFrom)
  {
    try
    {
      paramLoadedFrom = Environment.getExternalStorageDirectory().toString();
      paramLoadedFrom = new File(paramLoadedFrom + "/ScootApp");
      if (!paramLoadedFrom.exists()) {
        paramLoadedFrom.mkdirs();
      }
      paramLoadedFrom = new File(paramLoadedFrom, "myProfile.jpg");
      if (!paramLoadedFrom.exists()) {
        paramLoadedFrom.createNewFile();
      }
      this.a.getSharedPreferences("shareddata", 0).edit().putString("profile_uri", paramLoadedFrom.getPath()).apply();
      paramLoadedFrom = new FileOutputStream(paramLoadedFrom);
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 90, paramLoadedFrom);
      paramLoadedFrom.flush();
      paramLoadedFrom.close();
      return;
    }
    catch (Exception paramBitmap)
    {
      paramBitmap.printStackTrace();
    }
  }
  
  public void onPrepareLoad(Drawable paramDrawable) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
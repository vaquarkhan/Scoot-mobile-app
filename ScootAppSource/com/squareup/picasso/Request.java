package com.squareup.picasso;

import android.graphics.Bitmap.Config;
import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class Request
{
  private static final long TOO_LONG_LOG = TimeUnit.SECONDS.toNanos(5L);
  public final boolean centerCrop;
  public final boolean centerInside;
  public final Bitmap.Config config;
  public final boolean hasRotationPivot;
  int id;
  int networkPolicy;
  public final boolean onlyScaleDown;
  public final Picasso.Priority priority;
  public final int resourceId;
  public final float rotationDegrees;
  public final float rotationPivotX;
  public final float rotationPivotY;
  public final String stableKey;
  long started;
  public final int targetHeight;
  public final int targetWidth;
  public final List<Transformation> transformations;
  public final Uri uri;
  
  private Request(Uri paramUri, int paramInt1, String paramString, List<Transformation> paramList, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean4, Bitmap.Config paramConfig, Picasso.Priority paramPriority)
  {
    this.uri = paramUri;
    this.resourceId = paramInt1;
    this.stableKey = paramString;
    if (paramList == null) {}
    for (this.transformations = null;; this.transformations = Collections.unmodifiableList(paramList))
    {
      this.targetWidth = paramInt2;
      this.targetHeight = paramInt3;
      this.centerCrop = paramBoolean1;
      this.centerInside = paramBoolean2;
      this.onlyScaleDown = paramBoolean3;
      this.rotationDegrees = paramFloat1;
      this.rotationPivotX = paramFloat2;
      this.rotationPivotY = paramFloat3;
      this.hasRotationPivot = paramBoolean4;
      this.config = paramConfig;
      this.priority = paramPriority;
      return;
    }
  }
  
  public Request.Builder buildUpon()
  {
    return new Request.Builder(this, null);
  }
  
  String getName()
  {
    if (this.uri != null) {
      return String.valueOf(this.uri.getPath());
    }
    return Integer.toHexString(this.resourceId);
  }
  
  boolean hasCustomTransformations()
  {
    return this.transformations != null;
  }
  
  public boolean hasSize()
  {
    return (this.targetWidth != 0) || (this.targetHeight != 0);
  }
  
  String logId()
  {
    long l = System.nanoTime() - this.started;
    if (l > TOO_LONG_LOG) {
      return plainId() + '+' + TimeUnit.NANOSECONDS.toSeconds(l) + 's';
    }
    return plainId() + '+' + TimeUnit.NANOSECONDS.toMillis(l) + "ms";
  }
  
  boolean needsMatrixTransform()
  {
    return (hasSize()) || (this.rotationDegrees != 0.0F);
  }
  
  boolean needsTransformation()
  {
    return (needsMatrixTransform()) || (hasCustomTransformations());
  }
  
  String plainId()
  {
    return "[R" + this.id + ']';
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Request{");
    if (this.resourceId > 0) {
      localStringBuilder.append(this.resourceId);
    }
    while ((this.transformations != null) && (!this.transformations.isEmpty()))
    {
      Iterator localIterator = this.transformations.iterator();
      while (localIterator.hasNext())
      {
        Transformation localTransformation = (Transformation)localIterator.next();
        localStringBuilder.append(' ').append(localTransformation.key());
      }
      localStringBuilder.append(this.uri);
    }
    if (this.stableKey != null) {
      localStringBuilder.append(" stableKey(").append(this.stableKey).append(')');
    }
    if (this.targetWidth > 0) {
      localStringBuilder.append(" resize(").append(this.targetWidth).append(',').append(this.targetHeight).append(')');
    }
    if (this.centerCrop) {
      localStringBuilder.append(" centerCrop");
    }
    if (this.centerInside) {
      localStringBuilder.append(" centerInside");
    }
    if (this.rotationDegrees != 0.0F)
    {
      localStringBuilder.append(" rotation(").append(this.rotationDegrees);
      if (this.hasRotationPivot) {
        localStringBuilder.append(" @ ").append(this.rotationPivotX).append(',').append(this.rotationPivotY);
      }
      localStringBuilder.append(')');
    }
    if (this.config != null) {
      localStringBuilder.append(' ').append(this.config);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
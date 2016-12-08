package com.squareup.picasso;

final class BitmapHunter$5
  implements Runnable
{
  BitmapHunter$5(Transformation paramTransformation) {}
  
  public void run()
  {
    throw new IllegalStateException("Transformation " + this.val$transformation.key() + " returned input Bitmap but recycled it.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\BitmapHunter$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
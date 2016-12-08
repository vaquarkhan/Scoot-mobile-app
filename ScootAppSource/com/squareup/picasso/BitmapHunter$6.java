package com.squareup.picasso;

final class BitmapHunter$6
  implements Runnable
{
  BitmapHunter$6(Transformation paramTransformation) {}
  
  public void run()
  {
    throw new IllegalStateException("Transformation " + this.val$transformation.key() + " mutated input Bitmap but failed to recycle the original.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\BitmapHunter$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
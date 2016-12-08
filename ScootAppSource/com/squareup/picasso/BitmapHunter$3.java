package com.squareup.picasso;

final class BitmapHunter$3
  implements Runnable
{
  BitmapHunter$3(Transformation paramTransformation, RuntimeException paramRuntimeException) {}
  
  public void run()
  {
    throw new RuntimeException("Transformation " + this.val$transformation.key() + " crashed with exception.", this.val$e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\BitmapHunter$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
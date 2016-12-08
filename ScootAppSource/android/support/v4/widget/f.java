package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.shapes.OvalShape;

final class f
  extends OvalShape
{
  private RadialGradient b;
  private Paint c = new Paint();
  private int d;
  
  public f(e parame, int paramInt1, int paramInt2)
  {
    e.a(parame, paramInt1);
    this.d = paramInt2;
    float f1 = this.d / 2;
    float f2 = this.d / 2;
    float f3 = e.a(parame);
    parame = Shader.TileMode.CLAMP;
    this.b = new RadialGradient(f1, f2, f3, new int[] { 1023410176, 0 }, null, parame);
    this.c.setShader(this.b);
  }
  
  public void draw(Canvas paramCanvas, Paint paramPaint)
  {
    int i = this.a.getWidth();
    int j = this.a.getHeight();
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2 + e.a(this.a), this.c);
    paramCanvas.drawCircle(i / 2, j / 2, this.d / 2, paramPaint);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.a.a.b;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class as
  implements au
{
  public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      paramContext = b.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
    }
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
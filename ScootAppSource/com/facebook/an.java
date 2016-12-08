package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.facebook.b.ag;
import com.facebook.b.as;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

final class an
  implements ak
{
  private final OutputStream a;
  private final ag b;
  private boolean c = true;
  private boolean d = false;
  
  public an(OutputStream paramOutputStream, ag paramag, boolean paramBoolean)
  {
    this.a = paramOutputStream;
    this.b = paramag;
    this.d = paramBoolean;
  }
  
  private RuntimeException b()
  {
    return new IllegalArgumentException("value is not a supported type.");
  }
  
  public void a()
  {
    if (!this.d)
    {
      b("--%s", new Object[] { "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" });
      return;
    }
    this.a.write("&".getBytes());
  }
  
  public void a(String paramString, Bitmap paramBitmap)
  {
    a(paramString, paramString, "image/png");
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, this.a);
    b("", new Object[0]);
    a();
    if (this.b != null) {
      this.b.a("    " + paramString, "<Image>");
    }
  }
  
  public void a(String paramString1, Uri paramUri, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    a(paramString1, paramString1, str);
    paramString2 = w.f().getContentResolver().openInputStream(paramUri);
    if ((this.a instanceof ba))
    {
      long l = as.a(paramUri);
      ((ba)this.a).a(l);
    }
    for (int i = 0;; i = as.a(paramString2, this.a) + 0)
    {
      b("", new Object[0]);
      a();
      if (this.b != null) {
        this.b.a("    " + paramString1, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      }
      return;
    }
  }
  
  public void a(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    a(paramString1, paramString1, str);
    if ((this.a instanceof ba)) {
      ((ba)this.a).a(paramParcelFileDescriptor.getStatSize());
    }
    for (int i = 0;; i = as.a(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor), this.a) + 0)
    {
      b("", new Object[0]);
      a();
      if (this.b != null) {
        this.b.a("    " + paramString1, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
      }
      return;
    }
  }
  
  public void a(String paramString, Object paramObject, GraphRequest paramGraphRequest)
  {
    if ((this.a instanceof bd)) {
      ((bd)this.a).a(paramGraphRequest);
    }
    if (GraphRequest.b(paramObject))
    {
      a(paramString, GraphRequest.c(paramObject));
      return;
    }
    if ((paramObject instanceof Bitmap))
    {
      a(paramString, (Bitmap)paramObject);
      return;
    }
    if ((paramObject instanceof byte[]))
    {
      a(paramString, (byte[])paramObject);
      return;
    }
    if ((paramObject instanceof Uri))
    {
      a(paramString, (Uri)paramObject, null);
      return;
    }
    if ((paramObject instanceof ParcelFileDescriptor))
    {
      a(paramString, (ParcelFileDescriptor)paramObject, null);
      return;
    }
    if ((paramObject instanceof GraphRequest.ParcelableResourceWithMimeType))
    {
      paramGraphRequest = (GraphRequest.ParcelableResourceWithMimeType)paramObject;
      paramObject = paramGraphRequest.b();
      paramGraphRequest = paramGraphRequest.a();
      if ((paramObject instanceof ParcelFileDescriptor))
      {
        a(paramString, (ParcelFileDescriptor)paramObject, paramGraphRequest);
        return;
      }
      if ((paramObject instanceof Uri))
      {
        a(paramString, (Uri)paramObject, paramGraphRequest);
        return;
      }
      throw b();
    }
    throw b();
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, null, null);
    b("%s", new Object[] { paramString2 });
    a();
    if (this.b != null) {
      this.b.a("    " + paramString1, paramString2);
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    if (!this.d)
    {
      a("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
      if (paramString2 != null) {
        a("; filename=\"%s\"", new Object[] { paramString2 });
      }
      b("", new Object[0]);
      if (paramString3 != null) {
        b("%s: %s", new Object[] { "Content-Type", paramString3 });
      }
      b("", new Object[0]);
      return;
    }
    this.a.write(String.format("%s=", new Object[] { paramString1 }).getBytes());
  }
  
  public void a(String paramString, JSONArray paramJSONArray, Collection<GraphRequest> paramCollection)
  {
    if (!(this.a instanceof bd)) {
      a(paramString, paramJSONArray.toString());
    }
    do
    {
      return;
      bd localbd = (bd)this.a;
      a(paramString, null, null);
      a("[", new Object[0]);
      paramCollection = paramCollection.iterator();
      int i = 0;
      if (paramCollection.hasNext())
      {
        GraphRequest localGraphRequest = (GraphRequest)paramCollection.next();
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        localbd.a(localGraphRequest);
        if (i > 0) {
          a(",%s", new Object[] { localJSONObject.toString() });
        }
        for (;;)
        {
          i += 1;
          break;
          a("%s", new Object[] { localJSONObject.toString() });
        }
      }
      a("]", new Object[0]);
    } while (this.b == null);
    this.b.a("    " + paramString, paramJSONArray.toString());
  }
  
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    a(paramString, paramString, "content/unknown");
    this.a.write(paramArrayOfByte);
    b("", new Object[0]);
    a();
    if (this.b != null) {
      this.b.a("    " + paramString, String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(paramArrayOfByte.length) }));
    }
  }
  
  public void a(String paramString, Object... paramVarArgs)
  {
    if (!this.d)
    {
      if (this.c)
      {
        this.a.write("--".getBytes());
        this.a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
        this.a.write("\r\n".getBytes());
        this.c = false;
      }
      this.a.write(String.format(paramString, paramVarArgs).getBytes());
      return;
    }
    this.a.write(URLEncoder.encode(String.format(Locale.US, paramString, paramVarArgs), "UTF-8").getBytes());
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    a(paramString, paramVarArgs);
    if (!this.d) {
      a("\r\n", new Object[0]);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
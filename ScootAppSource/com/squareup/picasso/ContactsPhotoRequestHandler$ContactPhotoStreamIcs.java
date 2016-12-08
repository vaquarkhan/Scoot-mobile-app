package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.InputStream;

@TargetApi(14)
class ContactsPhotoRequestHandler$ContactPhotoStreamIcs
{
  static InputStream get(ContentResolver paramContentResolver, Uri paramUri)
  {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\ContactsPhotoRequestHandler$ContactPhotoStreamIcs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
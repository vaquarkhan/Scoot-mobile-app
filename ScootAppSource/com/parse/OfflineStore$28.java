package com.parse;

import a.m;
import a.o;
import android.content.ContentValues;
import org.json.JSONObject;

class OfflineStore$28
  implements m<Void, o<Void>>
{
  OfflineStore$28(OfflineStore paramOfflineStore, ParseObject paramParseObject, JSONObject paramJSONObject, String paramString, ParseSQLiteDatabase paramParseSQLiteDatabase) {}
  
  public o<Void> then(o<Void> paramo)
  {
    String str1 = this.val$object.getClassName();
    String str2 = this.val$object.getObjectId();
    int i = this.val$json.getInt("__isDeletingEventually");
    paramo = new ContentValues();
    paramo.put("className", str1);
    paramo.put("json", this.val$json.toString());
    if (str2 != null) {
      paramo.put("objectId", str2);
    }
    paramo.put("isDeletingEventually", Integer.valueOf(i));
    str1 = this.val$uuid;
    return this.val$db.updateAsync("ParseObjects", paramo, "uuid = ?", new String[] { str1 }).k();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\OfflineStore$28.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
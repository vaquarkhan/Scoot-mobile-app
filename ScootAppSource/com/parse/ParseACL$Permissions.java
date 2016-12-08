package com.parse;

import org.json.JSONException;
import org.json.JSONObject;

class ParseACL$Permissions
{
  private static final String READ_PERMISSION = "read";
  private static final String WRITE_PERMISSION = "write";
  private final boolean readPermission;
  private final boolean writePermission;
  
  ParseACL$Permissions(Permissions paramPermissions)
  {
    this.readPermission = paramPermissions.readPermission;
    this.writePermission = paramPermissions.writePermission;
  }
  
  ParseACL$Permissions(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.readPermission = paramBoolean1;
    this.writePermission = paramBoolean2;
  }
  
  static Permissions createPermissionsFromJSONObject(JSONObject paramJSONObject)
  {
    return new Permissions(paramJSONObject.optBoolean("read", false), paramJSONObject.optBoolean("write", false));
  }
  
  boolean getReadPermission()
  {
    return this.readPermission;
  }
  
  boolean getWritePermission()
  {
    return this.writePermission;
  }
  
  JSONObject toJSONObject()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (this.readPermission) {
        localJSONObject.put("read", true);
      }
      if (this.writePermission) {
        localJSONObject.put("write", true);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseACL$Permissions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
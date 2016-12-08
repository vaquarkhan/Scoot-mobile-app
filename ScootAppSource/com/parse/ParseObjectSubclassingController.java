package com.parse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

class ParseObjectSubclassingController
{
  private final Object mutex = new Object();
  private final Map<String, Constructor<? extends ParseObject>> registeredSubclasses = new HashMap();
  
  private static Constructor<? extends ParseObject> getConstructor(Class<? extends ParseObject> paramClass)
  {
    Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
    if (localConstructor == null) {
      throw new NoSuchMethodException();
    }
    int i = localConstructor.getModifiers();
    if ((Modifier.isPublic(i)) || ((paramClass.getPackage().getName().equals("com.parse")) && (!Modifier.isProtected(i)) && (!Modifier.isPrivate(i)))) {
      return localConstructor;
    }
    throw new IllegalAccessException();
  }
  
  String getClassName(Class<? extends ParseObject> paramClass)
  {
    ParseClassName localParseClassName = (ParseClassName)paramClass.getAnnotation(ParseClassName.class);
    if (localParseClassName == null) {
      throw new IllegalArgumentException("No ParseClassName annotation provided on " + paramClass);
    }
    return localParseClassName.value();
  }
  
  boolean isSubclassValid(String paramString, Class<? extends ParseObject> paramClass)
  {
    synchronized (this.mutex)
    {
      paramString = (Constructor)this.registeredSubclasses.get(paramString);
      if (paramString != null) {
        break label42;
      }
      if (paramClass == ParseObject.class) {
        return true;
      }
    }
    return false;
    label42:
    return paramString.getDeclaringClass() == paramClass;
  }
  
  ParseObject newInstance(String paramString)
  {
    Constructor localConstructor;
    synchronized (this.mutex)
    {
      localConstructor = (Constructor)this.registeredSubclasses.get(paramString);
      if (localConstructor == null) {}
    }
    try
    {
      paramString = (ParseObject)localConstructor.newInstance(new Object[0]);
      return paramString;
    }
    catch (RuntimeException paramString)
    {
      throw paramString;
    }
    catch (Exception paramString)
    {
      throw new RuntimeException("Failed to create instance of subclass.", paramString);
    }
    paramString = finally;
    throw paramString;
    paramString = new ParseObject(paramString);
    return paramString;
  }
  
  void registerSubclass(Class<? extends ParseObject> paramClass)
  {
    if (!ParseObject.class.isAssignableFrom(paramClass)) {
      throw new IllegalArgumentException("Cannot register a type that is not a subclass of ParseObject");
    }
    String str = getClassName(paramClass);
    synchronized (this.mutex)
    {
      Constructor localConstructor = (Constructor)this.registeredSubclasses.get(str);
      Class localClass;
      if (localConstructor != null)
      {
        localClass = localConstructor.getDeclaringClass();
        if (paramClass.isAssignableFrom(localClass)) {
          return;
        }
        boolean bool = localClass.isAssignableFrom(paramClass);
        if (!bool) {
          break label130;
        }
      }
      try
      {
        this.registeredSubclasses.put(str, getConstructor(paramClass));
        if (localConstructor == null) {
          return;
        }
        if (!str.equals(getClassName(ParseUser.class))) {
          break label238;
        }
        ParseUser.getCurrentUserController().clearFromMemory();
        return;
      }
      catch (NoSuchMethodException paramClass)
      {
        throw new IllegalArgumentException("Cannot register a type that does not implement the default constructor!");
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        label130:
        throw new IllegalArgumentException("Default constructor for " + paramClass + " is not accessible.");
      }
      throw new IllegalArgumentException("Tried to register both " + localClass.getName() + " and " + paramClass.getName() + " as the ParseObject subclass of " + str + ". Cannot determine the right class to use because neither inherits from the other.");
    }
    label238:
    if (localIllegalAccessException.equals(getClassName(ParseInstallation.class))) {
      ParseInstallation.getCurrentInstallationController().clearFromMemory();
    }
  }
  
  void unregisterSubclass(Class<? extends ParseObject> arg1)
  {
    String str = getClassName(???);
    synchronized (this.mutex)
    {
      this.registeredSubclasses.remove(str);
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseObjectSubclassingController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
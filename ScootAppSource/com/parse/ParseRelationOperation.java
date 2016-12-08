package com.parse;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

class ParseRelationOperation<T extends ParseObject>
  implements ParseFieldOperation
{
  private final Set<ParseObject> relationsToAdd;
  private final Set<ParseObject> relationsToRemove;
  private final String targetClass;
  
  private ParseRelationOperation(String paramString, Set<ParseObject> paramSet1, Set<ParseObject> paramSet2)
  {
    this.targetClass = paramString;
    this.relationsToAdd = new HashSet(paramSet1);
    this.relationsToRemove = new HashSet(paramSet2);
  }
  
  ParseRelationOperation(Set<T> paramSet1, Set<T> paramSet2)
  {
    Object localObject = null;
    this.relationsToAdd = new HashSet();
    this.relationsToRemove = new HashSet();
    if (paramSet1 != null)
    {
      Iterator localIterator = paramSet1.iterator();
      paramSet1 = (Set<T>)localObject;
      while (localIterator.hasNext())
      {
        localObject = (ParseObject)localIterator.next();
        addParseObjectToSet((ParseObject)localObject, this.relationsToAdd);
        if (paramSet1 == null)
        {
          paramSet1 = ((ParseObject)localObject).getClassName();
        }
        else
        {
          if (paramSet1.equals(((ParseObject)localObject).getClassName())) {
            break label204;
          }
          throw new IllegalArgumentException("All objects in a relation must be of the same class.");
        }
      }
    }
    for (;;)
    {
      if (paramSet2 != null)
      {
        localObject = paramSet2.iterator();
        paramSet2 = paramSet1;
        if (!((Iterator)localObject).hasNext()) {
          break label181;
        }
        paramSet2 = (ParseObject)((Iterator)localObject).next();
        addParseObjectToSet(paramSet2, this.relationsToRemove);
        if (paramSet1 == null) {
          paramSet1 = paramSet2.getClassName();
        }
      }
      for (;;)
      {
        break;
        if (!paramSet1.equals(paramSet2.getClassName()))
        {
          throw new IllegalArgumentException("All objects in a relation must be of the same class.");
          paramSet2 = paramSet1;
          label181:
          if (paramSet2 == null) {
            throw new IllegalArgumentException("Cannot create a ParseRelationOperation with no objects.");
          }
          this.targetClass = paramSet2;
          return;
        }
      }
      label204:
      break;
      paramSet1 = null;
    }
  }
  
  private void addAllParseObjectsToSet(Collection<ParseObject> paramCollection, Set<ParseObject> paramSet)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      addParseObjectToSet((ParseObject)paramCollection.next(), paramSet);
    }
  }
  
  private void addParseObjectToSet(ParseObject paramParseObject, Set<ParseObject> paramSet)
  {
    if ((Parse.getLocalDatastore() != null) || (paramParseObject.getObjectId() == null))
    {
      paramSet.add(paramParseObject);
      return;
    }
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      ParseObject localParseObject = (ParseObject)localIterator.next();
      if (paramParseObject.getObjectId().equals(localParseObject.getObjectId())) {
        paramSet.remove(localParseObject);
      }
    }
    paramSet.add(paramParseObject);
  }
  
  private void removeAllParseObjectsFromSet(Collection<ParseObject> paramCollection, Set<ParseObject> paramSet)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      removeParseObjectFromSet((ParseObject)paramCollection.next(), paramSet);
    }
  }
  
  private void removeParseObjectFromSet(ParseObject paramParseObject, Set<ParseObject> paramSet)
  {
    if ((Parse.getLocalDatastore() != null) || (paramParseObject.getObjectId() == null)) {
      paramSet.remove(paramParseObject);
    }
    for (;;)
    {
      return;
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        ParseObject localParseObject = (ParseObject)localIterator.next();
        if (paramParseObject.getObjectId().equals(localParseObject.getObjectId())) {
          paramSet.remove(localParseObject);
        }
      }
    }
  }
  
  public Object apply(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      paramObject = new ParseRelation(this.targetClass);
    }
    do
    {
      do
      {
        paramString = this.relationsToAdd.iterator();
        while (paramString.hasNext()) {
          ((ParseRelation)paramObject).addKnownObject((ParseObject)paramString.next());
        }
        if (!(paramObject instanceof ParseRelation)) {
          break;
        }
        paramString = (ParseRelation)paramObject;
        paramObject = paramString;
      } while (this.targetClass == null);
      paramObject = paramString;
    } while (this.targetClass.equals(paramString.getTargetClass()));
    throw new IllegalArgumentException("Related object object must be of class " + paramString.getTargetClass() + ", but " + this.targetClass + " was passed in.");
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
    paramString = this.relationsToRemove.iterator();
    while (paramString.hasNext()) {
      ((ParseRelation)paramObject).removeKnownObject((ParseObject)paramString.next());
    }
    return paramObject;
  }
  
  JSONArray convertSetToArray(Set<ParseObject> paramSet, ParseEncoder paramParseEncoder)
  {
    JSONArray localJSONArray = new JSONArray();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      localJSONArray.put(paramParseEncoder.encode((ParseObject)paramSet.next()));
    }
    return localJSONArray;
  }
  
  public JSONObject encode(ParseEncoder paramParseEncoder)
  {
    JSONObject localJSONObject1;
    if (this.relationsToAdd.size() > 0)
    {
      localJSONObject1 = new JSONObject();
      localJSONObject1.put("__op", "AddRelation");
      localJSONObject1.put("objects", convertSetToArray(this.relationsToAdd, paramParseEncoder));
    }
    for (;;)
    {
      JSONObject localJSONObject2;
      if (this.relationsToRemove.size() > 0)
      {
        localJSONObject2 = new JSONObject();
        localJSONObject2.put("__op", "RemoveRelation");
        localJSONObject2.put("objects", convertSetToArray(this.relationsToRemove, paramParseEncoder));
      }
      for (paramParseEncoder = localJSONObject2;; paramParseEncoder = null)
      {
        if ((localJSONObject1 != null) && (paramParseEncoder != null))
        {
          localJSONObject2 = new JSONObject();
          localJSONObject2.put("__op", "Batch");
          JSONArray localJSONArray = new JSONArray();
          localJSONArray.put(localJSONObject1);
          localJSONArray.put(paramParseEncoder);
          localJSONObject2.put("ops", localJSONArray);
        }
        do
        {
          return localJSONObject2;
          localJSONObject2 = localJSONObject1;
        } while (localJSONObject1 != null);
        if (paramParseEncoder != null) {
          return paramParseEncoder;
        }
        throw new IllegalArgumentException("A ParseRelationOperation was created without any data.");
      }
      localJSONObject1 = null;
    }
  }
  
  String getTargetClass()
  {
    return this.targetClass;
  }
  
  public ParseFieldOperation mergeWithPrevious(ParseFieldOperation paramParseFieldOperation)
  {
    if (paramParseFieldOperation == null) {
      return this;
    }
    if ((paramParseFieldOperation instanceof ParseDeleteOperation)) {
      throw new IllegalArgumentException("You can't modify a relation after deleting it.");
    }
    if ((paramParseFieldOperation instanceof ParseRelationOperation))
    {
      Object localObject = (ParseRelationOperation)paramParseFieldOperation;
      if ((((ParseRelationOperation)localObject).targetClass != null) && (!((ParseRelationOperation)localObject).targetClass.equals(this.targetClass))) {
        throw new IllegalArgumentException("Related object object must be of class " + ((ParseRelationOperation)localObject).targetClass + ", but " + this.targetClass + " was passed in.");
      }
      paramParseFieldOperation = new HashSet(((ParseRelationOperation)localObject).relationsToAdd);
      localObject = new HashSet(((ParseRelationOperation)localObject).relationsToRemove);
      if (this.relationsToAdd != null)
      {
        addAllParseObjectsToSet(this.relationsToAdd, paramParseFieldOperation);
        removeAllParseObjectsFromSet(this.relationsToAdd, (Set)localObject);
      }
      if (this.relationsToRemove != null)
      {
        removeAllParseObjectsFromSet(this.relationsToRemove, paramParseFieldOperation);
        addAllParseObjectsToSet(this.relationsToRemove, (Set)localObject);
      }
      return new ParseRelationOperation(this.targetClass, paramParseFieldOperation, (Set)localObject);
    }
    throw new IllegalArgumentException("Operation is invalid after previous operation.");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\parse\ParseRelationOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
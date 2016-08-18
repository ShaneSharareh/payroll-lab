
/**
 * Interface for ObjectList class
 * 
 * @author Shane Sharareh 
 * @version 3.1 - April 17, 2014
 */
public interface ObjectListInterface
{
     /**
     *Gets the first node in the list
     *@return the first node in the list
     */
    public ObjectListNode getFirstNode();
    
     /**
     *Gets the last node in the list
     *@return the last node in the list
     */
    public ObjectListNode getLastNode();
    
    /**
     *Gets the first object in the list
     *@return the first object in the list
     */
    public Object getFirst();
    
    /**
     *Gets the last object in a list
     *@return the last object in the list
     */
    public Object getLast();
    
    /**
     *Adds an object to the front of a list
     *@param o object thats added to the front of the list
     */
    public void addFirst(Object o);
    
     /**
     * Adds a node to the front of the list
     * @param p node thats added to the front of the list 
     */
    public void addFirst(ObjectListNode p); 
    
     /**
    * Adds an object to the end of the list
    * @param o object being added to the end of the list
    */
    public void addLast(Object o);
    
    /**
     * Adds a node to the end of the list
     * @param p node thats added to the end of the list 
     */
    public void addLast(ObjectListNode p);
    
    
    /** 
     *Removes the first object from the list
     *@return information of the first object being deleted
     */
    public Object removeFirst();
    
    /** 
     *Removes the last object from the list
     *@return information of the last object being deleted
     */
    public Object removeLast();
    
    /**
     * Inserts an object after the node referenced by p
     * @param p node being referenced
     * @param o object inserts after p
     */
    public void insertAfter (ObjectListNode p, Object o);
    
    /**
     *Inserts a node after the node referenced by p
     *@param p node being referenced
     *@param q node inserts after p
     */
    public void insertAfter(ObjectListNode p, ObjectListNode q);
    
     /**
      *Deletes the node after the node referenced by p
      *@param p node being referenced
      *@return info of node being deleted
      */
    public Object deleteAfter(ObjectListNode p);
    
    /**
     *Inserts an object into its correct location within the ordered list
     *@param o object being inserted
     */
    public void insert(Object o);
    
     /**
     *Inserts a node into its correct location within the ordered list
     *@param r node being inserted
     */
    public void insert(ObjectListNode r); 
    
    /**
     *Removes the first occurrence of an item in a list
     *@param o object that is to be removed
     */
    public Object remove(Object o);
    
      /**
     *@return true if the item is found in the list
     */
    public boolean contains(Object o);
    
     /**
     *@return a reference to the node with the requested value or null if node has not been found
     */
    public ObjectListNode select(Object o);
    
     /**
     *Determines if the list is empty
     *return true if list is empty
     */
    public boolean isEmpty();
    
     /**
     *Removes all elements from a list
     */
    public void clear();
    
    /**
     *@return the number of elements in the list
     */
    public int size();
    
    /**
     *Makes a copy of a list
     *@return the new list
     */
    public ObjectList copyList();
    
    /**
     *Reverses a list
     */
    public void reverse(); 
}



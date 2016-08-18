/**
 * This class has nodes which is used in the ObjectList class
 * 
 * @author Richard Stegman
 * @version 3.1 - April 17, 2014
 */
public class ObjectListNode implements ObjectListNodeInterface {
    private Object info;
    private ObjectListNode next;
    
    /**
     *Default Constructor
     */
    public ObjectListNode() {
        info = null;
        next = null;
    }

   /**
    *One-arg Constructor
    *@param o new info being set in the info field
    */
    public ObjectListNode (Object o) {
        info = o;
        next = null;
    }    
    
   /**
    *Two-arg Constructor
    *@param o new info being set in the info field
    *@param p new info being assigned to the next node
    */
    public ObjectListNode (Object o, ObjectListNode p) {
        info = o;
        next = p;
    }       

    /**
     *Sets info field
     *@param o being set as info for node
     */
    public void setInfo(Object o) {
        info = o;
    }    

    /**
     *Gets the info for the node 
     *@return object in info field
     */
    public Object getInfo() {
        return info;
    }

    /**
     *Sets info for the next node
     *@param p is being set to the next node
     */
    public void setNext(ObjectListNode p) {
        next = p;
    }

    /**
     *Gets the next node 
     *@return object in info field of nextNode
     */
    public ObjectListNode getNext() {
        return next;
    }
}

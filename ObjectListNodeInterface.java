
/**
 * Interface for ObjectListNode class
 * 
 * @author Shane Sharareh 
 * @version 3.1 - April 17, 2014
 */
public interface ObjectListNodeInterface
{

    /**
     *Sets the info field
     *@param o object being inserted into the info field of node
     */
    public void setInfo(Object o);

    /**
     *Gets the info from the node  
     *@return object in info field
     */
    public Object getInfo();

    /**
     *Sets an object into the next node
     *@param p object being inserted into the next node
     */
    public void setNext(ObjectListNode p);

    /**
     *Gets the next node
     *@return object in next node
     */
    public ObjectListNode getNext();
}

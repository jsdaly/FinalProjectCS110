// ********************************************************
// Interface ListInterface for the ADT list.
// *********************************************************
public interface ListInterface {
  public boolean isEmpty();
  public int size();
  /** add method throws exception*/
  public void add(int index, Object item) 
                  throws ListIndexOutOfBoundsException;
/** get method throws exception*/
  public Object get(int index) 
                  throws ListIndexOutOfBoundsException;
  /** remove method throws exception*/
  public void remove(int index) 
                  throws ListIndexOutOfBoundsException;

  public void removeAll();
}  // end ListInterface

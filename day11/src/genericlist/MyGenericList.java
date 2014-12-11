package genericlist;
/**
 * adapted from List interface provided by PiJ for coursework2
 * but altered to make it generic
 * 
 * For PiJ day 11 exercise 3. 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * 
 */
public interface MyGenericList<T> {
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty();

	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size();

	/**
	 * Returns the elements at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or null if there was an error
	 */
	public T get(int index);

	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or null if there was an error
	 */
	public T remove(int index);

	/**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
     * for invalid indices throw an error.
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 */
	public void add(int index, T item);

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         the item added or containing an appropriate error message
	 */
	public void add(T item);
}

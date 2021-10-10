package Model;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 * @param <E> Employee
 */
public interface Employee_list_interface<E> {
    
    public void Add(E nv);
    
    public void Update(int n,E nv);
    
    public boolean RemoveByID(String ID);
    
    public E findByID(String ID);
    
    public ArrayList<E> getList();
    
    public void setList(ArrayList<E> list);
    
    
}

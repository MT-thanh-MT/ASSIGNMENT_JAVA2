package Model;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface Employee_list_interface {
    public void Add(Employee nv);
    public void Update(int n,Employee nv);
    public boolean RemoveByID(String ID);
    public Employee findByID(String ID);
    public ArrayList<Employee> getList();
    public void setList(ArrayList<Employee> list);
    
}

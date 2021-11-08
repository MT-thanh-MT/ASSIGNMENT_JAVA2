/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface QLSVInterface<E,E1> {
    public void them(E e);
    public void sua(int index,E e);
    public void xoa(int index);
    public void setList(ArrayList<E> list);
    public ArrayList<E> getList();
    public void ghiFile(String path, E1 e)throws Exception;
    public E1 docFile(String path)throws Exception;
    
}

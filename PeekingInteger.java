
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
public class PeekingInteger implements Iterator<Integer>{
    /*
    Given an Iterator class interface with methods: next() and hasNext(), design and implement a PeekingIterator that support the peek() operation -- 
    it essentially peek() at the element that will be returned by the next call to next()
    Example:

    Assume that the iterator is initialized to the beginning of the list: [1,2,3].

    Call next() gets you 1, the first element in the list.
    Now you call peek() and it returns 2, the next element. Calling next() after that still return 2. 
    You call next() the final time and it returns 3, the last element. 
    Calling hasNext() after that should return false.  
    */
    
    private Integer next = null;
    private Iterator<Integer> iter; 
    
    
    public PeekingInteger(Iterator<Integer> iterator){
        iter = iterator;
        if(iter.hasNext()){
            next = iter.next();
        }
        
    }
    
    public Integer peek(){
        return next;
    }
 
    @Override
    public boolean hasNext(){
        return next != null;
    }
    @Override
    public Integer next(){
        Integer res = next; 
        next = iter.hasNext() ? iter.next() : null;
        return res;
    }
    
}

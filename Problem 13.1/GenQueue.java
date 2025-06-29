
class GenQueue <T> implements IGenQ<T> {
    private  T q[];

    private  int putloc, getloc;

    public GenQueue(T[] aRef) {
    q = aRef;
    putloc = getloc = 0;
    }

public void put (T obj) throws  QueueFullException{
    if (putloc==q.length-1) 
        throw new QueueFullException(q.length);
    
    q[putloc++] = obj;
    }

public T get() throws QueueEmptyExcepiton {
    if (getloc == putloc) throw new QueueEmptyExcepiton();
    return q[getloc++];
    }
    }
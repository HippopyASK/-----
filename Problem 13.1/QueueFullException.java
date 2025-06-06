class QueueFullException extends Exception {
    int size;

    public QueueFullException(int s) {size = s;}

    public String toString() {
        return  "\n Queue is full. Max size of queue: " + size;
    }

    
}
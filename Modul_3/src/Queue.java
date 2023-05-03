public class Queue {
    private int maxSize;
    private String[] queueArray;
    private int tail;

    public Queue(int a){
        maxSize = a;
        queueArray = new String[maxSize];
        tail = -1;
    }

    public void add (String j){
        queueArray[++tail] = j;
    }
    public void offer (String j){
        if (tail<maxSize){
            queueArray[++tail] = j;
        }else {
            System.out.println("false");
        }
    }
    public String remove(){
        queueArray[tail+1] = queueArray[0];
        int i=0;
        while(i<=tail){
            queueArray[i] = queueArray[i+1];
            i++;
        }
        return queueArray[tail--];
    }
    public String element(){
        return queueArray[0];
    }
    public String peek(){
        if (tail == -1){
            return ("Null");
        }else {
            return queueArray[0];
        }
    }
    public String poll(){
        if (tail == -1){
            return ("Null");
        }else {
            queueArray[tail+1] = queueArray[0];
            int i=0;
            while(i<=tail){
                queueArray[i] = queueArray[i+1];
                i++;
            }
            return queueArray[tail--];
        }
    }

    public static void main(String[] args) {
    Queue queue = new Queue(10);
    queue.add("Java");
    queue.add("DotNet");
    queue.offer("PHP");
    queue.offer("HTML");
    System.out.println("remove : " + queue.remove());
    System.out.println("element: " + queue.element());
    System.out.println("poll   : " + queue.poll());
    System.out.println("peek   : " + queue.peek());
    }
}

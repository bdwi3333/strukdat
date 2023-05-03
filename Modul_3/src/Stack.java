public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int a){
        maxSize = a;
        stackArray = new String[maxSize];
        top = -1;
    }
    public void push (String j){
        stackArray[++top] = j;
    }
    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean empty(){
        return (top == -1);
    }
    public int search(String h){
        int i = 0;
        while(i<=top){
            if(stackArray[top-i].equals(h)){
                return (i+1);
            }
            i++;
        }
        return (-1);
    }

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");
        System.out.println("Next : " +st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");
        int count = st.search("Aku");
        while (count != -1 && count  > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}

import java.util.*;

class Main3 extends Stack<Integer> {
    Stack<Integer> st = new Stack<>();
    Integer minval;

    public boolean isEmpty(){
        return st.isEmpty();
    }
    public boolean isFull(){
        return st.size()==Integer.MAX_VALUE;
    }
    public void push(int val){
        if(st.isEmpty()){
            minval=val;
            st.push(val);
        }
        else {
            if(val<minval){
                st.push((2*val)-minval);
                minval=val;
            }
            else st.push(val);
        }
    }
    public Integer pop(){
        if(st.isEmpty()){
            return null;
        }
        int val=st.peek();
        if(val<minval){
           minval=(2*minval)-val;
        }

        return st.pop();
    }
    public int top(){
        int val=st.peek();
        if(val<minval){
            return minval;
        }
        return val;
    }
    public int getMin(){
        if(st.isEmpty()){
            throw new IllegalStateException("Stack is Empty");
        }
        return minval;
    }


}
public class specialStack {
    public static void main(String[] args) {
        Main3 s = new Main3();
        System.out.println("Stack isEmpty Method: "+s.isEmpty());
        System.out.println("Stack isFull method: "+s.isFull());
        s.push(4);
        s.push(2);
        s.push(7);
        s.push(9);
        System.out.println("Values inserted");
        System.out.println("The pop method: "+s.pop());
        System.out.println("Minimum value in the stack is: "+s.getMin());
    }
}
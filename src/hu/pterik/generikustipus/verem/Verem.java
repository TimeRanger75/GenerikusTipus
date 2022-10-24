package hu.pterik.generikustipus.verem;

public class Verem <T extends Object>{
    private int stackSize;
    private T[] stackArray;
    private int top;

    public Verem(int meret){
        this.stackSize=meret;
        this.stackArray=(T[]) new Object[stackSize];
        this.top=-1;
    }

    public void push(T belepes) throws Exception{
        if (this.isFull()){
            System.out.println("A verem tele van");
            this.increaseStackCapacity();
        }
        System.out.println(belepes+" elem hozzáadva");
        this.stackArray[++top]=belepes;
    }

    public T pop() throws Exception{
        if (this.isEmpty()){
            System.out.println("Verem üres");
        }
        T belepes=this.stackArray[top--];
        System.out.println(belepes+" elem eltávolítva");
        return belepes;
    }

    public T top(){
        return stackArray[top];
    }

    public boolean isFull(){
        return top==stackSize-1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

//    public T empty{
//
//    }

    private void increaseStackCapacity(){
        T[] newStack= (T[]) new Object[this.stackSize*2];
        for (int i=0;i<stackSize;i++){
            newStack[i]=this.stackArray[i];
        }
        this.stackArray=newStack;
        this.stackSize=this.stackSize*2;
    }


}

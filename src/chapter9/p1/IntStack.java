package chapter9.p1;

 interface IntStack {
    void push(int item);
    int pop();
    default int[] popElements(int n){
        return getElements(n);
    }
    default int[]skipAndPopnElements(int skip,int n){
        getElements(skip);
        return getElements(n);
    }
    //private
    default int[]getElements(int n){
        int[]elements=new int[n];
        for(int i=0;i<n;i++)elements[i]=pop();
        return  elements;
    }
}

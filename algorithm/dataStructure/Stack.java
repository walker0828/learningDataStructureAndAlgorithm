public class ArrayStack {
    private String[] items;
    //栈中元素个数
    private int count;
    //栈的大小
    private int n;

    public ArrayStack(int n) {
        this.items = new String[n];
        this.count = 0;
        this.n = n;
    }


}
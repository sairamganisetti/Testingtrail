public class ClassC extends ClassB{

    public void meth3(){
        System.out.println("This is the Class c method");
    }
    public void meth4(int a, int c){
        System.out.println(a+c);

    }
    public static void main(String[]args){
        ClassC c=new ClassC();
        c.meth1(10,5);
        c.meth2();
        c.method("hello");
        c.meth4(4,4);
    }


}

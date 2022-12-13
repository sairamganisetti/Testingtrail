public class ClassB extends ClassA{

    public int  meth1(int a, int b){

        System.out.println(a);
        return a+b;

    }
    public void meth2(){
        System.out.println("This is the second method");
    }
    public static void main(String[] args){
        ClassB obj=new ClassB();
        obj.method("Hello java");
        obj.meth1(5,10);
        obj.meth2();
        obj.meth();
    }
}

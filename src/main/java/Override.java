public class Override extends ClassC{
    //@java.lang.Override
    public void meth3(){
        System.out.println("This is over ride method");
    }
    public static void main(String[]args){
        ClassC c=new Override();
        c.meth3();
        ClassC  o=new  ClassC();
        o.meth3();

    }

}

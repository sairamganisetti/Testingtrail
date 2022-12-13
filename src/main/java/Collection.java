import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String args[]){
        List<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
//Traversing list through Iterator
       // Iterator itr=list.iterator();
        //while(itr.hasNext()){
          //  System.out.println(itr.next());
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            for (String s:list
                 ) {
                System.out.println(s);

            }
        }
    }
}

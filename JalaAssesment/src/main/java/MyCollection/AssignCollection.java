package MyCollection;

import java.util.*;

public class AssignCollection {

    public void ArrayList()
    {
        List<String> s =new ArrayList(10);
        s.add("Hello");
        s.add("World");
        s.add("Work");
        s.add("Code");
        s.add("Done");
        s.add("job");
        s.add("Working Code");

        Iterator str=s.iterator();
        while(str.hasNext())
        {
            System.out.println(str.next());
        }
      s.add(3,"Add element at index 3");
        s.remove(5);
        s.add(1,"Update the index");
        System.out.println(s);
        System.out.println(s.indexOf("World"));
        System.out.println(s.get(5));
        System.out.println(s.size());
        System.out.println(s.contains("job"));
        s.removeAll(s);
        System.out.println(s);
    }

    public void HashMap()
    {
        Map<Integer,String> m=new HashMap<>(10);
        m.put(1,"Ahad");
        m.put(2,"Raj");
        m.put(3,"Manav");
        m.put(4,"mohan");
        m.put(5,"Dilip");
        m.put(6,"sufiyan");
        m.put(7,"Naveen");
        m.put(8,"salman");
        m.put(9,"rohit");
        m.put(10,"zara");
        System.out.println(m.get(10));
        Map clone=new HashMap();
        clone.putAll(m);
        System.out.println(m);
        System.out.println(clone);
        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("salman"));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        m.remove(3);
        System.out.println(m);
    }
    public void HashSet()
    {
        Set<String> s=new HashSet<>();
        s.add("Hello");
        s.add("World");
        s.add("Time");
        s.add("Work");
        s.add("Movie");
        s.add("games");
        s.add("sleep");
        s.add("workout");
        System.out.println(s);
        s.remove("Movie");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains("sleep"));
        Iterator itr=s.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(s.isEmpty());
        Collections.sort(new ArrayList(s));
        System.out.println(s);

    }

    public static void main(String[] args) {
        AssignCollection c=new AssignCollection();
//        c.ArrayList();
//        c.HashMap();
        c.HashSet();
    }
}

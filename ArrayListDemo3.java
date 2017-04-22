import java.util.*;

class ArrayListDemo3
{
public static void main(String s[])
{
ArrayList<ArrayList>al=new ArrayList<ArrayList>();
ArrayList<String> als=new ArrayList<String>();
System.out.println(al.size());
al.add(al);
al.add(al);
al.add(al);
al.add(al);
System.out.println(al.size());
System.out.println(al);
}
}
import java.util.*;

class VectorDemo
{
public static void main(String args[])
{
Vector<String>al=new Vector<String>(3,2);
System.out.println("ini"+al.capacity());
System.out.println(al.size());
al.addElement("a");
al.addElement("b");
al.addElement("a");
al.addElement("b");
System.out.println("cap"+al.capacity());
System.out.println(al.size());
al.removeElementAt(2);
Enumeration e1=al.elements();
while(e1.hasMoreElements())
{
String s=(String)e1.nextElement();
System.out.print(s);
}
System.out.println(" ");
Iterator e=al.iterator();
while(e.hasNext());
{
String s=(String)e.next();
System.out.println(s);
}
}
}

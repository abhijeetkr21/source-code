import java.util.*;

class HashMapDemo1
{
public static void main(String args[])
{
HashMap<Emp,String>hm=new HashMap<Emp,String>();
System.out.println(hm.size());
hm.put(new Emp(10),"aaaa");
hm.put(new Emp(10),"bbbb");
hm.put(new Emp(10),"cccc");
hm.put(new Emp(10),"dddd");
Set s=hm.entrySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Map.Entry e=(Map.Entry)i.next();
Emp k=(Emp)e.getKey();
String v=(String)e.getValue();
System.out.println(k.id+"="+v);
}
}
}
class Emp
{
int id;
Emp(int id)
{
this.id=id;
}
public boolean equals(Object o)
{
Emp e=(Emp)o;
if(e.id==this.id)
return true;
else
return false;
}
public int hashCode()
{
return id*10;
}
}


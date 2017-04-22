import java.util.*;

class TreeSetDemo
{
public static void main(String args[])
{
TreeSet<Emp>al=new TreeSet<Emp>();
System.out.println(al.size());
al.add(new Emp(100000));
al.add(new Emp(50000));
al.add(new Emp(25000));
al.add(new Emp(125000));
Iterator i=al.iterator();
while(i.hasNext())
{
Emp e=(Emp)i.next();
System.out.println(e.salary);
}
}
}
class Emp implements Comparable
{
int salary;
Emp(int salary)
{
this.salary=salary;
}
public int compareTo(Object o)
{
Emp t=(Emp)o;
if(this.salary>t.salary)
return 1;
else if(this.salary<t.salary)
return -1;
else 
return 0;
}
}



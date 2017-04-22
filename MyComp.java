import java.util.*;

class MyComp Implements Comparator
{
public int compare(Object 01,Object 02)
{
Temp t1=(Temp)01;
Temp 02=(Temp)02;
if(t1.salary>t2.salary)
return 1;
else if(t1.salary<t2.salary)
return -1;
else
return 0;
}
}
class MyTree
{
public static void main(String s[])
{
Comparator m=new MyComp();
TreeSet<Temp>t=new TreeSet<Temp>(m);
t.add(new Temp(10));
t.add(new Temp(05));
t.add(new Temp(03));
t.add(new Temp(04));
t.add(new Temp(02));
t.add(new Temp(12));
t.add(new Temp(15));
Iterator i=t.iterator();
while(i.hasNext())
{
Temp t1=(Temp)i.next();
System.out.println(t1.salary);
}
}
}
class Temp
{
int salary;
Temp(int salary)
{
this.salary=salary;
}
}

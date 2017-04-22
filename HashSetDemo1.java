import java.util.*;

class HashSetDemo1
{
	public static void main(String s[])
		{
			HashSet<Emp>al=new HashSet<Emp>();
			System.out.println(al.size());
			al.add(new Emp(1002));
			al.add(new Emp(1002));
			al.add(new Emp(1002));
			System.out.println(al.size());
			Iterator i=al.iterator();
			while(i.hasNext())
				{
					Emp e=(Emp)i.next();
					System.out.println(e.id);
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
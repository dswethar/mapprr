/**
 * 
 */
package Practice;

/**
 * @author swethareddy
 *
 */
public class Encapsulation 
{
     
	
	public static void main(String[] args) 
	{
		emp e1=new emp();
		e1.setEmpid(3);
		e1.setEmpname("swetha");
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());

	}
}
	class emp
	{
		
		private int empid;
		private String empname;
		
		public int getEmpid() {
			return empid;
		}
		
		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}
	}



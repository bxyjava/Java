package pack1;

public class Stu {
	String id;	
	String name;
	String password;
public Stu(String i, String n,String p) {
	    id = i;
	    name = n;
	    password = p;
	  }
	  public String getid() {
	    return id;
	  }
	  public String getname() {
	    return name;
	  }
	  public String getpassword() {
		  return password;
	  }
      public String toString() {
		   return "  Ñ§ºÅ£º" + id+ " ĞÕÃû£º" + name 
				   + " ÃÜÂë£º" + password;
		   }
}
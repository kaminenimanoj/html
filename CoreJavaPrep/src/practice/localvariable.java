package practice;

public class localvariable {

		    String name;
		    String course;
		    int age;
		    public referencevariables(String name, String course,int age)
		    {
		        this.name = name;
		        this.course = course;
		        this.age = age;
		    }
		    public String getName();
		    {
		        return name;
		    }
		    public static void main(String[] args){
		    	referencevariables s1 = new referencevariables("manoj","CSE",23);
		        System.out.println(s1.getName());
		    }
		}


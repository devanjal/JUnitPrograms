package testing;

//Enter bread of the dog. Output return the origin of that breed
public class DogType {
public class A implements Dog {
 public String breed(){
	 System.out.println("Labrador");
	 String Lab="Labrador";
	 return Lab;
 }
 public String origin(){
	 System.out.println("Germany");
	 String Ger="Germany";
	 return Ger;
 }}
public class bullDog implements Dog{
	public String breed(){
		 System.out.println("samoyed");
		 String sam="Samoyed";
		 return sam;
	 }
	 public String origin(){
		 System.out.println("Russia");
		 String Rus="Russia";
		 return Rus;
	 }
}
public String inter(){
    DogType d= new DogType();
    A a=d.new A();
    bullDog b=d.new bullDog();
    String x=a.breed();
    a.origin();
    b.breed();
    b.origin();
    return x;
 }
}

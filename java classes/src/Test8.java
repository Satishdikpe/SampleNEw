
public class Test8 {
public String country (String nameofcountry)
{
if(nameofcountry.equalsIgnoreCase("India"))	
{
return "new delhi";	
}
else if (nameofcountry.equalsIgnoreCase("USA"))
{
return "Washington DC";
}
return "No match found";
}
public static void main(String[] args) {
	System.out.println(new Test8().country("INDIA"));
}
}

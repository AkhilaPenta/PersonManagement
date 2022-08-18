package com.mdt.pg1;
import java.util.*;
public class PersonData {
	int Id;
	String name;
	int Age;
	double PurchaseAmount;
	public PersonData(int Id,String name,int age,double PurchaseAmount) {
		super();
		this.Id=Id;
		this.name=name;
		this.Age=Age;
		this.PurchaseAmount=PurchaseAmount;
	}
	public int getId() {
		return  Id;
	}
	public void setId(int Id) {
		this.Id=Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	public double PurchaseAmount() {
		return PurchaseAmount;
		}
	public void setAge(double PurchaseAmount) {
		this.PurchaseAmount=PurchaseAmount;
	}
	public String toString() {
		return "PersonData[Id="+Id+",name="+name+",PurchaseAmount="+PurchaseAmount+"age="+Age+"]";
	}
	public static void main(String[] args) {
		PersonData p1=new PersonData(101,"Sony",22,25000);
		PersonData p2=new PersonData(102,"Akhila",20,28000);
		PersonData p3=new PersonData(103,"Anusha",24,23000);
		PersonData p4=new PersonData(104,"Suhan",23,20000);
		PersonData p5=new PersonData(105,"Sourya",19,30000);
		PersonData p6=new PersonData(106,"Surya",26,32000);
		PersonData p7=new PersonData(107,"Krthik",25,31000);
		PersonData p8=new PersonData(108,"Pranay",27,29000);
		PersonData p9=new PersonData(109,"Kalyani",29,26000);
		PersonData p10=new PersonData(110,"Sruthi",28,22000);
		ArrayList<PersonData>pd=new ArrayList<PersonData>();
		pd.add(new PersonData(101,"Sony",22,25000));
		pd.add(p2);
		pd.add(p3);
		pd.add(p4);
		pd.add(p5);
		pd.add(p6);
		pd.add(p7);
		pd.add(p8);
		pd.add(p9);
		pd.add(p10);
		for(int i=0;i<3;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("1 for display all person names in ascending order");
			System.out.println("2 for display updated purchaseAmount by id");
			System.out.println("Enter your choice:");
			int a=s.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("persons data in ascending order");
				Collections.sort(pd,new Comparator<PersonData>()
						{

							public int compare(PersonData s1, PersonData s2) {
								return s1.getName().compareTo(s2.getName());
								}
				});
				System.out.println("After Sorting");
				System.out.println("Id,Name,Age,PurchaseAmount");
				for(PersonData pdt:pd)
				{
					System.out.println(pdt.getId()+""+pdt.getName()+""+pdt.PurchaseAmount()+""+pdt.getAge());
				}
				break;
			case 2:
				System.out.println("Enter person id");
				Scanner s1=new Scanner(System.in);
				int id=s1.nextInt();
				System.out.println("Enter updated purchaseamount");
				double d=s1.nextDouble();
				System.out.println("Id,Name,Age,PurchaseAmount");
				for(PersonData pdt:pd)
				{
					if(pdt.getId()==id)
					{
					  pdt.PurchaseAmount();	
					}
					System.out.println(pdt.getId()+""+pdt.getName()+""+pdt.PurchaseAmount()+""+pdt.getAge());
				}
				break;
				default:
					System.out.println("Exit from the application");
					break;
			}
			}
	
	}
	}
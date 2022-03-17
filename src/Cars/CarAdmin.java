package Cars;

import java.util.Scanner;

public class CarAdmin {
	
	public static Items item=new Items();
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{	
		try {
		System.out.println("Enter the Car Model");
		String carName=sc.next();
		item.setCarName(carName);
		selectCarType();
		System.out.println("Enter the Car cost price");
		int carCp=sc.nextInt();
		item.setCarcp(carCp);
		selectInsuranceType();
		showResult();
		}catch(Exception e) {
			System.out.println(e);
			main(args);
		}
	
	}
	public static void selectCarType()
	{
		
		System.out.println("Enter 1 for Hatchback");
		System.out.println("Enter 2 for Sedan");
		System.out.println("Enter 3 for SUV");
		int carType =sc.nextInt();
		if(0 <carType && carType <4)
		{
			switch (carType) {
			  case 1:
			    item.setCarType(CarType.Hatchback);
			    break;
			  case 2:
			    item.setCarType(CarType.Sedan);
			    break;
			  case 3:
			    item.setCarType(CarType.SUV);
			    break;
			}
		}
		else
		{
			System.out.println("Select the correct Car type");
			selectCarType();
		}
		
		
	}
	public static void selectInsuranceType()
	{
		
		System.out.println("Enter 1 for Basic");
		System.out.println("Enter 2 for Premium");
		int insuranceType =sc.nextInt();
		if(0 < insuranceType && insuranceType <3)
		{
			switch (insuranceType) {
			  case 1:
			    item.setInsuranceType(Insurance.Basic);
			    break;
			  case 2:
			    item.setInsuranceType(Insurance.Premium);
			    break;
			}
		}
		else
		{
			System.out.println("Select the correct Insurance type");
			selectInsuranceType();
		}
		
	}
	public static void showResult()
	{
		System.out.println("Car Model : "+item.getCarName());
		System.out.println("Car Price : "+item.getCarcp());
		System.out.println("Total Insurance : "+new Calculate().calculateInsurance(item));
	}
}

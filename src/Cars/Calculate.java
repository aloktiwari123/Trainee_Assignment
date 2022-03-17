package Cars;

public class Calculate implements CalculationService {

	@Override
	public double calculateInsurance(Items item) {
		int cp=item.getCarcp();
		int premium=item.getCarType().getValue();
		double Basicpremium=(cp*premium)/100;
		if(item.getInsuranceType()==Insurance.Premium)
		{
			return Basicpremium+(Basicpremium*20)/100;
		}
		
		return (Basicpremium);
	}

}

package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testWorkerUSD() {
		Employee e1=new Employee(400,"USD",10,EmployeeType.Worker);
		// caso en el que la moneda es USD y el empleado es Worker
		assertEquals(464.0,Math.round(e1.cs()));
	}
	
	@Test
	void testSupervisorUSD() {
		Employee e2=new Employee(400,"USD",10,EmployeeType.Supervisor);
		// caso en el que la moneda es USD y el empleado es Supervisor
				assertEquals(468.0,Math.round(e2.cs()));
	}
	
	@Test
	void testManagerUSD() {
		Employee e3=new Employee(400,"USD",10,EmployeeType.Manager);
		// caso en el que la moneda es USD y el empleado es Manager
				assertEquals(471.0,Math.round(e3.cs()));
	}
	
	@Test
	void testOtraMoneda() {
		Employee e4=new Employee(400,"EUR",10,EmployeeType.Worker);
		// caso en el que la moneda es distinta de USD
				assertEquals(444.0,Math.round(e4.cs()));
	}
	
	@Test
	void calculateYearBonusWorkerUSDtest() {
		Employee e1 = new Employee(100,"USD",10,EmployeeType.Worker);
		//caso en que empleado es worker y gana en USD
		float valor = e1.CalculateYearBonus();
		assertEquals(386,valor);
		
	}
	@Test
	void calculateYearBonusManagerUSDtest(){
		Employee e1 = new Employee(110,"USD",10,EmployeeType.Manager);
		//caso en que empleado es Manager y gana en USD
		float valor = e1.CalculateYearBonus();
		assertEquals(496,valor);
	}
	@Test
	void calculateYearBonusSupervisorUSDtest(){
		Employee e1 = new Employee(105,"USD",10,EmployeeType.Supervisor);
		//caso en que empleado es Supervisor y gana en USD
		float valor = e1.CalculateYearBonus();
		assertEquals(298,valor);
	}
	
	@Test
	void monedaDistintatest(){
		Employee e1 = new Employee(105,"EUR",10,EmployeeType.Worker);
		//caso en que empleado es worker y gana en otra moneda
		float valor = e1.CalculateYearBonus();
		assertEquals(386,valor);
	}
	


}

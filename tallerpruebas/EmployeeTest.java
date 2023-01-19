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
	


}

<<<<<<< HEAD
package ej8;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.PotenciaDe2;

@RunWith(Parameterized.class)
public class Multiplica {
	private int num1, num2, resul;
	
	public Multiplica(int num1, int num2, int resul) {
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {{1,1,2},{2,2,4},{1,7,8} });
	}
	
	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(num1, num2);
		int resultado = calcu.suma();
		assertEquals(resul, resultado);
	}

}
=======
package ej8;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.PotenciaDe2;

@RunWith(Parameterized.class)
public class Multiplica {
	private int num1, num2, resul;
	
	public Multiplica(int num1, int num2, int resul) {
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}
	
	@Parameters
	public static Collection<Object[]> parametros(){
		return Arrays.asList(new Object[][] {{1,1,2},{2,2,4},{1,7,8} });
	}
	
	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(num1, num2);
		int resultado = calcu.suma();
		assertEquals(resul, resultado);
	}

}
>>>>>>> ef0976c4992fd43594b0a9afe1d0a8a22011c2c7

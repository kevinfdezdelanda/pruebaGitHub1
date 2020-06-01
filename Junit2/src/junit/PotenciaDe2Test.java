<<<<<<< HEAD
package junit;


import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.PotenciaDe2;



@RunWith(Parameterized.class)
public class PotenciaDe2Test {
	private int exponente;
	private String resultado;

	public PotenciaDe2Test(int exponente, String resultado) {
		this.exponente = exponente;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { { 0, "1" }, { 1, "2" }, { 5, "32" }, { 6, "64" }, { 100, "1267650600228229401496703205376" } });
	}

	@Test
	public void testPotenciaDe2() {
		assertEquals(resultado, PotenciaDe2.povOf2(exponente));
	}
}

=======
package junit;


import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import junit.PotenciaDe2;



@RunWith(Parameterized.class)
public class PotenciaDe2Test {
	private int exponente;
	private String resultado;

	public PotenciaDe2Test(int exponente, String resultado) {
		this.exponente = exponente;
		this.resultado = resultado;
	}

	@Parameters
	public static Collection<Object[]> numeros() {
		return Arrays.asList(new Object[][] { { 0, "1" }, { 1, "2" }, { 5, "32" }, { 6, "64" }, { 100, "1267650600228229401496703205376" } });
	}

	@Test
	public void testPotenciaDe2() {
		assertEquals(resultado, PotenciaDe2.povOf2(exponente));
	}
}

>>>>>>> ef0976c4992fd43594b0a9afe1d0a8a22011c2c7

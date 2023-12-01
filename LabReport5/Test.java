import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection; 
import java.util.NoSuchElementException;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Test {
    @Test 
	public void testChooser(){
		LongWordChooser lwc = new LongWordChooser();
		String[] strings = {"catastrophe", "dog", "Jeyasri"};
		String[] choosen = {"catastrophe", "Jeyasri"};
		problem stringray = new problem(strings);
		stringray.chooseAll(lwc);
		assertArrayEquals(choosen,stringray.toArray());
	}
}

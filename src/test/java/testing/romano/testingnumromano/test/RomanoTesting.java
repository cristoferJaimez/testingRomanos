package testing.romano.testingnumromano.test;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 *
 * @author cristo
 */
@RunWith(JUnitPlatform.class)
public class RomanoTesting {

    private NumRomano numRomano = new NumRomano();

    @BeforeEach
    void init() {
        this.numRomano = new NumRomano();
    }

    //prueba local stream
//    static Stream<Arguments> getRomano() {
//        return Stream.of(
//                Arguments.of(1, "I"),
//                Arguments.of(2, "II"),
//                Arguments.of(3, "III")
//        );
//    }
//    
    
    
  
    
//    @MethodSource("getRomano")        

    @ParameterizedTest
    @CsvFileSource(resources = "/numeros.csv", numLinesToSkip = 1)
    void testNumerosRomanos(int numeroNatural, String numeroRomano) {

        //paso 1 void init lo esta haciendo ya :)
        //paso 2
        String resRomano = this.numRomano.obtenerRomano(numeroNatural);

        //paso 3
        assertNotNull(resRomano);
        assertEquals(numeroRomano, resRomano);
    }

}

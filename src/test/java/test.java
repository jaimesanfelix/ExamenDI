import com.di.examen.modelos.*;
import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    Usuario usuario1 = new Usuario("DNI1", null);
    Usuario usuario2 = new Usuario("DNI2", LocalDate.now().plusDays(5));

    List<Usuario> usuarios = new ArrayList<>();

    Libro libro1 = new Libro(1, "titulo1", "isbn1");
    Libro libro2 = new Libro(2, "titulo2", "isbn2", "autor1", Tematica.CIENTIFICO, LocalDate.of(2003, 04, 20));
    Libro libroIdRepetido = new Libro(1, "idRepetido", "isbn");
    Libro libroIsbnRepetido = new Libro(3, "isbnRepetido", "isbn1");

    List<Libro> libros = new ArrayList<>();

    Prestamo prestamo1 = new Prestamo(libro1.getId(), usuario1.getDni());
    Prestamo prestamo2 = new Prestamo(libro2.getId(), usuario2.getDni());

    List<Prestamo> prestamos = new ArrayList<>();


    static Stream<Arguments> testPrestar(){
        return Stream.of(
                Arguments.of(1, "DNI1"),
                Arguments.of(2,"DNI2"),
                Arguments(3,"");
        )
    }

    @ParameterizedTest
    @MethodSource("testPrestar")
    void testPrestar(int id, String dni){
        Prestamo prestamo = new Prestamo(id, dni);
        assertEquals(prestamo);
    }


}

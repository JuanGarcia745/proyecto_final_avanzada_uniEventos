package co.edu.uniquindio.unieventos.test;

import co.edu.uniquindio.unieventos.dto.DTOCrearCuenta;
import co.edu.uniquindio.unieventos.modelo.documentos.Cuenta;
import co.edu.uniquindio.unieventos.modelo.enums.EstadoCuenta;
import co.edu.uniquindio.unieventos.modelo.enums.RolUsuario;
import co.edu.uniquindio.unieventos.modelo.vo.Usuario;
import co.edu.uniquindio.unieventos.servicios.interfases.CuentaServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;


@SpringBootTest
public class CuentaServicioTest {

    @Autowired
    private CuentaServicio cuentaServicio;

    @Test
    public void crearCuentaTest() throws Exception{
        DTOCrearCuenta dto = new DTOCrearCuenta("1234567890", "John Doe", List.of("3111111111"), "123 Calle Falsa", "johndoe@example.com", "password123", RolUsuario.CLIENTE);
        // Llamada al método que se está probando
        String idUsuario = cuentaServicio.crearCuenta(dto);

        // Verificación
        assertNotNull(idUsuario);;
    }

}

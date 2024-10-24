package co.edu.uniquindio.unieventos.dto;

import co.edu.uniquindio.unieventos.modelo.vo.ItemCarritoVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record TransaccionDto(

        @NotEmpty(message = "La lista de productos no puede estar vacía")
        List<@Valid ItemCarritoVO> productos,

        @NotBlank(message = "El ID del cliente no puede estar en blanco")
        String idCliente,

        @NotBlank(message = "El ID de pago no puede estar en blanco")
        String idPago
) {
}

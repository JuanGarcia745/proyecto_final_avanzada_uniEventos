package co.edu.uniquindio.unieventos.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record OrdenInfoDTO(

        @NotNull(message = "La transacción no puede ser nula")
        @Valid TransaccionDto transaccion,

        @NotNull(message = "El pago no puede ser nulo")
        @Valid PagoDTO pago
) {
}
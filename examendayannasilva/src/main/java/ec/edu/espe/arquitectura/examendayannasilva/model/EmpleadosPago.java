package ec.edu.espe.arquitectura.examendayannasilva.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
public class EmpleadosPago {
    private String numeroCuenta;
    private String valor;
    private String estado;
}

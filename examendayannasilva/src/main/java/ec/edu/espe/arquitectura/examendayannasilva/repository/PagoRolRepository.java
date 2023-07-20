package ec.edu.espe.arquitectura.examendayannasilva.repository;

import ec.edu.espe.arquitectura.examendayannasilva.model.PagoRol;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PagoRolRepository extends MongoRepository <PagoRol, String> {
    PagoRol findPagoRolByRucEmpresa(String rucEmpresa);
    List<PagoRol> findPagoRolByMes(String mes);

}

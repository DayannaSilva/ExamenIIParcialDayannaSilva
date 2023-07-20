package ec.edu.espe.arquitectura.examendayannasilva.repository;

import ec.edu.espe.arquitectura.examendayannasilva.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmpresaRepository  extends MongoRepository<Empresa, String> {
    Empresa findEmpresaByRuc(String ruc);
    @Override
    List<Empresa> findAll();;

}

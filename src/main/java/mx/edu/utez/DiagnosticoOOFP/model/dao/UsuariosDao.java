package mx.edu.utez.DiagnosticoOOFP.model.dao;

import mx.edu.utez.DiagnosticoOOFP.model.entity.UsuarioBean;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosDao extends CrudRepository <UsuarioBean, Integer>  {
}

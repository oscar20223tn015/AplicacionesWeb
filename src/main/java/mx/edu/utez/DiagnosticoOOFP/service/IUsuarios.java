package mx.edu.utez.DiagnosticoOOFP.service;

import mx.edu.utez.DiagnosticoOOFP.model.dto.UsuariosDto;
import mx.edu.utez.DiagnosticoOOFP.model.entity.UsuarioBean;

import java.util.List;

public interface IUsuarios {
UsuarioBean save(UsuariosDto usuariosDto);
UsuarioBean findById(Integer id);
void delete(UsuarioBean usuarioBean);

List<UsuarioBean> findAll();
}

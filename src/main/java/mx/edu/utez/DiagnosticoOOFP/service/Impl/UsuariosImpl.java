package mx.edu.utez.DiagnosticoOOFP.service.Impl;

import lombok.AllArgsConstructor;
import mx.edu.utez.DiagnosticoOOFP.model.dao.UsuariosDao;
import mx.edu.utez.DiagnosticoOOFP.model.dto.UsuariosDto;
import mx.edu.utez.DiagnosticoOOFP.model.entity.UsuarioBean;
import mx.edu.utez.DiagnosticoOOFP.service.IUsuarios;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuariosImpl implements IUsuarios {
    private final UsuariosDao usuariosDao;
@Override
    @Transactional
    public UsuarioBean save(UsuariosDto usuariosDto){
     UsuarioBean usuarios = UsuarioBean.builder()
             .id(usuariosDto.getId())
             .nombre(usuariosDto.getNombre())
             .apellidos(usuariosDto.getApellidos())
             .curp(usuariosDto.getCurp())
             .fechanacimiento(usuariosDto.getFechanacimiento())
             .build();
             return usuariosDao.save(usuarios);
}
@Override
@Transactional(readOnly = true)
    public UsuarioBean findById(Integer id){return usuariosDao.findById(id).orElse(null);}

@Override
@Transactional(readOnly = true)
    public List<UsuarioBean> findAll(){return (List<UsuarioBean>) usuariosDao.findAll();}

@Override
@Transactional
public void delete (UsuarioBean usuario){usuariosDao.delete(usuario);}


}

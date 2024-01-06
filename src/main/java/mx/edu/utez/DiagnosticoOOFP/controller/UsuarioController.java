package mx.edu.utez.DiagnosticoOOFP.controller;

import lombok.AllArgsConstructor;
import mx.edu.utez.DiagnosticoOOFP.model.dto.UsuariosDto;
import mx.edu.utez.DiagnosticoOOFP.model.entity.UsuarioBean;
import mx.edu.utez.DiagnosticoOOFP.service.Impl.UsuariosImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuariosImpl usuarioService;

    @GetMapping("/")
    public List<UsuarioBean> findAll(){return usuarioService.findAll();}

    @GetMapping("/{id}")
    public UsuarioBean showById(@PathVariable Integer id){return  usuarioService.findById(id);}

    @PostMapping("/")
public UsuariosDto create(@RequestBody UsuariosDto usuariosDto){
UsuarioBean usuariosave= usuarioService.save(usuariosDto);
return usuariosDto.builder()
        .id(usuariosave.getId())
        .nombre(usuariosave.getNombre())
        .apellidos(usuariosave.getApellidos())
        .curp(usuariosave.getCurp())
        .fechanacimiento(usuariosave.getFechanacimiento())
        .build();
    }
@PutMapping("/")
public UsuariosDto update(@RequestBody UsuariosDto usuariosDto){
    UsuarioBean usuarioupdate= usuarioService.save(usuariosDto);
    return usuariosDto.builder()
            .id(usuarioupdate.getId())
            .nombre(usuarioupdate.getNombre())
            .apellidos(usuarioupdate.getApellidos())
            .curp(usuarioupdate.getCurp())
            .fechanacimiento(usuarioupdate.getFechanacimiento())
            .build();
}
@DeleteMapping("/{id}")
public void delete(@PathVariable Integer id){
UsuarioBean usuariodelete= usuarioService.findById(id);
usuarioService.delete(usuariodelete);
}
}

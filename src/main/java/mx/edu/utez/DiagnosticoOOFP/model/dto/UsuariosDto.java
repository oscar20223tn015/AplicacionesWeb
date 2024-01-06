package mx.edu.utez.DiagnosticoOOFP.model.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class UsuariosDto {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String curp;
    private String fechanacimiento;
}

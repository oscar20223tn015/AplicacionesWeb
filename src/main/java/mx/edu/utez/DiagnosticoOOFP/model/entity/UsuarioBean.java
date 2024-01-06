package mx.edu.utez.DiagnosticoOOFP.model.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "usuarios")
public class UsuarioBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos ")
    private String apellidos;
    @Column(name = "curp",  nullable = false)
    private String curp;
    @Column(name = "fechanacimiento", nullable = false)
    private String fechanacimiento;

}

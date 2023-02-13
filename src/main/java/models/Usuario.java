package models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;

    @Id
    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Id
    @Getter @Setter @Column(name = "apellidos")
    private String apellidos;

    @Id
    @Getter @Setter @Column(name = "email")
    private String email;

    @Id
    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Id
    @Getter @Setter @Column(name = "password")
    private String password;


}

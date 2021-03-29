package br.com.smiles.destinos.integration.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DestinoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private String idDestino;
    @NotNull
    private String logradouro;
    @NotNull
    private int numero;
    @NotNull
    private String bairro;
    @NotNull
    private String cidade;
    @NotNull
    private String estado;
    @NotNull
    private String pais;
    @NotNull
    private String cep;
    @NotNull
    private char principal;
    @NotNull
    private int rating;
    @NotNull
    private String nome;
    @NotNull
    private String latitude;
    @NotNull
    private String longitude;

}

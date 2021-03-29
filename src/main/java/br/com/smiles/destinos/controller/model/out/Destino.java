package br.com.smiles.destinos.controller.model.out;

import br.com.smiles.destinos.controller.model.Endereco;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Destino {
    @JsonProperty(value = "idDestino")
    private String idDestino;
    @JsonProperty(value = "rating")
    private int rating;
    @JsonProperty(value = "nome")
    private String nome;
    @JsonProperty(value = "endereco")
    private Endereco endereco;
}

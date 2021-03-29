package br.com.smiles.destinos.controller;

import br.com.smiles.destinos.controller.model.out.Destino;
import br.com.smiles.destinos.integration.entity.DestinoEntity;
import br.com.smiles.destinos.integration.repository.DestinoRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/destino")
public class DestinoController {

    @Autowired
    private DestinoRepoitory destinoRepoitory;

    @CrossOrigin(origins = "*")
    @GetMapping("/{idDestino}")
    private ResponseEntity<?> consultaDestino(@PathVariable String idDestino){

        if (destinoRepoitory.existsByIdDestino(idDestino)) {
            DestinoEntity destinoEntity = destinoRepoitory.findByIdDestino(idDestino);
            return ResponseEntity.ok().body(Destino.builder().build());
        }else {

            return ResponseEntity.status(404).body("Destino não encontrado!");
        }
    }
    @CrossOrigin(origins = "*")
    @PostMapping
    private ResponseEntity<?> cadastraDestino(@RequestBody Destino destino){
        if(destinoRepoitory.existsByIdDestino(destino.getIdDestino())) {
            destinoRepoitory.save(DestinoEntity.builder()
                    .idDestino(destino.getIdDestino())
                    .nome(destino.getNome())
                    .rating(destino.getRating())
                    .logradouro(destino.getEndereco().getLogradouro())
                    .numero(destino.getEndereco().getNumero())
                    .bairro(destino.getEndereco().getBairro())
                    .cidade(destino.getEndereco().getCidade())
                    .estado(destino.getEndereco().getEstado())
                    .pais(destino.getEndereco().getPais())
                    .cep(destino.getEndereco().getCep())
                    .latitude(destino.getEndereco().getLatitude())
                    .longitude(destino.getEndereco().getLongitude())
                    .principal(destino.getEndereco().getPrincipal())
                    .build());
        }
        return ResponseEntity.ok(destino);
    }
    @CrossOrigin(origins = "*")
    @PatchMapping
    private ResponseEntity<?> alteraDestino(){
        return ResponseEntity.ok("");
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping
    private ResponseEntity<?> excluiDestino(){
        return ResponseEntity.ok("");
    }
}

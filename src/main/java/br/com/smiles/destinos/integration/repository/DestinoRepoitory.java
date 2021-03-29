package br.com.smiles.destinos.integration.repository;

import br.com.smiles.destinos.integration.entity.DestinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoRepoitory extends JpaRepository<DestinoEntity, String> {
    DestinoEntity findByIdDestino(String idDestino);
    boolean existsByIdDestino(String idDestino);
    DestinoEntity deleteByIdDestino(String idDestino);

}
package br.edu.usj.ads.lpii.clientecrud;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContatoRepository extends CrudRepository<Contato, Long> {
    List<Contato> findAll();
}

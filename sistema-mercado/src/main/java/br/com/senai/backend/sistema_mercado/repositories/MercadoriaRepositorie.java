package br.com.senai.backend.sistema_mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.backend.sistema_mercado.models.Mercadoria;

@Repository
public interface  MercadoriaRepositorie extends JpaRepository<Mercadoria, Integer> {
    
}

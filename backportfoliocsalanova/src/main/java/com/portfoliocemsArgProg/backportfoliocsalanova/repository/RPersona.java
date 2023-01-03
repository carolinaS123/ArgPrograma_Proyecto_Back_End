package com.portfoliocemsArgProg.backportfoliocsalanova.repository;

import com.portfoliocemsArgProg.backportfoliocsalanova.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long>{
     public List<Persona> findByEmailAndPassword(String email, String password);
}

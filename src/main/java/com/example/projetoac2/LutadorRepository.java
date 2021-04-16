package com.example.projetoac2;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetoac2.Lutador;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer>
{

}

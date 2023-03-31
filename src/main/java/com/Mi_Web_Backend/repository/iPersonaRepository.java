package com.Mi_Web_Backend.repository;

import com.Mi_Web_Backend.Entitys.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface iPersonaRepository extends JpaRepository<Persona,Integer>{
    //JpaRepository tiene todas los metodos necesarios para hacer CRUD en la bbdd
}
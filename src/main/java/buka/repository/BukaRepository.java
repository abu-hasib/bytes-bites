package buka.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import buka.model.ServiceProvider;

public interface BukaRepository extends JpaRepository<ServiceProvider, Long>  {

}

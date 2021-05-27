package buka;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ServiceProvider;

interface BukaRepository extends JpaRepository<ServiceProvider, Long>  {

}

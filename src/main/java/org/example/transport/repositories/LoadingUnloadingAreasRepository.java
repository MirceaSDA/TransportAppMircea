package org.example.transport.repositories;

import org.example.transport.entities.LoadingUnloadingAreas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadingUnloadingAreasRepository extends JpaRepository<LoadingUnloadingAreas, Integer> {

}

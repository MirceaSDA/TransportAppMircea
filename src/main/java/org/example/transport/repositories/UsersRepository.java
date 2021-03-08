package org.example.transport.repositories;

import org.example.transport.entities.UserDetails;
import org.example.transport.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}

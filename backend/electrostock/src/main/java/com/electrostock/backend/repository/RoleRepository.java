package com.electrostock.backend.repository;


import com.electrostock.backend.entity.Role;
import com.electrostock.backend.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);
}


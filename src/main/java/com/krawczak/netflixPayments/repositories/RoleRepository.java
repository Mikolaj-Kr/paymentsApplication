package com.krawczak.netflixPayments.repositories;

import com.krawczak.netflixPayments.domain.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Authorities, Integer> {
}

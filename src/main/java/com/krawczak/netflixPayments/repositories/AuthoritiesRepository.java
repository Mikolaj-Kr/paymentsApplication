package com.krawczak.netflixPayments.repositories;

import com.krawczak.netflixPayments.domain.entity.Authorities;
import com.krawczak.netflixPayments.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Integer> {

    Authorities findAuthoritiesByUsers(Users users);
}

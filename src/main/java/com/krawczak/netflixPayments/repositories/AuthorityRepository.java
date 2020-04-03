package com.krawczak.netflixPayments.repositories;

import com.krawczak.netflixPayments.domain.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {


}

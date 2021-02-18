package com.example.sweeBoot.cookie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CookieRepository extends JpaRepository<Cookie, Long> {

    @Query("SELECT s FROM Cookie s WHERE s.name = ?1")
    Optional<Cookie> findCookieByName(String name);
}

package com.csc340.crud_api;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
    List<Character> findByNameContainingIgnoreCase(String name);
    List<Character> findByUniverseContainingIgnoreCase(String universe);
    List<Character> findByPowerContainingIgnoreCase(String power);
    List<Character> findBySpeciesContainingIgnoreCase(String species);
    List<Character> findByRoleContainingIgnoreCase(String role);
}

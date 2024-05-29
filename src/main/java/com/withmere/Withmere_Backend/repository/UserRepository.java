package com.withmere.Withmere_Backend.repository;

import com.withmere.Withmere_Backend.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

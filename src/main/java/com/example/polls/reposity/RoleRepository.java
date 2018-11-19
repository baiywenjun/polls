package com.example.polls.reposity;

import com.example.polls.model.Role;
import com.example.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Title: todoedit
 * Description: polls
 * author: wenjun
 * date: 2018/11/19 23:41
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(RoleName RoleName);
}

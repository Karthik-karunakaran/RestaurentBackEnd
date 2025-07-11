package com.project.RestaurentBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.RestaurentBackend.AdminTable.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}

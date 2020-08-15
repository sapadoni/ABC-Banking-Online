package com.example.RESTDb;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPayeeRepository extends JpaRepository<Account, String> {
}
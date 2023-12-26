package com.products.MobileApplication.repository;

import com.products.MobileApplication.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Long> {
}

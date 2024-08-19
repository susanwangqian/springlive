package net.nvsoftware.springmono.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.nvsoftware.springmono.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}

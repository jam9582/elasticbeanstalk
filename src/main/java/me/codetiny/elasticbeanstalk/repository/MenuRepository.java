package me.codetiny.elasticbeanstalk.repository;

import me.codetiny.elasticbeanstalk.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    // Custom query methods can be defined here if needed
    // For example, to find menus by category code:
    // List<Menu> findByCategoryCode(int categoryCode);

    // Or to find menus by orderable status:
    // List<Menu> findByOrderableStatus(String orderableStatus);
}

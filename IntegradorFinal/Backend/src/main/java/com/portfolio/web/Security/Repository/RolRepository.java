
package com.portfolio.web.Security.Repository;

import com.portfolio.web.Security.Entity.Rol;
import com.portfolio.web.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Dante Aybar
 */

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional <Rol> findByRolNombre(RolNombre rolNombre); 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import model.Montadora;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luciano Velho
 */
public interface RepositorioMontadora  extends JpaRepository<Montadora, Long>{
    
}
package com.davidferreirajunior.IGTI.repositor;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidferreirajunior.IGTI.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	public Optional<Cliente> findByCpf(String cpf);
	
}
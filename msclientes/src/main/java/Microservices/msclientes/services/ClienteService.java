package Microservices.msclientes.services;

import Microservices.msclientes.domain.Cliente;
import Microservices.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository repository;

    @Transactional
    @PostMapping
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

   public Optional<Cliente> getByCPF(String cpf) {
    return repository.findByCpf(cpf);
   }
}

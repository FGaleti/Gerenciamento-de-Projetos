package services;

import model.Projeto;
import org.springframework.stereotype.Service;
import repositories.ProjetoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    public Projeto criar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }

    public Optional<Projeto> buscarPorId(Long id) {
        return projetoRepository.findById(id);
    }

    public boolean deletarPorId(Long id) {
        if (!projetoRepository.existsById(id)) {
            return false;
        }
        projetoRepository.deleteById(id);
        return true;
    }
}
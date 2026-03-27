package br.com.fiap.locatech.service;

import br.com.fiap.locatech.entities.Pessoa;
import br.com.fiap.locatech.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> findAllPessoas(int page, int size) {
        int offset = (page - 1) * size;
        return pessoaRepository.findAll(size, offset);
    }

    public Optional<Pessoa> findPessoaById(Long id) {
        return pessoaRepository.findById(id);
    }

    public void savePessoa(Pessoa pesssoa) {
        var save = pessoaRepository.save(pesssoa);
        Assert.state(save == 1, "Erro ao salvar pesssoa" + pesssoa.getNome());
    }

    public void updatePessoa(Pessoa pesssoa, Long id) {
        var update = pessoaRepository.update(pesssoa, id);
        if (update == 0) {
            throw new RuntimeException("Pessoa não encontrado");
        }
    }


    public void deletePessoaById(Long id) {
        var delete = pessoaRepository.delete(id);
        if (delete == 0) {
            throw new RuntimeException("Pessoa não encontrado");
        }
    }
}

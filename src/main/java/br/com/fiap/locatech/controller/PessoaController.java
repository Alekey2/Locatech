package br.com.fiap.locatech.controller;

import br.com.fiap.locatech.entities.Pessoa;
import br.com.fiap.locatech.service.PessoaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private static final Logger logger = LoggerFactory.getLogger(PessoaController.class);
    private final PessoaService pessoaService;


    public PessoaController(PessoaService pessoaService) {

        this.pessoaService = pessoaService;
    }


    @GetMapping
    public ResponseEntity<List<Pessoa>> findAllPessoa(@RequestParam("page") int page, @RequestParam("size") int size) {
        logger.info("Foi acessado o endpoint de /pessoas");
        var pessoa = pessoaService.findAllPessoas(page, size);

        return ResponseEntity.ok(pessoa);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Pessoa>> findByIdPessoa(@PathVariable Long id) {
        logger.info("/pessoas/" + id);
        var pessoa = pessoaService.findPessoaById(id);
        return ResponseEntity.ok(pessoa);
    }

    @PostMapping()
    public ResponseEntity<Void> savePessoa(@RequestBody Pessoa pessoa) {
        logger.info("Cadastrando pessoa");
        this.pessoaService.savePessoa(pessoa);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePessoa(@RequestBody Pessoa pessoa, @PathVariable("id") Long id) {
        logger.info("Atualizando pessoa");
        this.pessoaService.updatePessoa(pessoa, id);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable("id") Long id) {
        logger.info("Deletando pessoa");
        this.pessoaService.deletePessoaById(id);
        return ResponseEntity.ok().build();
    }
}

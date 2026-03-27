package br.com.fiap.locatech.controller;

import br.com.fiap.locatech.entities.Aluguel;
import br.com.fiap.locatech.service.AluguelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alugueis")
public class AluguelController {

    private static final Logger logger = LoggerFactory.getLogger(AluguelController.class);
    private final AluguelService aluguelService;


    public AluguelController(AluguelService aluguelService) {

        this.aluguelService = aluguelService;
    }


    @GetMapping
    public ResponseEntity<List<Aluguel>> findAllAlugueis(@RequestParam("page") int page, @RequestParam("size") int size) {
        logger.info("Foi acessado o endpoint de /Algueis");
        var aluguel = aluguelService.findAllAlugueis(page, size);

        return ResponseEntity.ok(aluguel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Aluguel>> findByIdAluguel(@PathVariable Long id) {
        logger.info("/aluguel/" + id);
        var aluguel = aluguelService.findAluguelById(id);
        return ResponseEntity.ok(aluguel);
    }

    @PostMapping()
    public ResponseEntity<Void> saveAluguel(@RequestBody Aluguel aluguel) {
        logger.info("Cadastrando aluguel");
        this.aluguelService.saveAluguel(aluguel);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateAluguel(@RequestBody Aluguel aluguel, @PathVariable("id") Long id) {
        logger.info("Atualizando aluguel");
        this.aluguelService.updateAluguel(aluguel, id);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluguel(@PathVariable("id") Long id) {
        logger.info("Deletando aluguel");
        this.aluguelService.deleteAluguelById(id);
        return ResponseEntity.ok().build();
    }
}

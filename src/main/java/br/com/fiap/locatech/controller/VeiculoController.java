package br.com.fiap.locatech.controller;

import br.com.fiap.locatech.entities.Veiculo;
import br.com.fiap.locatech.service.VeiculoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private static final Logger logger = LoggerFactory.getLogger(VeiculoController.class);
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {

        this.veiculoService = veiculoService;
    }


    @GetMapping
    public ResponseEntity<List<Veiculo>> findAllVeiculos(@RequestParam("page") int page, @RequestParam("size") int size) {
        logger.info("Foi acessado o endpoint de /veiculos");
        var veiculo = veiculoService.findAllVeiculos(page, size);

        return ResponseEntity.ok(veiculo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Veiculo>> findByIdVeiculo(@PathVariable Long id) {
        logger.info("/veiculos/" + id);
        var veiculo = veiculoService.findVeiculoById(id);
        return ResponseEntity.ok(veiculo);
    }

    @PostMapping()
    public ResponseEntity<Void> saveVeiculo(@RequestBody Veiculo veiculo) {
        logger.info("Cadastrando veiculo");
        this.veiculoService.saveVeiculo(veiculo);

        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateVeiculo(@RequestBody Veiculo veiculo, @PathVariable("id") Long id) {
        logger.info("Atualizando veiculo");
        this.veiculoService.updateVeiculo(veiculo, id);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable("id") Long id) {
        logger.info("Deletando veiculo");
        this.veiculoService.deleteVeiculoById(id);
        return ResponseEntity.ok().build();
    }


}

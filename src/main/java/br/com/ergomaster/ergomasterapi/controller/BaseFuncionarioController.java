package br.com.ergomaster.ergomasterapi.controller;

import br.com.ergomaster.ergomasterapi.domain.basefuncionario.BaseFuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/basefuncionario")
public class BaseFuncionarioController {
    @Autowired
    private BaseFuncionarioService service;

    @PostMapping("/importar")
    public ResponseEntity<String> importarExcel(@RequestParam("file") MultipartFile file) {
        try {
            service.importarExcel(file);
            return ResponseEntity.ok("Importação realizada com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro na importação: " + e.getMessage());
        }
    }
}

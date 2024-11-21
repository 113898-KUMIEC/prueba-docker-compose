package ar.edu.utn.frc.tup.lciv.controllers;

import ar.edu.utn.frc.tup.lciv.common.ErrorApi;
import ar.edu.utn.frc.tup.lciv.entities.Prueba;
import ar.edu.utn.frc.tup.lciv.service.PruebaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PingController {

    @Autowired
    private PruebaService pruebaService;

    @Operation(
            summary = "Check healthy of the app",
            description = "If the app it's alive response pong")
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(
                            schema = @Schema(implementation = String.class)
                    )
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorApi.class))
            )
    })
    @GetMapping("/ping")
    public String pong() {
        return "pong";
    }

    @PostMapping()
    public ResponseEntity<Prueba> savePrueba(String descripcion){
        return ResponseEntity.ok(pruebaService.savePrueba(descripcion));
    }
    @GetMapping("/prueba")
    public ResponseEntity<List<Prueba>> getAllPrueba(){
        return ResponseEntity.ok(pruebaService.getAllPrueba());
    }
}

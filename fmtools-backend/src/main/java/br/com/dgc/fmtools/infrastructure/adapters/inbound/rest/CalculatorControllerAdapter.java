package br.com.dgc.fmtools.infrastructure.adapters.inbound.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dgc.fmtools.application.ports.inbound.CalculatorControllerPort;
import br.com.dgc.fmtools.application.services.CalculatorService;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.CalculateBestFormationRequestDto;
import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.response.CalculateBestFormationResponseDto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/calculator")
public class CalculatorControllerAdapter implements CalculatorControllerPort {

    private final CalculatorService calculatorService;

    public CalculatorControllerAdapter(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/bestFormation")
    public ResponseEntity<?> calculateBestFormation(
            @RequestBody @Valid CalculateBestFormationRequestDto calculateBestFormationRequestDto) {
        CalculateBestFormationResponseDto calculateBestFormationResponseDto = this.calculatorService
                .calculateBestFormation(calculateBestFormationRequestDto);
        if (calculateBestFormationResponseDto == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(calculateBestFormationResponseDto);
    }
}

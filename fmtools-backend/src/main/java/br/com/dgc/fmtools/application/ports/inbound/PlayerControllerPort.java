package br.com.dgc.fmtools.application.ports.inbound;

import java.io.IOException;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import br.com.dgc.fmtools.infrastructure.adapters.inbound.rest.dtos.request.PlayerRequestDto;

public interface PlayerControllerPort {

        public ResponseEntity<?> createPlayerFromText(@RequestParam MultipartFile playerData, @RequestParam String name,
                        @RequestParam UUID squadId) throws IOException;

        public ResponseEntity<?> createPlayerFromHtml(@RequestParam MultipartFile playerData, @RequestParam String name,
                        @RequestParam UUID squadId) throws IOException;

        public ResponseEntity<?> createPlayer(@RequestBody PlayerRequestDto playerRequestDto)
                        throws JsonMappingException, JsonProcessingException;
}

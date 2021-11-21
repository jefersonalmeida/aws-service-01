package br.com.jefersonalmeida.aws_service_01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/test")
public class TestController {
    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("uuid")
    public ResponseEntity<?> randomUUIDTest() {
        String uuid = UUID.randomUUID().toString();
        LOG.info("TestController - randomUUIDTest: {}", uuid);
        return ResponseEntity.ok("UUID: " + uuid);
    }

    @GetMapping("dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("TestController - dogTest: {}", name);
        return ResponseEntity.ok("Name: " + name);
    }
}

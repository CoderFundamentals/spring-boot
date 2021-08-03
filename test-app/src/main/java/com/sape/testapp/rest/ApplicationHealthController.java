package com.sape.testapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationHealthController {

  @Autowired
  public ApplicationHealthController(){

  }

  @GetMapping(path = "/health")
  public ResponseEntity<String> getStatus(){
    return ResponseEntity.ok(new String("OK"));
  }
}

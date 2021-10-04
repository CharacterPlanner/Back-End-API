package web.support.controllers;

import web.support.models.SupportInfo;
import web.support.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/support")
public class SupportController {
    @Autowired
    SupportService supportService;

    @GetMapping(value = "/all")
    public ResponseEntity<SupportInfo> getSupportInfo() {
        SupportInfo supportInfo = supportService.getSupportInfo();
        return new ResponseEntity<>(supportInfo, HttpStatus.OK);
    }
}

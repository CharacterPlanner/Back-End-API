package web.support.controllers;

import web.support.models.SupportInfo;
import web.support.services.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/support")
public class SupportController {
    @Autowired
    SupportService supportService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<SupportInfo>> getSupportInfo() {
        List<SupportInfo> supportInfo = supportService.getSupport();
        return new ResponseEntity<>(supportInfo, HttpStatus.OK);
    }
}

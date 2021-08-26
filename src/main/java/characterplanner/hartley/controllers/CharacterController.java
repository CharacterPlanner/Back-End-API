package characterplanner.hartley.controllers;

import characterplanner.hartley.models.CharacterInfo;
import characterplanner.hartley.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/character")
public class CharacterController {
    @Autowired
    private CharacterService characterService;

    @GetMapping(produces = "application/json")
    public ResponseEntity<CharacterInfo> getCharacter(@RequestParam(value = "name", required = true)String name) {
        CharacterInfo characterInfo = characterService.getCharacterByCharacterName(name);
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(characterInfo, status);
    }
}

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
    CharacterService characterService;

    @GetMapping(value = "/{characterName}")
    public ResponseEntity<CharacterInfo> getCharacter(@PathVariable("characterName")String name) {
        CharacterInfo characterInfo = characterService.getCharacterByCharacterName(name);
        return new ResponseEntity<>(characterInfo, HttpStatus.OK);
    }
}

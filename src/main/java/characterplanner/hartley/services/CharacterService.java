package characterplanner.hartley.services;

import characterplanner.hartley.models.CharacterInfo;
import characterplanner.hartley.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public CharacterInfo getCharacterByName(String name) { return characterRepository.getCharacterByName(name); }

    public CharacterInfo createNewCharacter(CharacterInfo character) { return characterRepository.save(character); }
}

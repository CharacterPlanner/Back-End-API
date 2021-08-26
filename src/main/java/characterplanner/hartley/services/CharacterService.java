package characterplanner.hartley.services;

import characterplanner.hartley.models.CharacterInfo;
import characterplanner.hartley.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;

    public CharacterInfo getCharacterByCharacterName(String name) { return characterRepository.getCharacterByCharacterName(name); }

    public CharacterInfo createNewCharacter(CharacterInfo character) { return characterRepository.save(character); }
}

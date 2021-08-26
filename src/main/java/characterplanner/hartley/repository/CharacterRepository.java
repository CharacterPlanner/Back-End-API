package characterplanner.hartley.repository;

import characterplanner.hartley.models.CharacterInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterInfo, Integer> {
    CharacterInfo getCharacterByCharacterName(String name);
}

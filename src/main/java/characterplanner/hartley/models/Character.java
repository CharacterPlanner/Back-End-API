package characterplanner.hartley.models;


import io.micrometer.core.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Component
@Entity
@Table(name = "character_info")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private int characterId;

    @Column(name = "name")
    private String characterName;

    @Column(name = "class")
    private String characterClass;

    @Column(name = "head_slot_id")
    private int headId;

    @Column(name = "shoulder_slot_id")
    private int shoulderId;

    @Column(name = "back_slot_id")
    private int backId;

    @Column(name = "chest_slot_id")
    private int chestId;

    @Column(name = "bracer_slot_id")
    private int bracerId;

    @Column(name = "glove_slot_id")
    private int gloveId;

    @Column(name = "belt_slot_id")
    private int beltId;

    @Column(name = "pants_slot_id")
    private int pantsId;

    @Column(name = "boots_slot_id")
    private int bootsId;

    @Column(name = "ringone_slot_id")
    private int ringOneId;

    @Column(name = "ringtwo_slot_id")
    private int ringTwoId;

    @Column(name = "trinketone_slot_id")
    private int trinketOneId;

    @Column(name = "trinkettwo_slot_id")
    private int trinketTwoId;

    @Column(name = "weapon_slot_id")
    private int weaponId;

    @Column(name = "offhand_slot_id")
    private int offhandId;

    @Column(name = "ranged_slot_id")
    private int rangedId;

    public Character(String characterName, String characterClass, @Nullable int headId, @Nullable int shoulderId,
                     @Nullable int backId, @Nullable int chestId, @Nullable int bracerId, @Nullable int gloveId,
                     @Nullable int beltId, @Nullable int pantsId, @Nullable int bootsId, @Nullable int ringOneId,
                     @Nullable int ringTwoId, @Nullable int weaponId, @Nullable int offhandId, @Nullable int rangedId) {
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.headId = headId;
        this.shoulderId = shoulderId;
        this.backId = backId;
        this.chestId = chestId;
        this.bracerId = bracerId;
        this.gloveId = gloveId;
        this.beltId = beltId;
        this.pantsId = pantsId;
        this.bootsId = bootsId;
        this.ringOneId = ringOneId;
        this.ringTwoId = ringTwoId;
        this.weaponId = weaponId;
        this.offhandId = offhandId;
        this.rangedId = rangedId;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getHeadId() {
        return headId;
    }

    public void setHeadId(int headId) {
        this.headId = headId;
    }

    public int getShoulderId() {
        return shoulderId;
    }

    public void setShoulderId(int shoulderId) {
        this.shoulderId = shoulderId;
    }

    public int getBackId() {
        return backId;
    }

    public void setBackId(int backId) {
        this.backId = backId;
    }

    public int getChestId() {
        return chestId;
    }

    public void setChestId(int chestId) {
        this.chestId = chestId;
    }

    public int getBracerId() {
        return bracerId;
    }

    public void setBracerId(int bracerId) {
        this.bracerId = bracerId;
    }

    public int getGloveId() {
        return gloveId;
    }

    public void setGloveId(int gloveId) {
        this.gloveId = gloveId;
    }

    public int getBeltId() {
        return beltId;
    }

    public void setBeltId(int beltId) {
        this.beltId = beltId;
    }

    public int getPantsId() {
        return pantsId;
    }

    public void setPantsId(int pantsId) {
        this.pantsId = pantsId;
    }

    public int getBootsId() {
        return bootsId;
    }

    public void setBootsId(int bootsId) {
        this.bootsId = bootsId;
    }

    public int getRingOneId() {
        return ringOneId;
    }

    public void setRingOneId(int ringOneId) {
        this.ringOneId = ringOneId;
    }

    public int getRingTwoId() {
        return ringTwoId;
    }

    public void setRingTwoId(int ringTwoId) {
        this.ringTwoId = ringTwoId;
    }

    public int getTrinketOneId() {
        return trinketOneId;
    }

    public void setTrinketOneId(int trinketOneId) {
        this.trinketOneId = trinketOneId;
    }

    public int getTrinketTwoId() {
        return trinketTwoId;
    }

    public void setTrinketTwoId(int trinketTwoId) {
        this.trinketTwoId = trinketTwoId;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public int getOffhandId() {
        return offhandId;
    }

    public void setOffhandId(int offhandId) {
        this.offhandId = offhandId;
    }

    public int getRangedId() {
        return rangedId;
    }

    public void setRangedId(int rangedId) {
        this.rangedId = rangedId;
    }

    @Override
    public String toString() {
        return "Character{" +
                "characterId=" + characterId +
                ", characterName='" + characterName + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", headId=" + headId +
                ", shoulderId=" + shoulderId +
                ", backId=" + backId +
                ", chestId=" + chestId +
                ", bracerId=" + bracerId +
                ", gloveId=" + gloveId +
                ", beltId=" + beltId +
                ", pantsId=" + pantsId +
                ", bootsId=" + bootsId +
                ", ringOneId=" + ringOneId +
                ", ringTwoId=" + ringTwoId +
                ", trinketOneId=" + trinketOneId +
                ", trinketTwoId=" + trinketTwoId +
                ", weaponId=" + weaponId +
                ", offhandId=" + offhandId +
                ", rangedId=" + rangedId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return characterId == character.characterId && headId == character.headId && shoulderId == character.shoulderId && backId == character.backId && chestId == character.chestId && bracerId == character.bracerId && gloveId == character.gloveId && beltId == character.beltId && pantsId == character.pantsId && bootsId == character.bootsId && ringOneId == character.ringOneId && ringTwoId == character.ringTwoId && trinketOneId == character.trinketOneId && trinketTwoId == character.trinketTwoId && weaponId == character.weaponId && offhandId == character.offhandId && rangedId == character.rangedId && Objects.equals(characterName, character.characterName) && Objects.equals(characterClass, character.characterClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, characterName, characterClass, headId, shoulderId, backId, chestId, bracerId, gloveId, beltId, pantsId, bootsId, ringOneId, ringTwoId, trinketOneId, trinketTwoId, weaponId, offhandId, rangedId);
    }
}

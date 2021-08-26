package characterplanner.hartley.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.micrometer.core.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Component
@Entity
@Table(name = "character_info")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class CharacterInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private int characterId;

    @Column(name = "character_name", unique = true)
    private String characterName;

    @Column(name = "character_class")
    private String characterClass;

    @Nullable
    @Column(name = "head_slot_id")
    private int headId;

    @Nullable
    @Column(name = "shoulder_slot_id")
    private int shoulderId;

    @Nullable
    @Column(name = "back_slot_id")
    private int backId;

    @Nullable
    @Column(name = "chest_slot_id")
    private int chestId;

    @Nullable
    @Column(name = "bracer_slot_id")
    private int bracerId;

    @Nullable
    @Column(name = "glove_slot_id")
    private int gloveId;

    @Nullable
    @Column(name = "belt_slot_id")
    private int beltId;

    @Nullable
    @Column(name = "pants_slot_id")
    private int pantsId;

    @Nullable
    @Column(name = "boots_slot_id")
    private int bootsId;

    @Nullable
    @Column(name = "ringone_slot_id")
    private int ringOneId;

    @Nullable
    @Column(name = "ringtwo_slot_id")
    private int ringTwoId;

    @Nullable
    @Column(name = "trinketone_slot_id")
    private int trinketOneId;

    @Nullable
    @Column(name = "trinkettwo_slot_id")
    private int trinketTwoId;

    @Nullable
    @Column(name = "weapon_slot_id")
    private int weaponId;

    @Nullable
    @Column(name = "offhand_slot_id")
    private int offhandId;

    @Nullable
    @Column(name = "ranged_slot_id")
    private int rangedId;

    public CharacterInfo() { super(); }

    public CharacterInfo(String characterName, String characterClass, int headId, int shoulderId,
                     int backId, int chestId, int bracerId, int gloveId,
                     int beltId, int pantsId, int bootsId, int ringOneId,
                     int ringTwoId, int weaponId, int offhandId, int rangedId) {
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
        CharacterInfo that = (CharacterInfo) o;
        return characterId == that.characterId && headId == that.headId && shoulderId == that.shoulderId && backId == that.backId && chestId == that.chestId && bracerId == that.bracerId && gloveId == that.gloveId && beltId == that.beltId && pantsId == that.pantsId && bootsId == that.bootsId && ringOneId == that.ringOneId && ringTwoId == that.ringTwoId && trinketOneId == that.trinketOneId && trinketTwoId == that.trinketTwoId && weaponId == that.weaponId && offhandId == that.offhandId && rangedId == that.rangedId && Objects.equals(characterName, that.characterName) && Objects.equals(characterClass, that.characterClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(characterId, characterName, characterClass, headId, shoulderId, backId, chestId, bracerId, gloveId, beltId, pantsId, bootsId, ringOneId, ringTwoId, trinketOneId, trinketTwoId, weaponId, offhandId, rangedId);
    }
}

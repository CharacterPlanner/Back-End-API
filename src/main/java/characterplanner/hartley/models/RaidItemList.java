package characterplanner.hartley.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.Objects;


@Component
@Entity
@Table(name = "item_list")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class RaidItemList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @NotNull
    @Column(name = "raid_id")
    private int raidId;

    @Column(name = "item_name")
    private String name;

    public RaidItemList() {super();}

    public RaidItemList(int itemId, int raidId, String name) {
        this.itemId = itemId;
        this.raidId = raidId;
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getRaidId() {
        return raidId;
    }

    public void setRaidId(int raidId) {
        this.raidId = raidId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaidItemList that = (RaidItemList) o;
        return itemId == that.itemId && raidId == that.raidId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, raidId, name);
    }

    @Override
    public String toString() {
        return "RaidItemList{" +
                "itemId=" + itemId +
                ", raidId=" + raidId +
                ", name='" + name + '\'' +
                '}';
    }
}

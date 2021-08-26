package characterplanner.hartley.models;


import org.springframework.stereotype.Component;
import javax.persistence.*;


@Component
@Entity
@Table(name = "item_list")
public class RaidItemList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "raid_id", nullable = false)
    private int raidId;

    @Column(name = "item_name")
    private String name;




}

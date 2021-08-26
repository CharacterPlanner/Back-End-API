package characterplanner.hartley.repository;

import characterplanner.hartley.models.RaidItemList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RaidItemListRepository extends JpaRepository<RaidItemList, Integer> {
    List<RaidItemList> getItemListByRaidId(int id);
    RaidItemList getItemByName(String name);
}

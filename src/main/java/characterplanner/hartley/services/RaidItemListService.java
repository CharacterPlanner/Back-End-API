package characterplanner.hartley.services;

import characterplanner.hartley.models.RaidItemList;
import characterplanner.hartley.repository.RaidItemListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaidItemListService {

    @Autowired
    private RaidItemListRepository raidItemListRepository;

    public List<RaidItemList> getItemListbyRaidId(int id) { return raidItemListRepository.getItemListByRaidId(id); }

    public RaidItemList getItemByName(String name) { return raidItemListRepository.getItemByName(name); }
}

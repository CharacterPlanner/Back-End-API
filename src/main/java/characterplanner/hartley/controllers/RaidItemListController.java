package characterplanner.hartley.controllers;

import characterplanner.hartley.services.RaidItemListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/item")
public class RaidItemListController {

    @Autowired
    private RaidItemListService raidItemListService;
}

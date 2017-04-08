package controller;

import entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AreaService;

import java.util.List;

/**
 * Created by eugen on 3/24/17.
 */
@RestController
@RequestMapping("/rest/area")
public class RestAreaController {

    @Autowired
    AreaService areaService;

    @GetMapping
    public List<Area> getAreas() {
        return areaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Area getArea(@PathVariable Integer id) {
        return areaService.findById(id);
    }

    @PostMapping
    public String insertArea(@RequestBody Area area) {
        areaService.save(area);
        return "Area inserted succesfully";
    }


}

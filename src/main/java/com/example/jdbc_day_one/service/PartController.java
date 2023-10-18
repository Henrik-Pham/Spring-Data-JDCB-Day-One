package com.example.jdbc_day_one.service;

import com.example.jdbc_day_one.PartService;
import com.example.jdbc_day_one.model.Part;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartController {

    private final PartService partService;

    @Autowired
    public PartController(PartService partService) {
        this.partService = partService;
    }

    @GetMapping("/parts")
    public List<Part> getParts(){
        return partService.getParts();
    }

    @GetMapping("/{id}")
    public Part getPartById(@PathVariable Integer id){
        return partService.getPartById(id);
    }

    @PostMapping
    public Part createPart(@RequestBody Part part){
        return partService.updatePart(part);
    }

    @DeleteMapping
    public Part deletePart(@RequestBody Part part){
        return partService.deletePart(part);
    }

    @PutMapping
    public Part updatePart(@RequestBody Part part){
        return partService.updatePart(part);
    }

}

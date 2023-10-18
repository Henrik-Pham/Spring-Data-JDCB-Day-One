package com.example.jdbc_day_one;

import com.example.jdbc_day_one.model.Part;
import com.example.jdbc_day_one.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    private final PartRepository partRepository;

    @Autowired
    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    public List<Part> getParts(){
        return partRepository.findAll();
    }

    public Part getPartById(Integer id) {
        return partRepository.findById(id).orElse(null);
    }

    public Part createPart(Part part) {
        return partRepository.save(part);
    }

    public Part deletePart(Part part){
        partRepository.delete(part);
        return part;
    }

    public Part updatePart(Part part){
        return partRepository.save(part);
    }
}

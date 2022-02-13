package com.teleclimb.rest.start;

import com.teleclimb.responses.error.exception.NotFoundException;
import com.teleclimb.rest.start.Start;
import com.teleclimb.rest.start.StartDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StartService {
    private final StartRepository startRepo;

    public List<StartDto> getAll() {
        return startRepo.findAll().stream().map(Start::toDto).collect(Collectors.toList());
    }

    public StartDto get(Long id) {
        return startRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Not found start with id: " + id)).toDto();
    }
}

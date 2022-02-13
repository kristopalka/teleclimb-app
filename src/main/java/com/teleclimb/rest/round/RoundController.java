package com.teleclimb.rest.round;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/round")
public class RoundController {
    private final RoundService service;

    @ApiOperation(value = "Get all rounds")
    @GetMapping("/all")
    public List<RoundDto> getAll() {
        return service.getAll();
    }

    @ApiOperation(value = "Get round specific by id")
    @GetMapping("/{id}")
    public RoundDto get(@PathVariable Long id) {
        return service.get(id);
    }


    //todo add endpoint - get all starts in this round
    //todo add endpoint - generate rounds   }
    //todo add endpoint - remove rounds     } czy na pewno tutaj? może w dodatkowym service i controller?
}

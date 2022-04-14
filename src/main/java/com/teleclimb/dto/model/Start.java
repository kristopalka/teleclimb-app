package com.teleclimb.dto.model;

import com.teleclimb.dto.enums.Discipline;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Start {
    private Integer id;

    private Integer refereePositionId;

    private Integer positionSequenceNumber;

    private Integer participantId;

    private String result;

    private Discipline discipline;
}
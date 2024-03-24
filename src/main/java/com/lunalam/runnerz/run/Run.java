package com.lunalam.runnerz.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

// Record type inherently contains getters, setters, toString(), etc.
public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive
        Integer miles,
        Location location
) {
    public Run {
        if (!completedOn.isAfter((startedOn))) {
            throw new IllegalArgumentException("Completed On must be after Started On");
        }
    }
}

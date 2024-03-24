package com.lunalam.runnerz.run;

import java.time.LocalDateTime;

// Record type inherently contains getters, setters, toString(), etc.
public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {}

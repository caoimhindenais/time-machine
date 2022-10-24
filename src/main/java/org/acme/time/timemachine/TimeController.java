package org.acme.time.timemachine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class TimeController {

    @GetMapping
    public Map<String, Instant> getTime() {

        final Instant now = Instant.now();
        Map<String, Instant> time = new HashMap<>();
        time.put("time", now);
        return time;

    }
}

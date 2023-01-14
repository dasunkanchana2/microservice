package com.dasun.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping(path = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String>> sampleObject(@RequestParam String format) {
        Map<String, String> outputMap = new HashMap<>();
        if (format.toLowerCase(Locale.ROOT).equals("short")) {
            outputMap.put("status", "OK");
            return new ResponseEntity<>(outputMap, HttpStatus.OK);
        } else if (format.toLowerCase(Locale.ROOT).equals("full")) {
            String isoFormatString = "yyyy-MM-dd'T'HH:mm:ss'Z'";
            DateFormat isoFormat = new SimpleDateFormat(isoFormatString);
            String currentDate = isoFormat.format(new Date());
            outputMap.put("status", "OK");
            outputMap.put("currentTime", currentDate);
            return new ResponseEntity<>(outputMap, HttpStatus.OK);
        } else {
            return new ResponseEntity<>((MultiValueMap<String, String>) null, HttpStatus.BAD_REQUEST);
        }
    }
}

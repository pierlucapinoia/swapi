package com.web.swapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Service
public class SwapiService {
    private static final Logger log = LoggerFactory.getLogger(SwapiService.class);
    private final RestTemplate restTemplate = new RestTemplate();
    private final ObjectMapper mapper = new ObjectMapper();

    public String getStringFromUri(String uri) {
        try {
            return restTemplate.getForObject(uri, String.class);
        } catch(HttpStatusCodeException e) {
            log.error(e.getMessage(), e);
            return String.valueOf(e.getStatusCode().value());

        }
    }

    public JsonNode getJsonFromString(String response) {
        try {
            return mapper.readTree(response);
        } catch(JsonProcessingException  e) {
            log.error(e.getMessage(), e);

        }
        return mapper.nullNode();
    }
}

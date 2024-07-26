package com.web.swapi.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.web.swapi.service.SwapiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swapi.dev/api/")
public class SwapiController {

    private static final String BASE_URI = "https://swapi.dev/api";
    private static final String FILMS = "/films";
    private static final String PEOPLE = "/people";
    private static final String PLANETS = "/planets";
    private static final String SPECIES = "/species";
    private static final String STARSHIPS = "/starships";
    private static final String VEHICLES = "/vehicles";

    private final SwapiService swapiService;

    public SwapiController(SwapiService swapiService) {
        this.swapiService = swapiService;
    }

    @GetMapping("/")
    public JsonNode getStartingEndpoint() {
        String response = swapiService.getStringFromUri(BASE_URI);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(FILMS)
    public JsonNode getFilms() {
        String response = swapiService.getStringFromUri(BASE_URI + FILMS);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(FILMS + "/{id}")
    public JsonNode getFilm(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + FILMS +  "/" + id);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(PEOPLE)
    public JsonNode getPeople() {
        String response =  swapiService.getStringFromUri(BASE_URI + PEOPLE);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(PEOPLE + "/{id}")
    public JsonNode getPerson(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + PEOPLE + "/" + id);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(PLANETS)
    public JsonNode getPlanets() {
        String response =  swapiService.getStringFromUri(BASE_URI + PLANETS);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(PLANETS + "/{id}")
    public JsonNode getPlanet(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + PLANETS + "/" + id);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(SPECIES)
    public JsonNode getSpecies() {
        String response =  swapiService.getStringFromUri(BASE_URI + SPECIES);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(SPECIES + "/{id}")
    public JsonNode getSpecie(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + SPECIES + "/" + id);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(STARSHIPS)
    public JsonNode getStarships() {
        String response =  swapiService.getStringFromUri(BASE_URI + STARSHIPS);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(STARSHIPS + "/{id}")
    public JsonNode getStarship(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + STARSHIPS + "/" + id);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(VEHICLES)
    public JsonNode getVehicles() {
        String response =  swapiService.getStringFromUri(BASE_URI + VEHICLES);
        return swapiService.getJsonFromString(response);
    }

    @GetMapping(VEHICLES + "/{id}")
    public JsonNode getVehicle(@PathVariable String id) {
        String response =  swapiService.getStringFromUri(BASE_URI + VEHICLES + "/" + id);
        return swapiService.getJsonFromString(response);
    }
}

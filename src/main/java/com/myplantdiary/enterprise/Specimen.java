package com.myplantdiary.enterprise.dto;

import lombok.Data;

public @Data class Specimen {
    private int PlantID;
    private String SpecimenID;
    private String Latitude;
    private String Longitude;
    private String Description;
}

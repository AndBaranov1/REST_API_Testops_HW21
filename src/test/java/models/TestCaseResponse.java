package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestCaseResponse {

    private String id;
    private String name;
    private Boolean automated;
    private String statusName;
}

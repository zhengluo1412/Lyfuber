package domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@RequiredArgsConstructor
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaultCode {
    private String engineMake;
    private String faultCode;
    private String faultCodeId;
    private String faultCodeClassification;
    @Column(length=1024)
    private String repairInstructions;
    private Long fmi;
    private String sa;
    private Long spn;
}

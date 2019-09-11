package domain;


@Embeddable
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

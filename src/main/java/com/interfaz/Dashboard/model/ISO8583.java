package com.interfaz.Dashboard.model;

import lombok.Data;

@Data
public class ISO8583 {
    private String WISO_000_MESSAGE_TYPE;
    private String WISO_003_PROCESSINGCODE;
    private String WISO_018_MERCHANTTYPE;
    private String WISO_024_NETWORKID;
    private String WISO_007_TRANSDATETIME;
    private String WISO_002_PAN;
}

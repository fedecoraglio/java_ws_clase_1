/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawsclase3_3_3.exception;

/**
 *
 * @author Federico Coraglio
 */
public class ProductoException extends Exception {
    
    private String faultCode = "1";
    private String failtString = "123456";
    
    public ProductoException(String messageError) {
        super(messageError, null);
    }

    /**
     * @return the faultCode
     */
    public String getFaultCode() {
        return faultCode;
    }

    /**
     * @param faultCode the faultCode to set
     */
    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    /**
     * @return the failtString
     */
    public String getFailtString() {
        return failtString;
    }

    /**
     * @param failtString the failtString to set
     */
    public void setFailtString(String failtString) {
        this.failtString = failtString;
    }
    
    
    
}

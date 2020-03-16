
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfOBD2DiagnosticTroubleCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOBD2DiagnosticTroubleCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OBD2DiagnosticTroubleCode" type="{http://roadnet.com/apex/DataContracts/}OBD2DiagnosticTroubleCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOBD2DiagnosticTroubleCode", propOrder = {
    "obd2DiagnosticTroubleCode"
})
public class ArrayOfOBD2DiagnosticTroubleCode {

    @XmlElement(name = "OBD2DiagnosticTroubleCode", nillable = true)
    protected List<OBD2DiagnosticTroubleCode> obd2DiagnosticTroubleCode;

    /**
     * Gets the value of the obd2DiagnosticTroubleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obd2DiagnosticTroubleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBD2DiagnosticTroubleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OBD2DiagnosticTroubleCode }
     * 
     * 
     */
    public List<OBD2DiagnosticTroubleCode> getOBD2DiagnosticTroubleCode() {
        if (obd2DiagnosticTroubleCode == null) {
            obd2DiagnosticTroubleCode = new ArrayList<OBD2DiagnosticTroubleCode>();
        }
        return this.obd2DiagnosticTroubleCode;
    }

}

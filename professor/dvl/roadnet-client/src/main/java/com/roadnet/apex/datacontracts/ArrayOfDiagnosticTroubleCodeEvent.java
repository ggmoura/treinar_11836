
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDiagnosticTroubleCodeEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDiagnosticTroubleCodeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticTroubleCodeEvent" type="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticTroubleCodeEvent", propOrder = {
    "diagnosticTroubleCodeEvent"
})
public class ArrayOfDiagnosticTroubleCodeEvent {

    @XmlElement(name = "DiagnosticTroubleCodeEvent", nillable = true)
    protected List<DiagnosticTroubleCodeEvent> diagnosticTroubleCodeEvent;

    /**
     * Gets the value of the diagnosticTroubleCodeEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticTroubleCodeEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticTroubleCodeEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticTroubleCodeEvent }
     * 
     * 
     */
    public List<DiagnosticTroubleCodeEvent> getDiagnosticTroubleCodeEvent() {
        if (diagnosticTroubleCodeEvent == null) {
            diagnosticTroubleCodeEvent = new ArrayList<DiagnosticTroubleCodeEvent>();
        }
        return this.diagnosticTroubleCodeEvent;
    }

}

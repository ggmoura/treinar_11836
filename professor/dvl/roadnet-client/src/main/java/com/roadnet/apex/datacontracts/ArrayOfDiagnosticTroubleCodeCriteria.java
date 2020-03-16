
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfDiagnosticTroubleCodeCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDiagnosticTroubleCodeCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiagnosticTroubleCodeCriteria" type="{http://roadnet.com/apex/DataContracts/}DiagnosticTroubleCodeCriteria" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDiagnosticTroubleCodeCriteria", propOrder = {
    "diagnosticTroubleCodeCriteria"
})
public class ArrayOfDiagnosticTroubleCodeCriteria {

    @XmlElement(name = "DiagnosticTroubleCodeCriteria", nillable = true)
    protected List<DiagnosticTroubleCodeCriteria> diagnosticTroubleCodeCriteria;

    /**
     * Gets the value of the diagnosticTroubleCodeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diagnosticTroubleCodeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiagnosticTroubleCodeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticTroubleCodeCriteria }
     * 
     * 
     */
    public List<DiagnosticTroubleCodeCriteria> getDiagnosticTroubleCodeCriteria() {
        if (diagnosticTroubleCodeCriteria == null) {
            diagnosticTroubleCodeCriteria = new ArrayList<DiagnosticTroubleCodeCriteria>();
        }
        return this.diagnosticTroubleCodeCriteria;
    }

}

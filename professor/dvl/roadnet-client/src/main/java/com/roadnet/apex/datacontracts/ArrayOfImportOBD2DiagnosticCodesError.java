
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfImportOBD2DiagnosticCodesError complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfImportOBD2DiagnosticCodesError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportOBD2DiagnosticCodesError" type="{http://roadnet.com/apex/DataContracts/}ImportOBD2DiagnosticCodesError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfImportOBD2DiagnosticCodesError", propOrder = {
    "importOBD2DiagnosticCodesError"
})
public class ArrayOfImportOBD2DiagnosticCodesError {

    @XmlElement(name = "ImportOBD2DiagnosticCodesError", nillable = true)
    protected List<ImportOBD2DiagnosticCodesError> importOBD2DiagnosticCodesError;

    /**
     * Gets the value of the importOBD2DiagnosticCodesError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOBD2DiagnosticCodesError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportOBD2DiagnosticCodesError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOBD2DiagnosticCodesError }
     * 
     * 
     */
    public List<ImportOBD2DiagnosticCodesError> getImportOBD2DiagnosticCodesError() {
        if (importOBD2DiagnosticCodesError == null) {
            importOBD2DiagnosticCodesError = new ArrayList<ImportOBD2DiagnosticCodesError>();
        }
        return this.importOBD2DiagnosticCodesError;
    }

}

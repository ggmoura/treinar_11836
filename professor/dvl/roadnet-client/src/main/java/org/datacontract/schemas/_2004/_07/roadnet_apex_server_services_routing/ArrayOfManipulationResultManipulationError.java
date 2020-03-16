
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfManipulationResult.ManipulationError complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfManipulationResult.ManipulationError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManipulationResult.ManipulationError" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ManipulationResult.ManipulationError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManipulationResult.ManipulationError", propOrder = {
    "manipulationResultManipulationError"
})
public class ArrayOfManipulationResultManipulationError {

    @XmlElement(name = "ManipulationResult.ManipulationError", nillable = true)
    protected List<ManipulationResultManipulationError> manipulationResultManipulationError;

    /**
     * Gets the value of the manipulationResultManipulationError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manipulationResultManipulationError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManipulationResultManipulationError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManipulationResultManipulationError }
     * 
     * 
     */
    public List<ManipulationResultManipulationError> getManipulationResultManipulationError() {
        if (manipulationResultManipulationError == null) {
            manipulationResultManipulationError = new ArrayList<ManipulationResultManipulationError>();
        }
        return this.manipulationResultManipulationError;
    }

}

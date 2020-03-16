
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSecondaryDimensionMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSecondaryDimensionMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SecondaryDimensionMetadata" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}SecondaryDimensionMetadata" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSecondaryDimensionMetadata", propOrder = {
    "secondaryDimensionMetadata"
})
public class ArrayOfSecondaryDimensionMetadata {

    @XmlElement(name = "SecondaryDimensionMetadata", nillable = true)
    protected List<SecondaryDimensionMetadata> secondaryDimensionMetadata;

    /**
     * Gets the value of the secondaryDimensionMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryDimensionMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryDimensionMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecondaryDimensionMetadata }
     * 
     * 
     */
    public List<SecondaryDimensionMetadata> getSecondaryDimensionMetadata() {
        if (secondaryDimensionMetadata == null) {
            secondaryDimensionMetadata = new ArrayList<SecondaryDimensionMetadata>();
        }
        return this.secondaryDimensionMetadata;
    }

}

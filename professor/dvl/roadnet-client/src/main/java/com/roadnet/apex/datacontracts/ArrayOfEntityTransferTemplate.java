
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfEntityTransferTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntityTransferTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityTransferTemplate" type="{http://roadnet.com/apex/DataContracts/}EntityTransferTemplate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityTransferTemplate", propOrder = {
    "entityTransferTemplate"
})
public class ArrayOfEntityTransferTemplate {

    @XmlElement(name = "EntityTransferTemplate", nillable = true)
    protected List<EntityTransferTemplate> entityTransferTemplate;

    /**
     * Gets the value of the entityTransferTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityTransferTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityTransferTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityTransferTemplate }
     * 
     * 
     */
    public List<EntityTransferTemplate> getEntityTransferTemplate() {
        if (entityTransferTemplate == null) {
            entityTransferTemplate = new ArrayList<EntityTransferTemplate>();
        }
        return this.entityTransferTemplate;
    }

}

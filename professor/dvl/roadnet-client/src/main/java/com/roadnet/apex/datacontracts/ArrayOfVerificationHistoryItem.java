
package com.roadnet.apex.datacontracts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfVerificationHistoryItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVerificationHistoryItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VerificationHistoryItem" type="{http://roadnet.com/apex/DataContracts/}VerificationHistoryItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVerificationHistoryItem", propOrder = {
    "verificationHistoryItem"
})
public class ArrayOfVerificationHistoryItem {

    @XmlElement(name = "VerificationHistoryItem", nillable = true)
    protected List<VerificationHistoryItem> verificationHistoryItem;

    /**
     * Gets the value of the verificationHistoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verificationHistoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerificationHistoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationHistoryItem }
     * 
     * 
     */
    public List<VerificationHistoryItem> getVerificationHistoryItem() {
        if (verificationHistoryItem == null) {
            verificationHistoryItem = new ArrayList<VerificationHistoryItem>();
        }
        return this.verificationHistoryItem;
    }

}

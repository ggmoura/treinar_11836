
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfCustomerPurchasedFeatureSet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomerPurchasedFeatureSet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerPurchasedFeatureSet" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}CustomerPurchasedFeatureSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomerPurchasedFeatureSet", propOrder = {
    "customerPurchasedFeatureSet"
})
public class ArrayOfCustomerPurchasedFeatureSet {

    @XmlElement(name = "CustomerPurchasedFeatureSet", nillable = true)
    protected List<CustomerPurchasedFeatureSet> customerPurchasedFeatureSet;

    /**
     * Gets the value of the customerPurchasedFeatureSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPurchasedFeatureSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPurchasedFeatureSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPurchasedFeatureSet }
     * 
     * 
     */
    public List<CustomerPurchasedFeatureSet> getCustomerPurchasedFeatureSet() {
        if (customerPurchasedFeatureSet == null) {
            customerPurchasedFeatureSet = new ArrayList<CustomerPurchasedFeatureSet>();
        }
        return this.customerPurchasedFeatureSet;
    }

}

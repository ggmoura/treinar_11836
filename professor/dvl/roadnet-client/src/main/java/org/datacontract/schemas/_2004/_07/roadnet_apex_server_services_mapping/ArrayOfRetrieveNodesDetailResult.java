
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfRetrieveNodesDetailResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetrieveNodesDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveNodesDetailResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}RetrieveNodesDetailResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetrieveNodesDetailResult", propOrder = {
    "retrieveNodesDetailResult"
})
public class ArrayOfRetrieveNodesDetailResult {

    @XmlElement(name = "RetrieveNodesDetailResult", nillable = true)
    protected List<RetrieveNodesDetailResult> retrieveNodesDetailResult;

    /**
     * Gets the value of the retrieveNodesDetailResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retrieveNodesDetailResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetrieveNodesDetailResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetrieveNodesDetailResult }
     * 
     * 
     */
    public List<RetrieveNodesDetailResult> getRetrieveNodesDetailResult() {
        if (retrieveNodesDetailResult == null) {
            retrieveNodesDetailResult = new ArrayList<RetrieveNodesDetailResult>();
        }
        return this.retrieveNodesDetailResult;
    }

}

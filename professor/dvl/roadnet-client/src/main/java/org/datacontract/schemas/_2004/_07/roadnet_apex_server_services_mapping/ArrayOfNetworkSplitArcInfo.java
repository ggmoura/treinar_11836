
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNetworkSplitArcInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNetworkSplitArcInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkSplitArcInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}NetworkSplitArcInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetworkSplitArcInfo", propOrder = {
    "networkSplitArcInfo"
})
public class ArrayOfNetworkSplitArcInfo {

    @XmlElement(name = "NetworkSplitArcInfo", nillable = true)
    protected List<NetworkSplitArcInfo> networkSplitArcInfo;

    /**
     * Gets the value of the networkSplitArcInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkSplitArcInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkSplitArcInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkSplitArcInfo }
     * 
     * 
     */
    public List<NetworkSplitArcInfo> getNetworkSplitArcInfo() {
        if (networkSplitArcInfo == null) {
            networkSplitArcInfo = new ArrayList<NetworkSplitArcInfo>();
        }
        return this.networkSplitArcInfo;
    }

}

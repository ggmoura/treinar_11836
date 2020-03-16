
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfSaveRouteResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaveRouteResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaveRouteResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SaveRouteResult" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaveRouteResult", propOrder = {
    "saveRouteResult"
})
public class ArrayOfSaveRouteResult {

    @XmlElement(name = "SaveRouteResult", nillable = true)
    protected List<SaveRouteResult> saveRouteResult;

    /**
     * Gets the value of the saveRouteResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saveRouteResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaveRouteResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaveRouteResult }
     * 
     * 
     */
    public List<SaveRouteResult> getSaveRouteResult() {
        if (saveRouteResult == null) {
            saveRouteResult = new ArrayList<SaveRouteResult>();
        }
        return this.saveRouteResult;
    }

}

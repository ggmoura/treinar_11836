
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfClientDiagnosticsInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClientDiagnosticsInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientDiagnosticsInformation" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics}ClientDiagnosticsInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClientDiagnosticsInformation", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", propOrder = {
    "clientDiagnosticsInformation"
})
public class ArrayOfClientDiagnosticsInformation {

    @XmlElement(name = "ClientDiagnosticsInformation", nillable = true)
    protected List<ClientDiagnosticsInformation> clientDiagnosticsInformation;

    /**
     * Gets the value of the clientDiagnosticsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientDiagnosticsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientDiagnosticsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientDiagnosticsInformation }
     * 
     * 
     */
    public List<ClientDiagnosticsInformation> getClientDiagnosticsInformation() {
        if (clientDiagnosticsInformation == null) {
            clientDiagnosticsInformation = new ArrayList<ClientDiagnosticsInformation>();
        }
        return this.clientDiagnosticsInformation;
    }

}

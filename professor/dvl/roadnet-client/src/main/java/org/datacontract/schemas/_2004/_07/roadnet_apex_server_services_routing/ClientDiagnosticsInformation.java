
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ClientDiagnosticsInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientDiagnosticsInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogFile" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics}LogFile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientDiagnosticsInformation", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", propOrder = {
    "logFile"
})
public class ClientDiagnosticsInformation {

    @XmlElementRef(name = "LogFile", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.RemoteDiagnostics", type = JAXBElement.class, required = false)
    protected JAXBElement<LogFile> logFile;

    /**
     * Obtém o valor da propriedade logFile.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LogFile }{@code >}
     *     
     */
    public JAXBElement<LogFile> getLogFile() {
        return logFile;
    }

    /**
     * Define o valor da propriedade logFile.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LogFile }{@code >}
     *     
     */
    public void setLogFile(JAXBElement<LogFile> value) {
        this.logFile = value;
    }

}

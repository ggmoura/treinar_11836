
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ImportOBD2DiagnosticTroubleCodesParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ImportOBD2DiagnosticTroubleCodesParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOBD2DiagnosticTroubleCodesParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", propOrder = {
    "file"
})
public class ImportOBD2DiagnosticTroubleCodesParameters
    extends DataTransferObject
{

    @XmlElementRef(name = "File", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.ImportOBD2", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> file;

    /**
     * Obtém o valor da propriedade file.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFile() {
        return file;
    }

    /**
     * Define o valor da propriedade file.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFile(JAXBElement<byte[]> value) {
        this.file = value;
    }

}

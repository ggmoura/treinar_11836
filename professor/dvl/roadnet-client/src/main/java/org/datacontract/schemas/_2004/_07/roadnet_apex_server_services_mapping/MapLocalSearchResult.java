
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfValidationFailure;


/**
 * <p>Classe Java de MapLocalSearchResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapLocalSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapLocalSearchResult.ErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="ResultsData" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfMapLocalSearchResultData" minOccurs="0"/&gt;
 *         &lt;element name="ValidationFailures" type="{http://roadnet.com/apex/DataContracts/}ArrayOfValidationFailure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapLocalSearchResult", propOrder = {
    "error",
    "resultsData",
    "validationFailures"
})
public class MapLocalSearchResult {

    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected MapLocalSearchResultErrorCode error;
    @XmlElementRef(name = "ResultsData", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMapLocalSearchResultData> resultsData;
    @XmlElementRef(name = "ValidationFailures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfValidationFailure> validationFailures;

    /**
     * Obtém o valor da propriedade error.
     * 
     * @return
     *     possible object is
     *     {@link MapLocalSearchResultErrorCode }
     *     
     */
    public MapLocalSearchResultErrorCode getError() {
        return error;
    }

    /**
     * Define o valor da propriedade error.
     * 
     * @param value
     *     allowed object is
     *     {@link MapLocalSearchResultErrorCode }
     *     
     */
    public void setError(MapLocalSearchResultErrorCode value) {
        this.error = value;
    }

    /**
     * Obtém o valor da propriedade resultsData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapLocalSearchResultData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMapLocalSearchResultData> getResultsData() {
        return resultsData;
    }

    /**
     * Define o valor da propriedade resultsData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapLocalSearchResultData }{@code >}
     *     
     */
    public void setResultsData(JAXBElement<ArrayOfMapLocalSearchResultData> value) {
        this.resultsData = value;
    }

    /**
     * Obtém o valor da propriedade validationFailures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}
     *     
     */
    public JAXBElement<ArrayOfValidationFailure> getValidationFailures() {
        return validationFailures;
    }

    /**
     * Define o valor da propriedade validationFailures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfValidationFailure }{@code >}
     *     
     */
    public void setValidationFailures(JAXBElement<ArrayOfValidationFailure> value) {
        this.validationFailures = value;
    }

}

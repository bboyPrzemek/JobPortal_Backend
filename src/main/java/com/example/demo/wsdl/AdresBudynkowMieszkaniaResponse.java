
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdresBudynkowMieszkaniaResult" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}ArrayOfAdresoBudynkiMieszkania" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adresBudynkowMieszkaniaResult"
})
@XmlRootElement(name = "AdresBudynkowMieszkaniaResponse")
public class AdresBudynkowMieszkaniaResponse {

    @XmlElementRef(name = "AdresBudynkowMieszkaniaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAdresoBudynkiMieszkania> adresBudynkowMieszkaniaResult;

    /**
     * Gets the value of the adresBudynkowMieszkaniaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdresoBudynkiMieszkania }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdresoBudynkiMieszkania> getAdresBudynkowMieszkaniaResult() {
        return adresBudynkowMieszkaniaResult;
    }

    /**
     * Sets the value of the adresBudynkowMieszkaniaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdresoBudynkiMieszkania }{@code >}
     *     
     */
    public void setAdresBudynkowMieszkaniaResult(JAXBElement<ArrayOfAdresoBudynkiMieszkania> value) {
        this.adresBudynkowMieszkaniaResult = value;
    }

}

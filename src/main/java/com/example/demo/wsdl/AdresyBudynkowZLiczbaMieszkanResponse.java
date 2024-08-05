
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
 *         &lt;element name="AdresyBudynkowZLiczbaMieszkanResult" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}PlikZbioryNOBC" minOccurs="0"/&gt;
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
    "adresyBudynkowZLiczbaMieszkanResult"
})
@XmlRootElement(name = "AdresyBudynkowZLiczbaMieszkanResponse")
public class AdresyBudynkowZLiczbaMieszkanResponse {

    @XmlElementRef(name = "AdresyBudynkowZLiczbaMieszkanResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PlikZbioryNOBC> adresyBudynkowZLiczbaMieszkanResult;

    /**
     * Gets the value of the adresyBudynkowZLiczbaMieszkanResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlikZbioryNOBC }{@code >}
     *     
     */
    public JAXBElement<PlikZbioryNOBC> getAdresyBudynkowZLiczbaMieszkanResult() {
        return adresyBudynkowZLiczbaMieszkanResult;
    }

    /**
     * Sets the value of the adresyBudynkowZLiczbaMieszkanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlikZbioryNOBC }{@code >}
     *     
     */
    public void setAdresyBudynkowZLiczbaMieszkanResult(JAXBElement<PlikZbioryNOBC> value) {
        this.adresyBudynkowZLiczbaMieszkanResult = value;
    }

}

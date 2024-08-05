
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
 *         &lt;element name="PobierzListeUlicDlaMiejscowosciResult" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}ArrayOfUlicaDrzewo" minOccurs="0"/&gt;
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
    "pobierzListeUlicDlaMiejscowosciResult"
})
@XmlRootElement(name = "PobierzListeUlicDlaMiejscowosciResponse")
public class PobierzListeUlicDlaMiejscowosciResponse {

    @XmlElementRef(name = "PobierzListeUlicDlaMiejscowosciResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUlicaDrzewo> pobierzListeUlicDlaMiejscowosciResult;

    /**
     * Gets the value of the pobierzListeUlicDlaMiejscowosciResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUlicaDrzewo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUlicaDrzewo> getPobierzListeUlicDlaMiejscowosciResult() {
        return pobierzListeUlicDlaMiejscowosciResult;
    }

    /**
     * Sets the value of the pobierzListeUlicDlaMiejscowosciResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUlicaDrzewo }{@code >}
     *     
     */
    public void setPobierzListeUlicDlaMiejscowosciResult(JAXBElement<ArrayOfUlicaDrzewo> value) {
        this.pobierzListeUlicDlaMiejscowosciResult = value;
    }

}

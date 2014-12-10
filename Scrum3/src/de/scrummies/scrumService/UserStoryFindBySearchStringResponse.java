
package de.scrummies.scrumService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserStoryFindBySearchStringResult" type="{http://www.fuldaai.de}ArrayOfUserStory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userStoryFindBySearchStringResult"
})
@XmlRootElement(name = "UserStoryFindBySearchStringResponse")
public class UserStoryFindBySearchStringResponse {

    @XmlElementRef(name = "UserStoryFindBySearchStringResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUserStory> userStoryFindBySearchStringResult;

    /**
     * Gets the value of the userStoryFindBySearchStringResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUserStory> getUserStoryFindBySearchStringResult() {
        return userStoryFindBySearchStringResult;
    }

    /**
     * Sets the value of the userStoryFindBySearchStringResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUserStory }{@code >}
     *     
     */
    public void setUserStoryFindBySearchStringResult(JAXBElement<ArrayOfUserStory> value) {
        this.userStoryFindBySearchStringResult = value;
    }

}


package de.scrummies.scrumService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserStoryExtention complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserStoryExtention">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}AbstractExtentions">
 *       &lt;sequence>
 *         &lt;element name="UserStoryId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserStoryExtention", namespace = "http://www.fuldaai.de", propOrder = {
    "userStoryId"
})
public class UserStoryExtention
    extends AbstractExtentions
{

    @XmlElement(name = "UserStoryId")
    protected String userStoryId;

    /**
     * Gets the value of the userStoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserStoryId() {
        return userStoryId;
    }

    /**
     * Sets the value of the userStoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserStoryId(String value) {
        this.userStoryId = value;
    }

}

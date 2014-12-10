
package de.scrummies.scrumService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Severity.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Severity">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="High"/>
 *     &lt;enumeration value="Critical"/>
 *     &lt;enumeration value="Low"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Severity", namespace = "http://www.fuldaai.de")
@XmlEnum
public enum Severity {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("High")
    HIGH("High"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical"),
    @XmlEnumValue("Low")
    LOW("Low");
    private final String value;

    Severity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Severity fromValue(String v) {
        for (Severity c: Severity.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

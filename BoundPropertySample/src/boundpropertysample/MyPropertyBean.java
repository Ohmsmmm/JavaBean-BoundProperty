/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertysample;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author jirap
 */
public class MyPropertyBean implements Serializable {
    
    public static final String VALUE_PROPERTY = "value";
    
    private String value;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        String oldValue = this.value;
        this.value = value;
        propertySupport.firePropertyChange(VALUE_PROPERTY, oldValue, this.value);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballboundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author amam
 */
public class MyFootballPropertyBean implements Serializable {

    public static final String FootballResult_PROPERTY = "footballResult";

    private String footballResult;

    private PropertyChangeSupport propertySupport;

    public MyFootballPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getFootballResult() {
        return footballResult;
    }

    public void setFootballResult(String value) {
        String oldValue = this.footballResult;
        this.footballResult = value;
        propertySupport.firePropertyChange(FootballResult_PROPERTY, oldValue, this.footballResult);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}

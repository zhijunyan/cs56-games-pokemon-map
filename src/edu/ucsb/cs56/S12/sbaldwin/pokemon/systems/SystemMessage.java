package edu.ucsb.cs56.S12.sbaldwin.pokemon.systems;

import edu.ucsb.cs56.S12.sbaldwin.pokemon.components.Entity;
import edu.ucsb.cs56.S12.sbaldwin.pokemon.framework.Pair;
import edu.ucsb.cs56.S12.sbaldwin.pokemon.framework.Ref;

import java.lang.ref.Reference;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * Created by William Bennett on 7/21/2016.
 */
public class SystemMessage {
    Pair<String, Object> message;
    public Entity subject;

    public SystemMessage(Entity subject, Pair<String, Object> message) {
        this.message = message;
        this.subject = subject;
    }

    public boolean getMessage(String message, Ref<Object> reference) {
        if (message.equals(this.message.first)) {
            reference.reference = this.message.second;
            return true;
        }
        else {
            reference.reference = null;
            return false;
        }
    }
}

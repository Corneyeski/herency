package entities;

import entities.enums.Colors;
import entities.enums.Tastes;

import java.util.Date;

public class ManzanaVariedad extends Apple {

    private int dias;
    private String etiqueta;

    public ManzanaVariedad(int dias, String etiqueta) {
        this.dias = dias;
        this.etiqueta = etiqueta;
    }

    public ManzanaVariedad(Colors color, String family, Tastes taste, String name, Date expirationDate, String provider, int dias, String etiqueta) {
        super(color, family, taste, name, expirationDate, provider);
        this.dias = dias;
        this.etiqueta = etiqueta;
    }

    public ManzanaVariedad(String name, Date expirationDate, String provider, int dias, String etiqueta) {
        super(name, expirationDate, provider);
        this.dias = dias;
        this.etiqueta = etiqueta;

        this.getColor();
        super.getFamily();

    }
}

package entities;

import java.util.Date;

public class AppleRead {
    private String name;
    private Date expirationDate;
    private String provider;

    public AppleRead(String name, Date expirationDate, String provider) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.provider = provider;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String toUpperCase(){
        return name.toUpperCase();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama;

/**
 *
 * @author Giova
 */
public class Address {
    private String house;
    private String country;
    private String PostCode;

    public Address(String house, String country, String PostCode) {
        this.house = house;
        this.country = country;
        this.PostCode = PostCode;
    }

        
    public String getHouse() {
        return house;
    }

    public String getCountry() {
        return country;
    }

    public String getPostCode() {
        return PostCode;
    }
    
    
}

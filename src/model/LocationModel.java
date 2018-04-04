/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Evi
 */
public class LocationModel {
    
  private int Location_ID;
  private String Street_Address;
  private String Postal_Code;
  private String City;
  private String State_Province;
  private String Country_ID;
  
  public LocationModel(){
      
}
  
 public LocationModel(int Location_ID, String Street_Address, String Postal_Code, String City, String State_Province, String Country_ID)
 {
        this.Location_ID = Location_ID;
        this.Street_Address = Street_Address;
        this.Postal_Code = Postal_Code;
        this.City = City;
        this.State_Province = State_Province;
        this.Country_ID = Country_ID;
    }

    public int getLocation_ID() {
        return Location_ID;
    }

    public String getStreet_Address() {
        return Street_Address;
    }

    public String getPostal_Code() {
        return Postal_Code;
    }

    public String getCity() {
        return City;
    }

    public String getState_Province() {
        return State_Province;
    }

    public String getCountry_ID() {
        return Country_ID;
    }

    public void setLocation_ID(int Location_ID) {
        this.Location_ID = Location_ID;
    }

    public void setStreet_Address(String Street_Address) {
        this.Street_Address = Street_Address;
    }

    public void setPostal_Code(String Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState_Province(String State_Province) {
        this.State_Province = State_Province;
    }

    public void setCountry_ID(String Country_ID) {
        this.Country_ID = Country_ID;
    }
 
}
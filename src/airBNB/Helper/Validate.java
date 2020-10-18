/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airBNB.Helper;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author dsouz
 */
public class Validate {
    
    public static String validateUsername(String value) {
        
        if(! value.matches("^[a-z0-9_-]{5,16}$")) {
            return "Can only be a-z, 0-9, -, _";
        }
        
        return "";
    }
    
    public static String[] validatePassword(String fvalue, String cvalue) {
        if(! fvalue.equals(cvalue)) {
            return new String[] {"Passwords don't match", "Passwords don't match"};
        }
        
        String[] toReturn = new String[2];
        
        if(fvalue.length() < 5) {
            toReturn[0] = "Password length greater than 5";
        } else {
            toReturn[0] = "";
        }
        
        if(cvalue.length() < 5) {
            toReturn[1] = "Password length greater than 5";
        } else {
            toReturn[1] = "";
        }
        
        if(toReturn[0].equals("") && toReturn[1].equals("")) {
            return toReturn;
        } else {
            if(! fvalue.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$)$")) {
                toReturn[0] = "Password needs a-z, 0-9, special characters";
            }
            
            if(! cvalue.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$)$")) {
                toReturn[1] = "Password needs a-z, 0-9, special characters";
            }
        }
        
        return toReturn;
    }
    
    public static String validateName(String fvalue, String mvalue, String lvalue) {
        String name = fvalue + " " + mvalue + " " + lvalue;
        
        return name.trim().matches("^[\\p{L} .'-]+$") ? "" : "Invalid name";
    }
    
    public static String validatePhone(String value){
        if(value.length() != 10) {
            return "Length has to be 10";
        }
        
        return value.matches("\\d{10}") ? "" : "Invalid Number";
    }
    
    public static String validateHouseNum(String value){
        return value.matches("^[0-9]+$") ? "" : "Invalid Number";
    }
    
    public static String validatePrice(String value){
        try{
            int num = Integer.parseInt(value);
        }catch(NumberFormatException ex) {
            return "Invalid price";
        }
        return "";
    }
    
    public static String validateBeds(String value){
        try{
            int num = Integer.parseInt(value);
        }catch(NumberFormatException ex) {
            return "Invalid number of beds";
        }
        return "";
    }
    
    public static String validateBathrooms(String value){
        try{
            int num = Integer.parseInt(value);
        }catch(NumberFormatException ex) {
            return "Invalid number of bathrooms";
        }
        return "";
    }
    
    public static String validateDate(String value){
        try{
            String[] date = value.split("-");
            LocalDate ldate = LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
            if(ldate.isAfter(LocalDate.now())) {
                return "";
            } else {
                return "Invalid Date";
            }
        }catch(NumberFormatException ex) {
            return "Invalid date";
        }
    }
    
    public static String validateDate(String value, String dest) {
        String returnType = "";
        String[] dateSplit = value.split("-");
        String[] destSplit = dest.split("-");
        LocalDate startDate = null;
        LocalDate endDate = null;
        try {
            startDate = LocalDate.of(Integer.parseInt(dateSplit[0]), Integer.parseInt(dateSplit[1]), Integer.parseInt(dateSplit[2]));
            endDate = LocalDate.of(Integer.parseInt(destSplit[0]), Integer.parseInt(destSplit[1]), Integer.parseInt(destSplit[2]));
         
            if (startDate.isBefore(endDate) || startDate.isEqual(endDate)){
                return "";
            }
            else{
                return "Invalid Date";
            }
        } catch(NumberFormatException ex) {
            returnType = "Invalid Date";
        }
        
        return returnType;
    }
    
    public static String validateAmenities(String value){
        return value.matches("^[a-zA-Z, ]+$") ? "" : "Invalid, only letters";
    }
    
    public static String validateAccomidation(String value){
        return value.matches("^[0-9]+$") ? "" : "Invalid only numbers";
    }
        
    public static String validateStreet(String value){
        return value.matches("^[a-zA-Z ]+$") ? "" : "Invalid Street Name";
    }
    
    public static String validateCity(String value){
        return value.matches("^[a-zA-Z ]+$") ? "" : "Invalid City Name";
    }
    
    public static String validateProvince(String value){
        return value.matches("^[a-zA-Z ]+$") ? "" : "Invalid Province Name";
    }
    
    public static String validateEmail(String value) {
        return value.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])") ? "" : "Invalid Email";
    }
    
    public static String validateRatings(String value) {
        return value.matches("^[0-9]+$") ? "" : "Invalid Option";
    }
    
    public static String validateComm(String value) {
        return value.matches("^[a-zA-Z0-9 ,.:;'\"(){}]+$") ? "" : "Invalid String";
    }
}
    

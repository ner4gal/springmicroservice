package com.algotechnica.springmicroservice.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algotechnica.springmicroservice.entities.Vendor;

@Component
public class VendorService {

    private HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();

    public VendorService() {
        
        
    }

    @Autowired
    private Vendor vendor1;
    @Autowired
    private Vendor vendor2;
    @Autowired
    private Vendor vendor3;

    private void fillVendors() {
        vendors.put("1", vendor1);
        vendors.put(vendors.size() + "10", vendor2);
        vendors.put(vendors.size() + "10", vendor3);
        vendor1.setCode("code1");
        vendor2.setCode("code2");
        vendor3.setCode("code3");
        
    }

    public Vendor getVendor(String code) {
        return vendors.get(code);
    }

    public HashMap<String, Vendor> getVendors() {
        fillVendors();
        return vendors;
    }

    public void addVendor(Vendor vendor) {
        fillVendors();
        vendors.put(vendors.size() + "10", vendor);
    }

    public Vendor updateVendor(String code, Vendor vendor) {
        fillVendors();
        vendors.put(code, vendor);
        return vendor;
    }

    public void deleteVendor(String code) {
        fillVendors();
        vendors.remove(code);
    }

}

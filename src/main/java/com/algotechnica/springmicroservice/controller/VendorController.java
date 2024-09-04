package com.algotechnica.springmicroservice.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.algotechnica.springmicroservice.entities.Vendor;
import com.algotechnica.springmicroservice.services.VendorService;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class VendorController {
                @Autowired
                private VendorService vendorService;

                @RequestMapping("/vendors")
                public HashMap<String , Vendor> getAll() {
                                return vendorService.getVendors();
                }

                
                
}

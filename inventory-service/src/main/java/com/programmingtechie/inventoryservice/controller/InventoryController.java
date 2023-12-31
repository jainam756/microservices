package com.programmingtechie.inventoryservice.controller;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
//    @GetMapping("/{sku-code}")
    //http://localhost:8082/api/inventory/iphone-13
    //when passing many sku-code uri will look like
    //http://localhost:8082/api/inventory/iphone-12,iphone-13
    //here sku-code is path variable for showing it as request parameter uri will be
    //http://localhost:8082/api/inventory?skuCode=iphone-12&skuCode=iphone-13-red
//    for above uri we have to change getmapping
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) throws InterruptedException {

        return inventoryService.isInStock(skuCode);
    }
}

package com.example.searchService.service;

import com.example.searchService.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    private final InventoryService inventoryService;

    public SearchService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public List<String> searchProductsUnder50() {

        return inventoryService.getAllProducts()
                .stream()
                .filter(product -> product.getPrice() < 50)
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}

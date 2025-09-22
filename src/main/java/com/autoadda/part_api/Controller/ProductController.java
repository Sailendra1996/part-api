package com.autoadda.part_api.Controller;

import com.autoadda.part_api.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<Product> getProducts() {
        return Arrays.asList(
                new Product(1,"Car Tyre", "Durable tyre for SUVs", "Automobile",
                        "https://picsum.photos/200?1", Arrays.asList("SUV", "Tyre", "Car"), 2024, 4999.99),
                new Product(2,"Engine Oil", "High performance synthetic oil", "Automobile",
                        "https://picsum.photos/200?2", Arrays.asList("Oil", "Engine", "Lubricant"), 2023, 899.50),
                new Product(3,"Brake Pads", "Premium brake pads for cars", "Automobile",
                        "https://picsum.photos/200?3", Arrays.asList("Brake", "Safety", "Car"), 2024, 1299.00),
                new Product(4,"Air Filter", "High efficiency car air filter", "Automobile",
                        "https://picsum.photos/200?4", Arrays.asList("Filter", "Car", "Engine"), 2023, 599.00),
                new Product(5,"Car Battery", "Long life car battery", "Electronics",
                        "https://picsum.photos/200?5", Arrays.asList("Battery", "Power", "Automobile"), 2024, 6499.00),
                new Product(6,"Headlight Bulb", "Bright LED headlight bulb", "Lighting",
                        "https://picsum.photos/200?6", Arrays.asList("LED", "Bulb", "Light"), 2023, 1299.00),
                new Product(7,"Seat Cover", "Leather seat cover for cars", "Accessories",
                        "https://picsum.photos/200?7", Arrays.asList("Seat", "Cover", "Leather"), 2024, 2999.00),
                new Product(8,"Car Perfume", "Long lasting car perfume", "Accessories",
                        "https://picsum.photos/200?8", Arrays.asList("Perfume", "Fresh", "Car"), 2024, 499.00),
                new Product(9,"Alloy Wheels", "Premium alloy wheels for cars", "Automobile",
                        "https://picsum.photos/200?9", Arrays.asList("Wheels", "Alloy", "Car"), 2024, 14999.00),
                new Product(10,"Car Jack", "Portable hydraulic car jack", "Tools",
                        "https://picsum.photos/200?10", Arrays.asList("Jack", "Car", "Hydraulic"), 2023, 1799.00),
                new Product(11,"Dash Camera", "1080p HD dash camera", "Electronics",
                        "https://picsum.photos/200?11", Arrays.asList("Camera", "Dash", "HD"), 2024, 4999.00),
                new Product(12,"GPS Tracker", "Real-time GPS tracker for cars", "Electronics",
                        "https://picsum.photos/200?12", Arrays.asList("GPS", "Tracker", "Car"), 2024, 3499.00),
                new Product(13,"Car Vacuum", "Portable car vacuum cleaner", "Tools",
                        "https://picsum.photos/200?13", Arrays.asList("Vacuum", "Cleaner", "Car"), 2024, 1299.00),
                new Product(14,"Steering Cover", "Comfortable leather steering cover", "Accessories",
                        "https://picsum.photos/200?14", Arrays.asList("Steering", "Cover", "Leather"), 2024, 799.00),
                new Product(15,"Fog Light", "High power fog light for cars", "Lighting",
                        "https://picsum.photos/200?15", Arrays.asList("Fog", "Light", "LED"), 2023, 1999.00),
                new Product(16,"Roof Rack", "Universal roof rack for cars", "Accessories",
                        "https://picsum.photos/200?16", Arrays.asList("Roof", "Rack", "Car"), 2024, 6999.00),
                new Product(17,"Car Mat", "Premium all-weather car mat", "Accessories",
                        "https://picsum.photos/200?17", Arrays.asList("Mat", "Car", "Floor"), 2024, 2499.00),
                new Product(18,"Car Cover", "All-weather car cover", "Accessories",
                        "https://picsum.photos/200?18", Arrays.asList("Cover", "Car", "Protection"), 2024, 2199.00),
                new Product(19,"Gear Knob", "Stylish gear knob for cars", "Accessories",
                        "https://picsum.photos/200?19", Arrays.asList("Gear", "Knob", "Car"), 2024, 1499.00),
                new Product(20,"Tyre Inflator", "Portable electric tyre inflator", "Tools",
                        "https://picsum.photos/200?20", Arrays.asList("Inflator", "Tyre", "Electric"), 2024, 2499.00)
        );
    }
}


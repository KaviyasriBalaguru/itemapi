package com.example.e_commerceitemapi;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {

    ArrayList<Item> items = new ArrayList<>();

    @PostMapping(consumes = "application/json")
    public String addItem(@RequestBody Item item) {

        if (item.getName() == null || item.getName().isEmpty()) {
            return "Item name is required";
        }

        items.add(item);
        return "Item added successfully";
    }

    @GetMapping("/{id}")
    public Item getItemById(@PathVariable int id) {
        for (Item item : items) {
            if (item.getId() != null && item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

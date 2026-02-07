package com.example.itemapi.service;

import com.example.itemapi.model.Item;
import com.example.itemapi.exception.ItemNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final List<Item> itemList = new ArrayList<>();
    private Long idCounter = 1L;

    public Item addItem(Item item) {
        item.setId(idCounter++);
        itemList.add(item);
        return item;
    }

    public Item getItemById(Long id) {
        return itemList.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElseThrow(() ->
                        new ItemNotFoundException("Item not found with id: " + id));
    }
}

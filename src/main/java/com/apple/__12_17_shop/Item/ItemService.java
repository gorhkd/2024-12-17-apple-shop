package com.apple.__12_17_shop.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void create(String title, Integer price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        item.setCreateDate(LocalDateTime.now());
        this.itemRepository.save(item);
    }

}

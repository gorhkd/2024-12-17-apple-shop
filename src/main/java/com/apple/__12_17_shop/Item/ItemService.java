package com.apple.__12_17_shop.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void create(Item item) {
        item.setTitle(item.getTitle());
        item.setPrice(item.getPrice());
        item.setCreateDate(LocalDateTime.now());
        this.itemRepository.save(item);
    }

    public Item findId(Integer id) {
        Item item = this.itemRepository.findById(id).get();
       return item;
    }


    public List<Item> findAll() {
        return this.itemRepository.findAll();
    }
}

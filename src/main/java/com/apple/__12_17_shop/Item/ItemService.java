package com.apple.__12_17_shop.Item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public void save(String title, Integer price) {
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        item.setCreateDate(LocalDateTime.now());
        this.itemRepository.save(item);
    }

    public Item findId(Integer id) {
        Optional<Item> i = this.itemRepository.findById(id);
        if(i.isPresent()){
            Item item = i.get();
            return item;
            }
        return null;
    }


    public List<Item> findAll() {
       return this.itemRepository.findAll();
    }
}

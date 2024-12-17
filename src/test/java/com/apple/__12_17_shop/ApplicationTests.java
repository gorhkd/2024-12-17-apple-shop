package com.apple.__12_17_shop;

import com.apple.__12_17_shop.Item.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private ItemRepository itemRepository;

	@Test
	void contextLoads() {
	}

}

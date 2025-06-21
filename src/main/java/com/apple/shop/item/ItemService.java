package com.apple.shop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public void saveItem(String title, Integer price) {
        checkItemParm(title, price);
        Item item = new Item();
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);
    }

    public void updateItem(Long id, String title, Integer price) {
        checkItemParm(title, price);
        Item item = new Item();
        item.setId(id);
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

    void checkItemParm(String title, Integer price) {
        if (title.length() > 20) {
            throw new IllegalArgumentException("아이템 이름이 너무 길어요.");
        }
        if (price < 0) {
            throw new RuntimeException("음수 입니다.");
        }
    }
}

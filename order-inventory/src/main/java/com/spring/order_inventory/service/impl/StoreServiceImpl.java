package com.spring.order_inventory.service.impl;

import com.spring.order_inventory.dto.StoreResponseDto;
import com.spring.order_inventory.entity.Store;
import com.spring.order_inventory.repository.StoreRepository;
import com.spring.order_inventory.service.IStoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.spring.order_inventory.entity.Order;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreServiceImpl implements IStoreService {

    private final StoreRepository storeRepository;

    @Override
    public StoreResponseDto getStoreById(Integer storeId) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("Store not found with id: " + storeId));

        return StoreResponseDto.builder()
                .storeId(store.getStoreId())
                .storeName(store.getStoreName())
                .webAddress(store.getWebAddress())
                .physicalAddress(store.getPhysicalAddress())
                .latitude(store.getLatitude())
                .longitude(store.getLongitude())
                .build();
    }

    @Override
    public List<Order> getOrdersByStoreId(Integer storeId) {
        return List.of(); // placeholder for now
    }
}
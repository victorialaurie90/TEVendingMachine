package com.techelevator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

import org.junit.Assert;
import org.junit.Test;

public class InventoryReaderTests {

    @Test
    public void testInventoryReader() {
        InventoryReader inventoryReader = new InventoryReader();
        SortedMap<String, List<Product>> testSortedMap = inventoryReader.fileImporter();

        Product product = testSortedMap.get("A1").get(0);
        Assert.assertEquals("Potato Crisps", product.getName());
        Assert.assertEquals(new BigDecimal("3.05"), product.getPrice());
        Assert.assertEquals(true, testSortedMap.containsKey("A1"));
    }
}
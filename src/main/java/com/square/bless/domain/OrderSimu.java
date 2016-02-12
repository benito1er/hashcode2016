package com.square.bless.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.square.bless.io.TaskManager;

public class OrderSimu {

	public void compute(TaskManager task) {
		Map<ProductType, Map<Warehouse, Integer>> pdTypeWareHouse = new HashMap<ProductType, Map<Warehouse, Integer>>();
		for (Warehouse w : task.getWarehouses()) {
			for (Map.Entry<Product, Integer> productEntry : w.storages.entrySet()) {
				Product product = productEntry.getKey();
				Integer q = productEntry.getValue();
				ProductType pdType = product.pdtype;
				Map<Warehouse, Integer> ws = pdTypeWareHouse.get(pdType);
				if (ws == null) {
					ws = new HashMap<Warehouse, Integer>();
					ws.put(w, q);
				}
				pdTypeWareHouse.put(pdType, ws);
			}
		}
		Map<ProductType, Map<Order, List<Warehouse>>> orderAndProductTypes = new HashMap<ProductType, Map<Order, List<Warehouse>>>();
		for (Order o : task.getOrders()) {
			for (Product p : o.getProducts()) {
				ProductType pt = p.getPdtype();
				Map<Order, List<Warehouse>> orderMaps = orderAndProductTypes.get(pt);
				if (orderMaps == null) {
					orderMaps = new HashMap<Order, List<Warehouse>>();
				}
				List<Warehouse> availiableOrderWarehouse = orderMaps.get(o);
				if (availiableOrderWarehouse == null) {
					availiableOrderWarehouse = new ArrayList<Warehouse>();
					orderMaps.put(o, availiableOrderWarehouse);
				}

			}

		}

	}

}

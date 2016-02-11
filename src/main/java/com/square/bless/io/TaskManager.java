package com.square.bless.io;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import com.square.bless.domain.Order;
import com.square.bless.domain.Product;
import com.square.bless.domain.ProductType;
import com.square.bless.domain.Warehouse;

public class TaskManager {
	int nbRows;
	int nbCol;
	int nbDrones;
	int nbTurns;
	int maxU;
	Order [] orders;
	Warehouse[] warehouses;

	public void load(InputStream is) {
		Scanner scn = new Scanner(is);

		String l1 = scn.next();
		String[] l1Array = l1.split(" ");
		int nbRows = Integer.parseInt(l1Array[0]);

		int nbCol = Integer.parseInt(l1Array[1]);
		int nbDrones = Integer.parseInt(l1Array[2]);
		int nbTurns = Integer.parseInt(l1Array[3]);
		int maxU = Integer.parseInt(l1Array[4]);

		int nbProductType = Integer.parseInt(scn.next());
		String[] prdTypeL = scn.next().split(" ");
		LinkedList<ProductType> productTypes = new LinkedList<ProductType>();
		for (int i = 0; i < nbProductType; i++) {
			int u = Integer.parseInt(prdTypeL[i]);
			ProductType p = new ProductType(i, u);
			productTypes.add(p);
		}
		ProductType[] pdTypeArray = (ProductType[]) (productTypes.toArray());
		// TaskManager task = new TaskManager(nbRows,nbCol,nbDrones, m);
		int nbWareHouse = Integer.parseInt(scn.next());
		LinkedList<Warehouse> wareHouses = new LinkedList<Warehouse>();
		for (int i = 0; i < nbWareHouse; i++) {
			String[] coord = scn.next().split(" ");
			int x = Integer.parseInt(coord[0]);
			int y = Integer.parseInt(coord[1]);
			String[] pdLines = scn.next().split(" ");
			Warehouse w = new Warehouse(x, y);
			Map<Product, Integer> storages = new HashMap<Product, Integer>();
			for (int j = 0; j < nbProductType; j++) {
				Integer q = Integer.parseInt(pdLines[j]);
				Product p = new Product(pdTypeArray[j]);
				storages.put(p, q);
			}
			w.setStorages(storages);
			wareHouses.add(w);
		}
		
		Order [] orders = Order.loadAll(scn);

		this.nbRows = (nbRows);
		this.nbCol = (nbCol);
		this.nbDrones = (nbDrones);
		this.nbTurns = (nbTurns);
		this.maxU = (maxU);
		this.orders = orders;
		this.warehouses = ((Warehouse[]) wareHouses.toArray());


		scn.close(); // => also close InputStream!
	}

	public void setRows(int nbRows) {
		this.nbRows = nbRows;

	}

	public void setCol(int nbCol) {
		this.nbCol = nbCol;

	}

	public void setNbDrones(int nbDrones) {
		this.nbDrones = nbDrones;

	}

	public void setNbTurns(int nbTurns) {
		this.nbTurns = nbTurns;

	}

	public void setMaxPayLoad(int maxU) {
		this.maxU = maxU;

	}

	public void setWareHouses(Warehouse[] warehouses) {
		this.warehouses = warehouses;

	}

}

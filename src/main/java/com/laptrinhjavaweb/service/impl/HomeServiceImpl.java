package com.laptrinhjavaweb.service.impl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.laptrinhjavaweb.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public List<String> loadMenu() {
		List<String> menus = new ArrayList<>();
		menus.add("blog java web");
		menus.add("Hướng dẫn học java web");
		return menus;
	}

}

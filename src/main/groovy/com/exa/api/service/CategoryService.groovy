package com.exa.api.service

import com.exa.api.entity.Category

interface CategoryService {
  List<Category> findAll();
}